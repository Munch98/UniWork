package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCountRunnable implements java.lang.Runnable {
    private String fileName;

    public WordCountRunnable(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try (Scanner sc = new Scanner(new File(fileName))) {
            int count = 0;
            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            System.out.println("Number of words: " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}