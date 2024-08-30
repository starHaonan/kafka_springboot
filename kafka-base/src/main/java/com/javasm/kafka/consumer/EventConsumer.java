package com.javasm.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author zhaohaonan
 * @since 2024/8/30
 */
@Slf4j
@Component
public class EventConsumer {

    /**
     * 采用监听的方式接受事件（消息、数据）
     *
     * @param event 事件
     */
    @KafkaListener(topics = {"hello-topic", "test-topic"}, groupId = "group-id-1")
    public void onEvent(String event) {
        log.info("接收到事件：{}", event);
    }

}