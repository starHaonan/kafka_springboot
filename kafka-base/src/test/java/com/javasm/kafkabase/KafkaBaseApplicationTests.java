package com.javasm.kafkabase;

import com.javasm.kafka.KafkaBaseApplication;
import com.javasm.kafka.producer.EventProduce;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = KafkaBaseApplication.class)
class KafkaBaseApplicationTests {

    @Autowired
    private EventProduce eventProduce;

    @Test
    void contextLoads() {
        eventProduce.sendEvent();
    }

}
