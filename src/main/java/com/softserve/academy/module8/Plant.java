package com.softserve.academy.module8;


class ColorException extends Exception {
    public ColorException(String arg0) {
        super(arg0);
    }
}

class TypeException extends Exception {
    public TypeException(String arg0) {
        super(arg0);
    }
}


public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException {
        return switch (color.toLowerCase()) {
            case "blue" -> Color.BLUE;
            case "red" -> Color.RED;
            case "white" -> Color.WHITE;
            default -> throw new ColorException("Input only color blue, red or white");
        };
    }

    private Type typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "rose" -> {
                return Type.ROSE;
            }
            case "lily" -> {
                return Type.LILY;
            }
            case "tulip" -> {
                return Type.TULIP;
            }
            default -> throw new TypeException("Input only our types");
        }
    }


    @Override
    public String toString() {
        return "Plant{" +
                "type=" + type +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}

class DemoPlant {
    public static void main(String[] args) {
        Plant plant1;

        try {
            plant1 = new Plant("rase", "wite", 10);
            System.out.println(plant1);
        } catch (ColorException | TypeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Good bye!");
    }


}