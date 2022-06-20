package com.xans.common.service.impl;

import com.xans.common.enums.QueueEnum;
import com.xans.common.service.BaseService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Override
    public String sendStr() {
        String str="Hi";
        rabbitTemplate.convertAndSend(QueueEnum.TEST_QUEUE.getExchange(), QueueEnum.TEST_QUEUE.getRouteKey(), str);
        return str;
    }

}
