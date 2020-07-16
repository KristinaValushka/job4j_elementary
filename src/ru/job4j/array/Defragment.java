package ru.job4j.array;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index; /* указатель на null ячейку. */
               /* переместить первую не null ячейку. Нужен цикл. */
                if(array[index] != 0) {
                    int notNullIndex = index;
                    swap(array, nullIndex, notNullIndex);
                }

            }

            System.out.print(array[index] + " ");
        }
        return array;
    }


    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
