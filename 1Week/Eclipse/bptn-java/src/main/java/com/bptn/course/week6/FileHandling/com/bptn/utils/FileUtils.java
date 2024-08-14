package com.bptn.course.week6.FileHandling.com.bptn.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileUtils {
    boolean isFileExist(Path path) {
        boolean fileExists = Files.exists(path) ;
        System.out.println( fileExists ? "File exists!" : "File doesn't exist!");
        return fileExists ;
    };
    public boolean isFileExistsWithExceptionHandling(Path path) {

        try {

        File file = new File(path.toUri());

        Scanner scanner = new Scanner(file);
        scanner.nextLine();

        return true;
        }
    }
    createFileIfNotExist(Path path);
}

