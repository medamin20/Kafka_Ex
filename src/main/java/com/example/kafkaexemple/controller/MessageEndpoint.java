package com.example.kafkaexemple.controller;


import com.example.kafkaexemple.model.MessageRequest;
import com.example.kafkaexemple.service.KafkaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class MessageEndpoint {



    private final KafkaService kafkaService;

    public MessageEndpoint(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
    }


    @PostMapping("/send")
    public String sendMessage(@RequestBody MessageRequest message) {
        // Logic to process the message

        // Once the message is processed, trigger Kafka event
        kafkaService.sendMessageAndPublishEvent(message);

        return "Message sent and Kafka event triggered successfully!";
    }
    }

