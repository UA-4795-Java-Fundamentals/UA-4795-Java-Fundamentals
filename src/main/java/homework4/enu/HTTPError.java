package homework4.enu;

public enum HTTPError {
    BAD_REQUEST(400, "BAD REQUEST"),
    FORBIDDEN(403, "FORBIDDEN"),
    NOT_FOUND(404, "NOT FOUND");

    private final int code;
    private final String name;

    HTTPError(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static HTTPError fromCode(int code) {
        switch (code) {
            case 400:
                return BAD_REQUEST;
            case 403:
                return FORBIDDEN;
            case 404:
                return NOT_FOUND;
            default:
                return null;
        }

    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "HTTPError{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}