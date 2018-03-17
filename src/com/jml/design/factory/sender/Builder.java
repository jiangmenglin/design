package com.jml.design.factory.sender;

import java.util.ArrayList;
import java.util.List;

public class Builder {

    private List<Sender> list;

    public void produceMailSender(int count) {
        for (int i = 0;i < count;i++) {
            if(list == null)
                list = new ArrayList<>();
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0;i < count;i++) {
            if(list == null)
                list = new ArrayList<>();
            list.add(new SmsSender());
        }
    }
}
