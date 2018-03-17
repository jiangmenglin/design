package com.jml.design.factory.abstract_factory;

public abstract class AbstractProductB {

    public abstract void operationB1();

    public abstract void operationB2();
}

class ProductB1 extends AbstractProductB {

    ProductB1(String tar) {
        System.out.println(String.format("Hello %s", tar));
    }

    @Override
    public void operationB1() {

    }

    @Override
    public void operationB2() {

    }
}

class ProductB2 extends AbstractProductB {

    ProductB2(String tar) {
        System.out.println(String.format("Hello %s", tar));
    }

    @Override
    public void operationB1() {

    }

    @Override
    public void operationB2() {

    }
}
