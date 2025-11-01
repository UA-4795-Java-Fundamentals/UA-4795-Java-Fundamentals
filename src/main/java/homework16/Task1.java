package homework16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;


public class Task1 {
    public static void main(String[] args) throws IOException {
        String fileName = "file1.txt";
        Path path = Path.of(fileName);
        String[] lines = Files.readAllLines(path)
                .toArray(String[]::new);
        System.out.println("Number of lines " + lines.length);
        Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"))) {
            bw.write("Number of lines " + lines.length + "\n");
            bw.write(Arrays.stream(lines)
                    .max(Comparator.comparing(String::length))
                    .orElse("") + "\n");
            bw.write("Serhii 11.07.2003 " + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file");
        }


    }
}
