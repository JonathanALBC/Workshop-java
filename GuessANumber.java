package com.github.username.workshop;

import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int tries = 0;

        if (args.length >= 2) {
            min = Integer.parseInt(args[0]);
            max = Integer.parseInt(args[1]);
        }

        Random rand = new Random();
        int numberToGuess = rand.nextInt(max - min + 1) + min;

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between " + min + " and " + max + ":");

        while (true) {
            System.out.println("Find the number BG:");
            int guess = sc.nextInt();
            tries++;

            if (guess == numberToGuess) {
                System.out.println("You win\nIt took you " + tries + " tries!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }
    }
}
