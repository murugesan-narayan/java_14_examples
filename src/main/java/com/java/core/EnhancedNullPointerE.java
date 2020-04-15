package com.java.core;
/**
 This feature can be enabled with the new boolean command-line option:
 -XX:+ShowCodeDetailsInExceptionMessages
 By default it is disabled i.e.
 -XX:-ShowCodeDetailsInExceptionMessages.
 It is intended to be enabled by default in a later release.
 */
public class EnhancedNullPointerE {
    public static void main(String[] args) {
        MyFruits f = new MyFruits();
        System.out.println(f.ora.c.name);
    }
}
class MyFruits {
    Orange ora = new Orange();
}
class Orange {
    Color c = null;
    String name = null;
}
class Color {
    String name = "Yellow";
}