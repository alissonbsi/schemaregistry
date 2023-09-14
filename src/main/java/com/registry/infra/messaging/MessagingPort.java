package com.registry.infra.messaging;

import com.registry.dto.CommonDTO;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.clients.producer.ProducerRecord;

public interface MessagingPort<T extends SpecificRecordBase> {
	
	String topic();
	
	ProducerRecord<String, T> createProducerRecord(T type);
	
	void send(CommonDTO commonDTO);
}
