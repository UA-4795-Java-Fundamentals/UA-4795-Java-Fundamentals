import java.util.Arrays;
import java.util.Scanner;

    public enum HttpError {
        Bad_Request("400"),
        Unauthorized("401"),
        PaymentRequired("402"),
        Forbidden("403"),
        NotFound("404"),
        MethodNotAllowed("405"),
        NotAcceptable("406"),
        ProxyAuthenticationRequired("407"),
        RequestTimeout("408"),
        Conflict("409"),
        Gone("410");

        private final String error;

        HttpError(String error) {
            this.error = error;
        }

        public String getError() {
            return error;
        }


        @Override
        public String toString() {
            return "Error= " + error + '\'';
        }

        public static void main(String[] args) {
            // System.out.println(Arrays.toString(HttpError.values()));
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter error code: ");
            String error = scanner.nextLine();
            for (HttpError httpError : HttpError.values()) {
                if (httpError.toString().contains(error)) {
                    System.out.println("Error " + error + ' ' + httpError.name());
                }
                }
                scanner.close();
            }
        }

