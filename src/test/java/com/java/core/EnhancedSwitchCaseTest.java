package com.java.core;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedSwitchCaseTest {

    @Test
    void enhanceAt14() {
        EnhancedSwitchCase tester = new EnhancedSwitchCase();
        int result = tester.enhanceAt14(DayOfWeek.FRIDAY);
        assertEquals(6, result);
    }
    @Test
    void enhanceAt14_1() {
        EnhancedSwitchCase tester = new EnhancedSwitchCase();
        int result = tester.enhanceAt14_1(DayOfWeek.TUESDAY);
        assertEquals(7, result);
    }

    @Test
    void enhanceAt14_2() {
        EnhancedSwitchCase tester = new EnhancedSwitchCase();
        int result = tester.enhanceAt14_2(DayOfWeek.FRIDAY);
        assertEquals(3, result);
    }
}