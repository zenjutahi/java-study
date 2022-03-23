package com.files.manipulation;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {
    public static void main(String[] args) throws IOException {

        // listing the files in the root i.e. currentDirectory
        Path currentDirectory = Paths.get(".");

//        Files.list(currentDirectory).forEach(System.out::println);

        // Do a filter for .java files

        Predicate<? super Path> predicate =
                path -> String.valueOf(path).contains(".java");

/*
        Files.walk(currentDirectory, 5)
                .filter(predicate)
                .forEach(System.out::println);

 */

        BiPredicate<Path, BasicFileAttributes> javaMatcher =
                (path, attributes) -> String.valueOf(path).contains(".java");

        BiPredicate<Path, BasicFileAttributes> directoryMatcher =
                (path, attributes) -> attributes.isDirectory();

        Files.find(currentDirectory, 3, directoryMatcher )
                .forEach(System.out::println);;
    }
}
