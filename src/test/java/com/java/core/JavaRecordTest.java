package com.java.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaRecordTest {

    @Test
    public void test() {
        JavaRecord tester = new JavaRecord(1,5);
        assertEquals(1, tester.x());
        assertEquals(5, tester.y());
        assertEquals("JavaRecord[x=1, y=5]", tester.toString());
        assertEquals(tester, new JavaRecord(1,5));
    }

}