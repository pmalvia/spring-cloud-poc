package com.prafull.poc.springcloud.service.message.service;

import com.prafull.poc.springcloud.service.message.model.Message;
import com.prafull.poc.springcloud.service.message.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    private MessageRepository messageRepository;

    public Optional<Message> getMessageById(Long id) {
        return messageRepository.findById(id);
    }

    public Optional<Message> getMessageByUserName(String userName) {
        return messageRepository.findByUserName(userName);
    }

    public List<Message> getMessages() {
        List<Message> messages = new ArrayList<>();
        messageRepository.findAll().forEach(
                message -> messages.add(message)
        );
        return messages;
    }

    public boolean addMessage(Message message) {
        messageRepository.save(message);
        return true;
    }

}
