package com.leonardobufalo.rabbitproducer.service.implementation;

import com.leonardobufalo.rabbitproducer.amqp.AmqpProducer;
import com.leonardobufalo.rabbitproducer.dto.Message;
import com.leonardobufalo.rabbitproducer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmqpServiceImpl implements AmqpService {

    @Autowired
    private AmqpProducer<Message> amqp;

    @Override
    public void sendToConsumer(Message message) {
        amqp.producer(message);
    }
}
