package com.example.kafkaexemple.config;


import com.example.kafkaexemple.model.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

//@Configuration
@Component
public class KafkaProducer {


    private final KafkaTemplate<String, MessageRequest> kafkaTemplate;


    public KafkaProducer(KafkaTemplate<String, MessageRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(MessageRequest message) {
        // Send the message object as an event to a Kafka topic
        kafkaTemplate.send("events", message);
    }


//    @Value("${spring.kafka.bootstrap-servers}")
//    private String bootstrapServers;
//
//    public Map<String,Object> producerConfig(){
//
//        Map<String,Object> props = new HashMap<>();
//        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        return props ;
//
//    }
//
//




    //create kafka producers
//    @Bean
//    public ProducerFactory<String,String> producerFactory(){
//
//        return new DefaultKafkaProducerFactory<>(producerConfig());
//
//    }
//    //send messages
//    @Bean
//    public KafkaTemplate<String,String> kafkaTemplate(ProducerFactory<String,String> producerFactory){
//
//        return  new KafkaTemplate<>(producerFactory);
//
//    }


}
