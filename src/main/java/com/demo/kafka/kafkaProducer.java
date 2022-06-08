package com.demo.kafka;

import org.apache.kafka.common.protocol.types.Field;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class kafkaProducer {

    static Logger logger= LogManager.getLogger(kafkaProducer.class);

    private KafkaTemplate<String,String> kafkaTemplate;

    public kafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        logger.info("Message sent:{}",message);
        kafkaTemplate.send("JavaTutorial",message);
    }
}
