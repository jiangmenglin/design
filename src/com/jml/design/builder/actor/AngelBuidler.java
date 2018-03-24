package com.jml.design.builder.actor;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class AngelBuidler extends ActorBuilder {
    @Override
    protected void buildeType() {
        actor.setType("天使");
    }

    @Override
    protected void buildeSex() {
        actor.setSex("女");
    }

    @Override
    protected void buildeFace() {
        actor.setFace("漂亮");
    }

    @Override
    protected void buildeCostume() {
        actor.setCostume("白裙");
    }

    @Override
    protected void buildeHairstyle() {
        actor.setHairstyle("披肩长发");
    }
}
