package ru.job4j.array;

public class CrossArray {
        public static void printCrossEl(int[] left, int[] right) {
            for (int row = 0; row < left.length; row++) {
                for (int cell = 0; cell < right.length; cell++) {
                    if (left[row] == right[cell]) {
                        System.out.println(left[row]);
                    }
                }
            }

        }
    public static void main(String[] args) {
        CrossArray.printCrossEl(
                new int[] {1, 3},
                new int[] {2, 1}
        );
    }
}
