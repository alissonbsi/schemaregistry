package com.registry.service;

import com.registry.avro.business.BusinessRule;
import com.registry.dto.BusinessRuleDTO;
import com.registry.dto.CommonDTO;
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
public class BusinessRuleService implements MessagingPort<BusinessRule> {

	private final Producer<String, BusinessRule> producer;

	@Override
	public String topic() {
		return "business-avro";
	}

	@Autowired
	public BusinessRuleService(@Qualifier("businessproducer") Producer<String, BusinessRule> producer) {
		this.producer = producer;
	}

	@Override
	public ProducerRecord<String, BusinessRule> createProducerRecord(BusinessRule businessRule) {

		return new ProducerRecord<>(this.topic(), businessRule);
		
	}

	@Override
	public void send(CommonDTO dto) {
		
		Random rd = new Random();

		var business = BusinessRule.newBuilder()
//				.setName(((BusinessRuleDTO) dto).getNome())
				.setRole(((BusinessRuleDTO) dto).getRole())
				.build();
		
		
		producer.send(this.createProducerRecord(business), (rm, ex) -> {
			if (ex == null) {
				log.info("Data sent with success!!!");
			} else {
				log.error("Fail to send message", ex);
			}
		});

		producer.flush();

	}
}
