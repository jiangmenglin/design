package com.jml.design.factory;

public class Client {
    public static void main(String[] args) {
        Creater creater = new ConcreteCreate();
        Product p = creater.anOperation();
        p.someMethod();
     }
}
