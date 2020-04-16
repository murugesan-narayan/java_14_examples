package com.java.core;

/**
 * A text block contains zero or more content characters, which are enclosed by
 * open and close delimiters (""").
 * It is a multi-line string literals which prevents the need for most escape sequences,
 * formats the string automatically, and allows the developer and gives control to format
 * the string if necessary.
 */
public class JavaTextBlock {
    @SuppressWarnings("all")
    public String getHtml() {
        //Before
        String html_old = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";

        //Enhanced      //prints it as it is typed.
        return """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;
    }

    public String getLiteral() {
        // Without Text Block
        String literal = "two escape sequences first is for newlines " +
                "and, second is to signify white space " +
                "or single space.";

// With the \<line-terminator> escape sequence this could be expressed as:
        String text = """
                two escape sequences first is for newlines \
                and, second is to signify white space \
                or single space.\
                """;
        return literal;
    }

    public String getColors() {     // \s adds single space
        return """
                        Red\s\
                        Green\s\
                        Blue\
                        """;
    }
}
