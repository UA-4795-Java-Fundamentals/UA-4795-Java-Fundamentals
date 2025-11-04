package com.softserve.academy.module16;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        String fileName = "output.bin";
        try (FileInputStream inFile = new FileInputStream(fileName)) {
            System.out.println("File is opened for reading");
            int byteIsAvailable = inFile.available();
            byte[] readBytes = new byte[byteIsAvailable];
            int count = inFile.read(readBytes);
            System.out.println("Count of bytes " + count);
       for(byte b : readBytes){
           System.out.println("Byte is " + b);
       }
        } catch (IOException e) {
            System.err.println("Error in file " + fileName);
        }
    }
}
