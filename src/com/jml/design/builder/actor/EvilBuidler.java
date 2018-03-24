package com.jml.design.builder.actor;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class EvilBuidler extends ActorBuilder {
    @Override
    protected void buildeType() {
        actor.setType("恶魔");
    }

    @Override
    protected void buildeSex() {
        actor.setSex("妖");
    }

    @Override
    protected void buildeFace() {
        actor.setFace("丑陋");
    }

    @Override
    protected void buildeCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    protected void buildeHairstyle() {
        actor.setHairstyle("光头");
    }
}
