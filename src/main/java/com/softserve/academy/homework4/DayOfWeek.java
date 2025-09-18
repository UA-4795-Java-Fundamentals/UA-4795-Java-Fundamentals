package com.softserve.academy.homework4;

public enum DayOfWeek {
    MONDAY("Monday", "Понеділок", 1),
    TUESDAY("Tuesday", "Вівторок", 2),
    WEDNESDAY("Wednesday", "Середа", 3),
    THURSDAY("Thursday", "Четвер", 4),
    FRIDAY("Friday", "П'ятниця", 5),
    SATURDAY("Saturday", "Субота", 6),
    SUNDAY("Sunday", "Неділя", 7);

    private String nameEng;
    private String nameUkr;
    private int ordinal;

    DayOfWeek(String nameEng, String nameUkr, int ordinal) {
        this.nameEng = nameEng;
        this.nameUkr = nameUkr;
        this.ordinal = ordinal;
    }

    public String getNameEng() {
        return nameEng;
    }

    public String getNameUkr() {
        return nameUkr;
    }

    public static DayOfWeek fromCode(int ordinal) {
        for (DayOfWeek days : values()) {
            if (days.ordinal == ordinal) {
                return days;
            }
        }
        return null;
    }
}
