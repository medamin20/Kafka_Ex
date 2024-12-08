package com.example.kafkaexemple;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }


//publishing messages
//    @Bean
//    CommandLineRunner commadLineRunner(KafkaTemplate<String,String> KafkaTemplate){
//
//        return args -> {
//
//            for(int i=0 ; i<1_000;i++) {
//
//                KafkaTemplate.send("events", "hello its Json:Api"+i);
//            }
//        };
//    }

}
