package com.softserve.academy.module16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCharExample {
    public static void main(String[] args) {
        String fileName = "notes.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("String 1\n");
            bw.write("String 2\n");
            bw.write("String 3\n");
            bw.write("String 4\n");
            bw.write("String 5\n");
            bw.write("String 6");
            bw.newLine();
            bw.write("String 7\n");
        } catch (IOException e) {
            System.err.println("Error with file " + fileName);
        }
    }
}
