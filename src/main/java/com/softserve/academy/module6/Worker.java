package com.softserve.academy.module6;

public interface Worker {
    int getSalary();//public abstract
}

class Employee implements Worker {

    @Override
    public int getSalary() {
        return 0;
    }
}