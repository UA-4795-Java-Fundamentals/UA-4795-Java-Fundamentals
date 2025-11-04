package com.softserve.academy.module16;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        byte[] data = {68, 70, 72, 73, 78, 90, 120};
        String fileName = "output.bin";
        try (FileOutputStream outFile = new FileOutputStream(fileName)) {
            System.out.println("File is opened for write");
            outFile.write(data);
            System.out.println("Counts of bytes " + data.length);
        } catch (IOException e) {
            System.err.println("Problems with file " + fileName);
        }

    }
}
