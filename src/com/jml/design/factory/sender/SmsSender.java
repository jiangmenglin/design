package com.jml.design.factory.sender;

import com.jml.design.factory.sender.Sender;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
