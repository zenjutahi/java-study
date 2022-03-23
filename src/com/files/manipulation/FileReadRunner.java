package com.files.manipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FileReadRunner {
    public static void main(String[] args) throws IOException {

        // reading in files from given path  i.e. pathFileToRead
        Path pathFileToRead = Paths.get("./resources/data.txt");
/*
        List<String> lines = Files.readAllLines(pathFileToRead);
        System.out.println(lines);

 */

        Files.lines(pathFileToRead)
                .map(String::toUpperCase)
                .filter(str -> str.contains("F"))
                .forEach(System.out::println);
    }
}
