package com.softserve.academy.module7;

import java.util.Comparator;

public class NameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Employee e1 && o2 instanceof Employee e2) {
            return e2.name.compareTo(e1.name);
        }
        throw new ClassCastException(" Both must be Emp");
    }
}
class TabNumberComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Employee e1 && o2 instanceof Employee e2) {
            return e2.tabNumber - e1.tabNumber;
        }
        throw new ClassCastException(" Both must be Emp");
    }
}