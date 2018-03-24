package com.jml.design.builder.actor;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    protected abstract void buildeType();

    protected abstract void buildeSex();

    protected abstract void buildeFace();

    protected abstract void buildeCostume();

    protected abstract void buildeHairstyle();

    public Actor createActor() {
        return actor;
    }
}
