package com.java.core;

import java.time.DayOfWeek;


public class EnhancedSwitchCase {
    @SuppressWarnings("all")
    public void before14(DayOfWeek day) {
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                System.out.println(6);
                break;
            case TUESDAY:
                System.out.println(7);
                break;
            case THURSDAY:
            case SATURDAY:
                System.out.println(8);
                break;
            case WEDNESDAY:
                System.out.println(9);
                break;
        }
    }
    @SuppressWarnings("all")
    public int enhanceAt14(DayOfWeek day) {//with :[semicolon]
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY : return 6;
            case TUESDAY                : return 7;
            case THURSDAY, SATURDAY     : return 8;
            case WEDNESDAY              : return 9;
            default: return -1;
        }
    }
    public int enhanceAt14_1(DayOfWeek day) {
        //with ->[Arrow labels]
        //we can not use return without curly brackets
        return
            switch (day) {
                case MONDAY, FRIDAY, SUNDAY -> 6;
                case TUESDAY                -> 7;
                case THURSDAY, SATURDAY     -> 8;
                case WEDNESDAY              -> 9;
            };
    }

    public int enhanceAt14_2(DayOfWeek day) {
        //with ->[Arrow labels]
        //Yielding a value - introduce a new yield
        //Yield is to return within switch case.
        return switch (day) {
                case MONDAY  -> 0;
                case TUESDAY -> 1;
                default      -> {
                    int d = day.toString().length();
                    yield d/2;
                }
            };
    }
}
