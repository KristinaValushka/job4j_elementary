package ru.job4j.array;


import static com.sun.tools.javac.jvm.ByteCodes.swap;


public class Defragment {
         public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index;

                for (int i = nullIndex + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        int notNullIndex = i;
                        swap(array, nullIndex, notNullIndex);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    private static void swap(String[] array, int nullIndex, int notNullIndex) {
        String save = array[nullIndex];
        array[nullIndex] = array[notNullIndex];
        array[notNullIndex] = save;

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
