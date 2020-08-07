package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public class RandomNumber{
        int answer = new Random().nextInt(3);
   if (answer == 0) {
        System.out.println("Да");
    } else if (answer == 1) {
        System.out.println("Нет");
    } else {
        System.out.println("Может быть");
    }
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("У тебя есть любимая игрушка?");
        String answerUser = input.nextLine();

    }
}
