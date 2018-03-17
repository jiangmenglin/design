package com.jml.design.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory pf = FactoryMarker.getFactory("a");
        AbstractProductA a1 = pf.createProductA();
        pf = FactoryMarker.getFactory("b");
        AbstractProductB b2 = pf.createProductB();
    }
}
