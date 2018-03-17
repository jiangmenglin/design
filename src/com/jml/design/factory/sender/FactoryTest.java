package com.jml.design.factory.sender;

public class FactoryTest {

    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();

        Sender sender = factory.produce("mail");
        sender.send();
        sender = factory.produce("sms");
        sender.send();
    }
}
