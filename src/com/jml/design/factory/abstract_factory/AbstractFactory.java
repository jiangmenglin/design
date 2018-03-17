package com.jml.design.factory.abstract_factory;

public abstract class AbstractFactory {
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductB();
}

class ConcreteFactory1 extends AbstractFactory {

    @Override
    AbstractProductA createProductA() {
        return new ProductA1("prodcutA1");
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1("prodcutB1");
    }
}

class ConcreteFactory2 extends AbstractFactory {

    @Override
    AbstractProductA createProductA() {
        return new ProductA2("productA2");
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB2("productB2");
    }
}

class FactoryMarker {
    private static AbstractFactory pf = null;

    static AbstractFactory getFactory(String choice) {
        if(choice.equals("a"))
            pf = new ConcreteFactory1();
        else if (choice.equals("b"))
            pf = new ConcreteFactory2();
        return pf;
    }
}
