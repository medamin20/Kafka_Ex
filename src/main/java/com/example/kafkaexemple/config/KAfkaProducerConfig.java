package com.example.kafkaexemple.config;


import com.example.kafkaexemple.model.MessageRequest;
import com.fasterxml.jackson.databind.JsonSerializer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KAfkaProducerConfig {


    @Bean
    public ProducerFactory<String, MessageRequest> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "DESKTOP-4ICCSEP:9092");
        // Other Kafka configurations...

        // Use JsonSerializer for values
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    public KafkaTemplate<String, MessageRequest> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }
}
