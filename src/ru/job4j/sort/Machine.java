package ru.job4j.sort;
import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int rest = money - price;
        for (int i = 0; i < coins.length; i++) {

            while (rest > 0) {
                rest = rest - coins[i];
                size++;
                rsl[i] = coins[i++];
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        Machine machine = new Machine();
        int[] rsl = machine.change(100, 50);
    }
}
