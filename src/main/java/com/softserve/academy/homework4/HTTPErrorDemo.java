package com.softserve.academy.homework4;

import java.util.Scanner;

public class HTTPErrorDemo {
    enum HTTPError {
        BAD_REQUEST(400),
        UNAUTHORIZED(401),
        PAYMENT_REQUIRED(402),

        NOT_FOUND(404);

        private final int code;

        public int getCode() {
            return code;
        }

        HTTPError(int code) {
            this.code = code;
        }

        public static HTTPError fromCode(int code) {
            for (HTTPError error : HTTPError.values()) {
                if (error.getCode() == code) {
                    return error;
                }
            }
            return null;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter HTTP error code:");
            int inputCode = scanner.nextInt();
            HTTPError httpError = HTTPError.fromCode(inputCode);
            if (httpError != null) {
                System.out.println("HTTP Error: " + httpError);
            } else {
                System.out.println("Unknown HTTP error: " + inputCode);
            }
            scanner.close();
        }
    }
}
