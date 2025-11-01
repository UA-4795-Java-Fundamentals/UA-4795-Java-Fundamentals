package com.softserve.academy.homework7;

enum CustomerType {
    REGULAR,
    VIP
}

interface DiscountPolicy {
    double applyDiscount(double price);
    boolean isApplicable(CustomerType type);
}

class RegularCustomerDiscount implements DiscountPolicy {
    public RegularCustomerDiscount() {
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.9;
    }

    @Override
    public boolean isApplicable(CustomerType type) {
        return type == CustomerType.REGULAR;
    }
}

class VipCustomerDiscount implements DiscountPolicy {
    public VipCustomerDiscount() {
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.7;
    }

    @Override
    public boolean isApplicable(CustomerType type) {
        return type == CustomerType.VIP;
    }
}
