package com.dop6.lab2;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String TXT_BORDER = "=================================";

    public static void main(String[] args) {

        System.out.println("======= 8T6B MUMINOV N.K. =======");

        Car nissanTitan = new NissanTitan();

        Car nissanMicra = new NissanMicra();
        nissanMicra = new TollWheels(nissanMicra);https://github.com/Muminov777/lab
        nissanMicra = new PowerfulEngine(nissanMicra);

        Car toyotaTundra = new ToyotaTundra();
        toyotaTundra = new AirConditioning(toyotaTundra);

        Car toyotaYaris = new ToyotaYaris();
        toyotaYaris = new PowerfulEngine(toyotaYaris);

        List<Car> cars = Arrays.asList(nissanTitan, nissanMicra, toyotaTundra, toyotaYaris);
        for (Car car : cars) {
            System.out.println(car.getCarInfo() + ". Цена: " + car.getPrice());
            System.out.println(TXT_BORDER);
        }
    }
}