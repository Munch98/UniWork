package org.example;

import java.util.Scanner;

public class WordCount {
    Scanner scanner = null;

    public static void main(String args[]) {
        String[] fileNames = {"/home/xps/NetBeansProjects/MO6 prepare/src/main/java/org/example/Novels/alice30.txt", "/home/xps/NetBeansProjects/MO6 prepare/src/main/java/org/example/Novels/Boscombe.txt", "/home/xps/NetBeansProjects/MO6 prepare/src/main/java/org/example/Novels/Snow White.txt"};
        for (int i = 0; i < fileNames.length; i++) {
            WordCountRunnable wcr = new WordCountRunnable(fileNames[i]);
// Start a Thread for the Runnable here:
            Thread thread = new Thread (wcr);
            thread.start();
        }
    }
}