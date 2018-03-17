package com.jml.design.adaptor;

public class WrapperTest {
    public static void main(String[] args) {
        Targetable targetable = new Wrapper(new Source());
        targetable.method2();
        targetable.method1();
    }
}
