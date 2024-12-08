package com.example.kafkaexemple.service;


import com.example.kafkaexemple.config.KafkaProducer;
import com.example.kafkaexemple.model.MessageRequest;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    private final KafkaProducer kafkaMessageProducer;

    public KafkaService(KafkaProducer kafkaMessageProducer) {
        this.kafkaMessageProducer = kafkaMessageProducer;
    }
    public void sendMessageAndPublishEvent(MessageRequest message) {
        // Logic to send the message

        // Once the message is sent, publish an event to Kafka
        kafkaMessageProducer.sendMessage(message);
    }

}
