package com.softserve.academy.homework6.Task1;

public class Penguin extends NonFlyingBird{
    public Penguin() {
        super(true, true);
    }

    @Override
    public String fly(){
        return "I cannot fly but I good at swimming";
    }

    @Override
    public String toString() {
        return "My name is " + this.getClass().getSimpleName() + " and " + fly();
    }
}
