package com.prafull.poc.springcloud.service.message.repository;

import com.prafull.poc.springcloud.service.message.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {
    Optional<Message> findByUserName(String userName);
}
