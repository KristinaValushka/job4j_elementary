package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {

    }

    public int calc(int n) {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("n should be less then zero.");
        }
                for (int index = 1; index <= n; index++) {
                rsl *= index;
            }
            return rsl;
        }
    }


