package com.softserve.academy.module10;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class Box<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
class BoxDemo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Java!");

        String greetingText = stringBox.getValue();
        System.out.println(greetingText);

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(10);

        int numberRoom = integerBox.getValue();
        System.out.println(numberRoom);


    }

}