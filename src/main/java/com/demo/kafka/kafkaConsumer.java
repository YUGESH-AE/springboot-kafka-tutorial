package com.demo.kafka;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {

    static Logger logger= LogManager.getLogger(kafkaConsumer.class);

    @KafkaListener(topics = "JavaTutorial",groupId = "mygroup")
    public void consume(String message){
        logger.info("message receieved:{}",message);
    }
}
