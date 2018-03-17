package com.jml.design.adaptor;

public class Adaptor extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method.");
    }
}
