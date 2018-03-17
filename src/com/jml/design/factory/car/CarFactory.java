package com.jml.design.factory.car;

public class CarFactory extends AbstractFactory {

    @Override
    public Car produce(Type type) {
        AirConditionner airConditionner = new AirConditionner(type);
        Motor motor = new Motor(type);
        return new Car(airConditionner, motor);
    }
}
