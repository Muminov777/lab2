package com.dop6.lab2;

public class AirConditioning extends CarDecorator {

    Car mCar;

    AirConditioning(Car car) {
        mCar = car;
    }

    @Override
    public String getCarInfo() {
        return mCar.getCarInfo() + " с кондиционером";
    }

    @Override
    public int getPrice() {
        return mCar.getPrice() + 2000;
    }
}
