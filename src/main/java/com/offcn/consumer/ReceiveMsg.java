package com.offcn.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveMsg {
    @JmsListener(destination = "offcn")
    public void readMessage(String text){
        System.out.println("接收消息:"+text);
    }
}
