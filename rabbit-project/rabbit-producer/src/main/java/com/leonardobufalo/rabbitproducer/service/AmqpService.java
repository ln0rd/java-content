package com.leonardobufalo.rabbitproducer.service;

import com.leonardobufalo.rabbitproducer.dto.Message;

public interface AmqpService {

    void sendToConsumer(Message message);

}
