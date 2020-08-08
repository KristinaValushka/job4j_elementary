package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner firstPlayer = new Scanner(System.in);
        int matches = 11;
        boolean playerNumber = true;
        while (matches > 0) {
            System.out.println("Ходит " + (playerNumber ? "первый" : "второй")
                    + " игрок");
            int numberOfPlayer = Integer.valueOf(firstPlayer.nextLine());

            if (numberOfPlayer > 0 && numberOfPlayer < 4) {
                playerNumber = playerNumber ? false : true;

                matches -= numberOfPlayer;

                System.out.println("Осталось " + matches + " спичек");
            }
            if (matches <= 0) {
                System.out.println("Игрок " + (playerNumber ? 2 : 1) + " победил");
                break;
            }

        }
    }
}
