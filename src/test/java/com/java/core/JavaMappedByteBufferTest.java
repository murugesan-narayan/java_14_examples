package com.java.core;

import org.junit.jupiter.api.Test;

import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaMappedByteBufferTest {

    @Test
    void writeTest() throws Exception {
        JavaMappedByteBuffer jm = new JavaMappedByteBuffer();
        Path path = jm.write();
        List<String> fileContent = Files.readAllLines(path);
        assertEquals(fileContent.get(0), "This will be written to the file");
    }
    @Test
    void readTest() throws Exception {
        JavaMappedByteBuffer jm = new JavaMappedByteBuffer();
        CharBuffer charBuffer = jm.read();
        assertNotNull(charBuffer);
        assertEquals(charBuffer.toString(), "This is a content of the file");
    }
}