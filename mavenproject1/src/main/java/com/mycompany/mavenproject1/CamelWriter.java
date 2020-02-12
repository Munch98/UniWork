package com.mycompany.mavenproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CamelWriter {

    private File inFile;

    public CamelWriter(String fName) {
        this.inFile = new File("/home/xps/MEGA/VOP/Lesson 2 VOP/" + fName);
    }

    public void readLines() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(inFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                convert2camel(line);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private void convert2camel(String line) {
        String[] split = line.split(" ");
        String camelCase = "";
        String firstWord = "";
        String finalLine = "";
        for (int i = 0; i < split.length; i++) {
            if (i > 0) {
                camelCase = split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
                finalLine += camelCase;
            } else {
                firstWord = split[0].toLowerCase();
                finalLine += firstWord;
            }

        }
        System.out.println(finalLine);
    }

    public static void main(String[] args) {
        CamelWriter cw = new CamelWriter("MaryAnn.txt");
        cw.readLines();

    }

}
