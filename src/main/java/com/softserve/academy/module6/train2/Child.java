package com.softserve.academy.module6.train2;

import com.softserve.academy.module6.train.Parent;

import java.util.concurrent.Callable;

public class Child extends Parent {
    int f() {
        return 2;
    }
}

class Demo {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.uaeF());
    }
}