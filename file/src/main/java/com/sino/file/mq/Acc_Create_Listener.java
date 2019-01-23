package com.sino.file.mq;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Acc_Create_Listener {
    @KafkaListener(topics = "acc_create")
    public void acc_create_listener(ConsumerRecord<?,?> record) throws Exception
    {
        System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
    }
}
