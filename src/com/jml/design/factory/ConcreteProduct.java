package com.jml.design.factory;

public class ConcreteProduct implements Product {

    @Override
    public void someMethod() {
        System.out.println("concreteProduct do some valuable things.");
    }
}
