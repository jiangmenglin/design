package com.jml.design.factory;

public abstract class Creater {

    public Product anOperation() {
        Product product = factoryMethod();
        return product;
    }

    protected abstract Product factoryMethod();
}
