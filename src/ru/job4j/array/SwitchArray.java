package ru.job4j.array;



public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int save = array[source];
        array[source] = array[dest];
        array[dest] = save;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }

        int[] num = new int[]{6, 5, 4, 3, 2, 1};
        int[] rs = swap(num, 2, num.length - 1);
        for (int index = 0; index < rs.length; index++) {
            System.out.println(rs[index]);
        }
    }
}
