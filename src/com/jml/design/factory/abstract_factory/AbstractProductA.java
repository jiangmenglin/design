package com.jml.design.factory.abstract_factory;

public abstract class AbstractProductA {

    public abstract void operationA1();

    public abstract void operationA2();
}


class ProductA1 extends AbstractProductA {

    ProductA1(String tar) {
        System.out.println(String.format("Hello %s", tar));
    }

    @Override
    public void operationA1() {

    }

    @Override
    public void operationA2() {

    }
}

class ProductA2 extends AbstractProductA {

    ProductA2(String tar) {
        System.out.println(String.format("Hello %s", tar));
    }

    @Override
    public void operationA1() {

    }

    @Override
    public void operationA2() {

    }
}
