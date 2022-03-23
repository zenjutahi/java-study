package com.files.manipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteFileRunner {
    public static void main(String[] args) throws IOException {

        // writing into files in a given path  i.e. pathFileToRead
        Path pathFileToRead = Paths.get("./resources/file-write.txt");

        List<String> data = List.of("Hiaja!!", "iTs eve", "Don't Send");

        Files.write(pathFileToRead, data);

    }
}
