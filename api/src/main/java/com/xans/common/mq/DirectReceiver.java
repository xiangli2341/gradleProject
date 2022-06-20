package com.xans.common.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;



@Component
public class DirectReceiver {
 
    @RabbitHandler
    @RabbitListener(queues = "test.queue")
    public void process(String message) {
        System.out.println("DirectReceiver消费者收到消息  : " + message);
    }

 
}