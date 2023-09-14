package com.registry.service;

import com.google.gson.Gson;
import com.registry.avro.Product;
import com.registry.avro.RecordPoc;
import com.registry.avro.business.BusinessRule;
import com.registry.dto.CommonDTO;
import com.registry.dto.RecDTO;
import com.registry.infra.messaging.MessagingPort;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class RecService implements MessagingPort<RecordPoc> {

	private final Producer<String, RecordPoc> producer;

	@Override
	public String topic() {
		return "record-avro";
	}

	@Autowired
	public RecService(@Qualifier("recordproducer") Producer<String, RecordPoc> producer) {
		this.producer = producer;
	}

	@Override
	public ProducerRecord<String, RecordPoc> createProducerRecord(RecordPoc recordPoc) {

		return new ProducerRecord<>(this.topic(), recordPoc);
		
	}

	@Override
	public void send(CommonDTO dto) {
		
		Random rd = new Random();
		var rec = RecordPoc.newBuilder().setType(((RecDTO) dto).getType());

		Gson gson = new Gson();

		if(rec.getType().equals("Product")) {
			 var product = gson.fromJson(((RecDTO) dto).getRaw().toString(), Product.class);
			 rec.setRaw(product);
		} else {
			var businessRule = gson.fromJson(((RecDTO) dto).getRaw().toString(), BusinessRule.class);
			rec.setRaw(businessRule);
		}
		
		producer.send(this.createProducerRecord(rec.build()), (rm, ex) -> {
			if (ex == null) {
				log.info("Data sent with success!!!");
			} else {
				log.error("Fail to send message", ex);
			}
		});

		producer.flush();

	}
}
