package com.jml.design.factory;

public class ConcreteCreate extends Creater {
    @Override
    protected Product factoryMethod() {
        System.out.println("Begin init an Object of ConcreteCreate.");
        return new ConcreteProduct();
    }
}
