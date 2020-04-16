package com.java.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaTextBlockTest {

    @Test
    void getHtml() {
        JavaTextBlock tester = new JavaTextBlock();
        String html = tester.getHtml();
        assertEquals("""
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """, html);
    }
    @Test
    void getLiteral() {
        JavaTextBlock tester = new JavaTextBlock();
        String literal = tester.getLiteral();
        assertEquals("""
                    two escape sequences first is for newlines and, \
                    second is to signify white space or single space."""
                ,literal);
    }

    @Test
    void  getColors() {
        JavaTextBlock tester = new JavaTextBlock();
        String colors = tester.getColors();
        assertEquals("Red Green Blue", colors);
    }

}