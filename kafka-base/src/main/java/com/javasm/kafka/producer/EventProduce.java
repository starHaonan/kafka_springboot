package com.javasm.kafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author zhaohaonan
 * @since 2024/8/30
 */
@Component
@RequiredArgsConstructor
public class EventProduce {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendEvent() {
        kafkaTemplate.send("hello-topic", "message: hello-kafka ");
    }

}