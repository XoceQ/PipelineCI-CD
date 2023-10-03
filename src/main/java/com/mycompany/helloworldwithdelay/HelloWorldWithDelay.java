/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.helloworldwithdelay;

import java.util.Random;

/**
 *
 * @author Janus
 */
public class HelloWorldWithDelay {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java HelloWorldWithDelay <NAME>");
            System.exit(1);
        }

        String name = args[0];
        Random random = new Random();

        int iteration = 1;
        while (true) {
            int randomNumber = random.nextInt(5) + 1; // Generate a random number between 1 and 5
            System.out.println("Hello, I am " + name + " and I am printing the number " + iteration);
            iteration++;

            try {
                Thread.sleep(randomNumber * 1000); // Sleep for the random number of seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

