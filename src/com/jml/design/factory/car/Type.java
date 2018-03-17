package com.jml.design.factory.car;

public enum Type {
    A("A series"), B("B series");

    private String type;

    private Type(String type) {
        this.type = type;
    }
}
