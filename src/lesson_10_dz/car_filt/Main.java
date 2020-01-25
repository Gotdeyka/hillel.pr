package lesson_10_dz.car_filt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> someList = new ArrayList<Car>();

        someList.add(new Car("Sedan", 18));
        someList.add(new Car("NotSedan", 20));
        someList.add(new Car("Sedan", 20));
        someList.add(new Car("NotSedan", 20));
        someList.add(new Car("Sedan", 20));
        someList.add(new Car("NotSedan", 20));
        someList.add(new Car("Sedan", 20));
        someList.add(new Car("NotSedan", 20));
        someList.add(new Car("Sedan", 20));
        someList.add(new Car("NotSedan", 20));

        Car[] array = new Car[15];
    }
}