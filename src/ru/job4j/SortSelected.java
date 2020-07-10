package ru.job4j;

import ru.job4j.array.FindLoop;
import ru.job4j.array.MinDiapason;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop.indexOf(data, min, 0, data.length);
             int per = data[i];
             data[i] = data[index];
             data[index] = per;

        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = {3, 4, 1, 2, 5};
        System.out.println(SortSelected.sort(data));
    }
}
