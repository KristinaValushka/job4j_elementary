package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {

        for (int i = 0; i < left.length; i++) {
            return left[left.length - 1] == right[right.length - 1];
        }
        return false;
    }

    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int[] second  = {5, 4, 3};
        EqLast.check(first, second);

    }
}
