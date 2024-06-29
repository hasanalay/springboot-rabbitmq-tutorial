package com.hasanalay.springboot.consumer;

import com.hasanalay.springboot.dto.User;
import com.hasanalay.springboot.publisher.RabbitMQProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQProducer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consume(User user){
        LOGGER.info(String.format("Json Message received -> %s", user));
    }
}
