package com.dop6.lab2;

public class TollWheels extends CarDecorator {

    Car mCar;

    TollWheels(Car car) {
        mCar = car;
    }

    @Override
    public String getCarInfo() {
        return mCar.getCarInfo() + " с крутыми колесами";
    }

    @Override
    public int getPrice() {
        return mCar.getPrice() + 5000;
    }
}
