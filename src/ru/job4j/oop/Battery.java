package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int rest) {
        this.load = rest;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(85);
        Battery restBattery = new Battery(5);
        battery.exchange(restBattery);
        System.out.println(battery.load);

    }
}
