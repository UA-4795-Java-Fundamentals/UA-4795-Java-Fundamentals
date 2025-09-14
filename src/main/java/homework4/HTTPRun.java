package homework4;

import homework4.enu.HTTPError;
import java.util.Scanner;

public class HTTPRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number representing an HTTP error (e.g., 400, 401, 402, etc.).");
        int errorCode = sc.nextInt();
        sc.close();

        HTTPError error = HTTPError.fromCode(errorCode);

        if (error != null) {
            System.out.println("Error: " + error.getCode() + " " + error.getName());
        } else {
            System.out.println("Unknown HTTP error code: " + errorCode);
        }


    }
}