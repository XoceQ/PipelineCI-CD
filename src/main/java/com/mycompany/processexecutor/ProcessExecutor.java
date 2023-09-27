/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.processexecutor;

import java.util.Random;

/**
 *
 * @author Janus
 */
public class ProcessExecutor {

    public void execute(String name) {
        Random random = new Random();

        for (int i = 1; i <= 15; i++) {
            System.out.println("Hello, I am " + name + " and I am printing the number " + i);
            try {
                int randomSleepTime = random.nextInt(5) + 1;
                Thread.sleep(randomSleepTime * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ProcessExecutor <NAME>");
            System.exit(1);
        }

        String name = args[0];
        ProcessExecutor executor = new ProcessExecutor();
        executor.execute(name);
    }
}
