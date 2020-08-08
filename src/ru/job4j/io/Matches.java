package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner firstPlayer = new Scanner(System.in);
        int matches = 11;
        int numberOfOnePlayer = Integer.valueOf(firstPlayer.nextLine());
        
        while (numberOfOnePlayer < 1 && numberOfOnePlayer > 3) {
             numberOfOnePlayer = Integer.valueOf(firstPlayer.nextLine());

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
        }

        }
    }
