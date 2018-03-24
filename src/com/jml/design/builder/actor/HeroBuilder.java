package com.jml.design.builder.actor;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    protected void buildeType() {
        actor.setType("英雄");
    }

    @Override
    protected void buildeSex() {
        actor.setSex("男");
    }

    @Override
    protected void buildeFace() {
        actor.setFace("英俊");
    }

    @Override
    protected void buildeCostume() {
        actor.setCostume("铠甲");
    }

    @Override
    protected void buildeHairstyle() {
        actor.setHairstyle("飘逸");
    }
}
