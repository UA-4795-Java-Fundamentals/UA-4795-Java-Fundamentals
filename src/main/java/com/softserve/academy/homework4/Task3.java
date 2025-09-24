package com.softserve.academy.homework4;

import java.util.Scanner;

enum HTTPError {
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENT_REQUIRED(402, "Payment Required"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    BAD_GATEWAY(502, "Bad Gateway"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable");

    private final int code;
    private final String message;
    HTTPError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HTTPError getHTTPError(int code) {
        for (HTTPError e : HTTPError.values()) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an HTTP error code: ");
        int code = input.nextInt();
        HTTPError error = HTTPError.getHTTPError(code);

        if (error != null) {
            System.out.println("Error " + code + ": " + error.getMessage());
        } else {
            System.out.println("Unknown error code " + code);
        }
    }
}
