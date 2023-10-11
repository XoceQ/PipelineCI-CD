package org.example;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java HelloWorldWithDelay <NAME>");
            System.exit(1);
        }

        String name = args[0];
        Random random = new Random();

        for (int i = 1; i <= 15; i++) {
            System.out.println("Hello, I am " + name + " and I am printing the number " + i);
            int randomDelay = random.nextInt(5) + 1;

            try {
                Thread.sleep(randomDelay * 1000); // Sleep for a random number of seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}