package com.jml.design.builder.actor;

import com.jml.design.util.XMLUtil;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        ActorBuilder builder;
        builder = (ActorBuilder) XMLUtil.getBean("builder.xml");

        ActorController controller = new ActorController();
        Actor actor;
        actor = controller.construct(builder);
        System.out.println("the actor is :" + actor);
    }
}
