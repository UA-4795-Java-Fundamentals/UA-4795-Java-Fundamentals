package homework16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String fileName = "Code.txt";
        Path path = Path.of(fileName);
        String[] lines = Files.readAllLines(path)
                .toArray(String[]::new);
        String str = String.join("\n", lines).replaceAll("public","private" );

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Code2.txt"))) {
            bw.write(str + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file");
        }
    }
}
