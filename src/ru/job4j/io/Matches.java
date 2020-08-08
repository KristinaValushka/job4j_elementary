package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner firstPlayer = new Scanner(System.in);
        int matches = 11;
        boolean playerNumber = true;
        while (playerNumber) {
            System.out.println("Ходит " + (playerNumber ? "первый" : "второй")
                    + " игрок");
            int numberOfOnePlayer = Integer.valueOf(firstPlayer.nextLine());

            if (numberOfOnePlayer > 0 && numberOfOnePlayer < 4) {
                playerNumber = true ? false : true;

                matches -= numberOfOnePlayer;

                System.out.println("Осталось " + matches + " спичек");
            }
        }
    }
}
