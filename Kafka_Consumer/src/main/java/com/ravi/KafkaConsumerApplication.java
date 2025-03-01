package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ravi.entity.Public;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

	private final String TopicName = "public_feedback";
	
	@KafkaListener(topics = TopicName, groupId = "Feedback_Group")
	public void getFeedbackData1(Public message) throws JsonProcessingException {
		log.info("Feedback_Group consumes message data {} ",new ObjectMapper().writeValueAsString(message));
	}
	
	@KafkaListener(topics = TopicName, groupId = "Feedback_Group2")
	public void getFeedbackData2(Public message) throws JsonProcessingException {
		log.info("Feedback_Group2 consumes message data {} ",new ObjectMapper().writeValueAsString(message));
	}
	
	@KafkaListener(topics = TopicName, groupId = "Feedback_Group3")
	public void getFeedbackData3(Public message) throws JsonProcessingException {
		log.info("Feedback_Group3 consumes message data {} ",new ObjectMapper().writeValueAsString(message));
	}
	
	@KafkaListener(topics = TopicName, groupId = "Feedback_Group4")
	public void getFeedbackData4(Public message) throws JsonProcessingException {
		log.info("Feedback_Group4 consumes message data {} ",new ObjectMapper().writeValueAsString(message));
	}
	
}
