package com.jml.design.factory.sender;

public class SenderFactory {

    public Sender produce(String type) {
        if("mail".equals(type))
            return new MailSender();
        else if ("sms".equals(type))
            return new SmsSender();
        else
            System.out.println("请输入正确的类型！");
        return null;
    }

    public Sender MailProduce() {
        return new MailSender();
    }

    public Sender smsProduce() {
        return new SmsSender();
    }

    public static Sender staticMailProduce() {
        return new MailSender();
    }

    public static Sender staticSmsProduce() {
        return new SmsSender();
    }
}
