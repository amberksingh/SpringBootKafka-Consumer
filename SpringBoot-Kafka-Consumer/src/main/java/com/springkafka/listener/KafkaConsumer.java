package com.springkafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springkafka.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "Kafka_Example", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message : " + message);
	}

	@KafkaListener(topics = "Kafka_Example_json", groupId = "group_json", containerFactory = "userkafkaListenerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed JSON Message: " + user);
	}

}
