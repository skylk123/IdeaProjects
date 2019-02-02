package com.sino.file.mq;

import com.alibaba.fastjson.JSON;
import com.sino.entity.parameter.AccCreatePar;
import com.sino.file.service.AccCreateService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Acc_Create_Listener {
    @Autowired
    private AccCreateService service;
    @KafkaListener(topics = "acc_create")
    public void acc_create_listener(ConsumerRecord<?,?> record) throws Exception
    {
        service.createAcc(JSON.parseObject((String)record.value(), AccCreatePar.class));
        System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
    }
}
