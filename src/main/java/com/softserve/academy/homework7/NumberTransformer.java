package com.softserve.academy.homework7;

interface NumberTransformer {
    int transform(int num);

    boolean canTransform(int num);
}

class EvenDoubler implements NumberTransformer {
    public EvenDoubler() {}

    @Override
    public int transform(int num) {
        return num * 2;
    }

    @Override
    public boolean canTransform(int num) {
        return num % 2 == 0;
    }
}

class OddSquarer implements NumberTransformer {
    public OddSquarer() {}

    @Override
    public int transform(int num) {
        return num * num;
    }

    @Override
    public boolean canTransform(int num) {
        return num % 2 != 0;
    }
}

class RangeNegator implements NumberTransformer {
    public RangeNegator() {}

    @Override
    public int transform(int num) {
        return -num;
    }

    @Override
    public boolean canTransform(int num) {
        return num >= -10 && num <= 10;
    }
}
