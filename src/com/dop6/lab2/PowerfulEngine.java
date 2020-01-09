package com.dop6.lab2;

public class PowerfulEngine extends CarDecorator {

    Car mCar;

    PowerfulEngine(Car car) {
        mCar = car;
    }

    @Override
    public String getCarInfo() {
        return mCar.getCarInfo() + " с мощным двигателем";
    }

    @Override
    public int getPrice() {
        return mCar.getPrice() + 10000;
    }
}
