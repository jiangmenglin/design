package com.jml.design.adaptor;

public class AdaptorTest {

    public static void main(String[] args) {
        Targetable targetable = new Adaptor();
        targetable.method1();
        targetable.method2();
    }
}
