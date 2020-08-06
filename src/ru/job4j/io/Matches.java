package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner firstPlayer = new Scanner(System.in);
        Scanner secondPlayer = new Scanner(System.in);
        int matches = 11;

        while (matches >= 0) {
            System.out.println("Ходит первй игрок");
            int numberOfOnePlayer = Integer.valueOf(firstPlayer.nextLine());
            if (numberOfOnePlayer == 1) {
                matches = matches - numberOfOnePlayer;
                System.out.println("Осталось " + matches + " спичек");
            } else if (numberOfOnePlayer == 2) {
                matches = matches - numberOfOnePlayer;
                System.out.println("Осталось " + matches + " спичек");
            } else {
                matches = matches - numberOfOnePlayer;
                System.out.println("Осталось " + matches + " спичек");
            }

           System.out.println("Ходит второй игрок");
            int numberOfTwoPlayer = Integer.valueOf(secondPlayer.nextLine());
            if (numberOfOnePlayer == 1) {
                matches = matches - numberOfTwoPlayer;
                System.out.println("Осталось " + matches + " спичек");
            } else if (numberOfOnePlayer == 2) {
                matches = matches - numberOfTwoPlayer;
                System.out.println("Осталось " + matches + " спичек");
            } else {
                matches = matches - numberOfTwoPlayer;
                System.out.println("Осталось " + matches + " спичек");
            }

        }
    }
}
