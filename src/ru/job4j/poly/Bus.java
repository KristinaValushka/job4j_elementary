package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public double drive() {
        int distance = 250;
        int consumption = 8;
        int fuelConsumption = (consumption / distance) * 100;
        double cost = refueling(fuelConsumption);
        return cost;
    }

    @Override
    public int passenger(int numberOfPassenger) {
        return 0;
    }

    @Override
    public int refueling(int fuel) {
        double price = 2.59;
        double cost = fuel * price;
        return (int) cost;
    }
}
