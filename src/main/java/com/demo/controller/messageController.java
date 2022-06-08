package com.demo.controller;

import com.demo.kafka.kafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class messageController {

    @Autowired
    kafkaProducer kafkaProducer;


    @RequestMapping(method = RequestMethod.GET,value = "/publish/{message}")
    public ResponseEntity<String> publish(@PathVariable("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("message send to the topic");
    }
}
