package com.jml.design.builder.actor;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description: 游戏角色控制器 角色创建的 指挥者
 */
public class ActorController {

    //构建复杂对象
    public Actor  construct(ActorBuilder builder) {
        Actor actor;
        builder.buildeCostume();
        builder.buildeFace();
        builder.buildeHairstyle();
        builder.buildeSex();
        builder.buildeType();
        actor = builder.createActor();
        return actor;
    }
}
