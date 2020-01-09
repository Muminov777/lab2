package com.dop6.lab2;

public abstract class Car {

    String carInfo = "Unknown car";

    public String getCarInfo() {
        return carInfo;
    }

    public abstract int getPrice();
}
