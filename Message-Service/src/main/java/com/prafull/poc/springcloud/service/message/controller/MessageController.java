package com.prafull.poc.springcloud.service.message.controller;

import com.prafull.poc.springcloud.service.message.model.Message;
import com.prafull.poc.springcloud.service.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResponseEntity<Message> getMessageById(@PathVariable Integer id) {
        return new ResponseEntity(messageService.getMessageById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/{username}", produces = {"application/json"})
    public ResponseEntity<Message> getMessageByUserName(@PathVariable String username) {
        return new ResponseEntity(messageService.getMessageByUserName(username), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Message>> getMessages() {
        return new ResponseEntity(messageService.getMessages(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addMessage(@RequestBody Message message) {
        return new ResponseEntity(messageService.addMessage(message), HttpStatus.OK);
    }

}
