package com.jml.design.factory.car;

public class Car {

    private AirConditionner airConditionner;

    private Motor motor;

    public Car(AirConditionner airConditionner, Motor motor) {
        this.airConditionner = airConditionner;
        this.motor = motor;
    }
}
