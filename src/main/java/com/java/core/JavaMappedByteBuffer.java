package com.java.core;

import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class JavaMappedByteBuffer {
    Path getFileURIFromResources(String fileName) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        return Paths.get(classLoader.getResource(fileName).toURI());
    }

    public CharBuffer read() throws Exception {
        CharBuffer charBuffer = null;
        Path pathToRead = getFileURIFromResources("fileToRead.txt");

        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(
                pathToRead, EnumSet.of(StandardOpenOption.READ))) {

            MappedByteBuffer mappedByteBuffer = fileChannel
                    .map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());

            if (mappedByteBuffer != null) {
                charBuffer = Charset.forName("UTF-8").decode(mappedByteBuffer);
            }
        }
        return charBuffer;
    }

    public Path write() throws Exception {
        CharBuffer charBuffer = CharBuffer
                .wrap("This will be written to the file");
        Path pathToWrite = getFileURIFromResources("fileToWriteTo.txt");

        try (FileChannel fileChannel = (FileChannel) Files
                .newByteChannel(pathToWrite, EnumSet.of(
                        StandardOpenOption.READ,
                        StandardOpenOption.WRITE,
                        StandardOpenOption.TRUNCATE_EXISTING))) {

            MappedByteBuffer mappedByteBuffer = fileChannel
                    .map(FileChannel.MapMode.READ_WRITE, 0, charBuffer.length());

            if (mappedByteBuffer != null) {
                mappedByteBuffer.put(
                        Charset.forName("utf-8").encode(charBuffer));
            }
        }
        return pathToWrite;
    }

}
