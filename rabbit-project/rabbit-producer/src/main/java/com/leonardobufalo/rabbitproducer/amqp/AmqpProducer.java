package com.leonardobufalo.rabbitproducer.amqp;

public interface AmqpProducer<T> {

    void producer(T t);
}
