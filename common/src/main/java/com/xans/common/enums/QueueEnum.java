package com.xans.common.enums;

import lombok.Getter;

/**
 *
 * 队列枚举
 *
 * @author xans
 */
public enum QueueEnum {

    /**
     * 订单结算队列
     */
    TEST_QUEUE("test.exchange", "test.queue", "test.routeKey");



    /**
     * 交换名称
     */
    @Getter
    private String exchange;

    /**
     * 队列名称
     */
    @Getter
    private String name;

    /**
     * 路由键
     */
    @Getter
    private String routeKey;

    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }

}
