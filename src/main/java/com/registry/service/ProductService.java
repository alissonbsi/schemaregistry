package com.registry.service;

import com.registry.avro.Product;
import com.registry.dto.CommonDTO;
import com.registry.dto.ProductDTO;
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
public class ProductService implements MessagingPort<Product> {

	private final Producer<String, Product> producer;

	@Override
	public String topic() {
		return "product-avro";
	}

	@Autowired
	public ProductService(@Qualifier("producer") Producer<String, Product> producer) {
		this.producer = producer;
	}

	@Override
	public ProducerRecord<String, Product> createProducerRecord(Product product) {

		return new ProducerRecord<>(this.topic(), product);
		
	}

	@Override
	public void send(CommonDTO dto) {
		
		Random rd = new Random();

		var product = Product.newBuilder().setName(((ProductDTO) dto).getName())
				.setValor(((ProductDTO) dto).getValor())
				.build();
		
		
		producer.send(this.createProducerRecord(product), (rm, ex) -> {
			if (ex == null) {
				log.info("Data sent with success!!!");
			} else {
				log.error("Fail to send message", ex);
			}
		});

		producer.flush();

	}
}
