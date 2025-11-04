package com.softserve.academy.module16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class FileReaderCharExample {
    public static void main(String[] args) {
        File f = new File ("/Users/oshuty/OneDrive - SoftServe, Inc/Desktop/test.txt");
        System.out.println(f.exists());

        String fileName = "notes.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("our line " + line);
            }
        } catch (IOException e) {
            System.err.println("Error " + fileName);
        }
    }
}
