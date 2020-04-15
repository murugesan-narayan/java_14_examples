package com.java.core;

public class InstanceOfPatternMatching {
    public static void main(String[] args) {
        Object str = "5";
        Object val = 5;
        Number n = 5;
        if (str instanceof String l)
            System.out.println("l = " + l);
        if (val instanceof Integer l)
            System.out.println("l = " + l);
        if (n instanceof Number l) //no need explicit cast
            System.out.println("l = " + l);
        str = null;
        if (str instanceof String l)
            System.out.println("l = " + l);
        else System.out.println("L not assigned");
    }
}
