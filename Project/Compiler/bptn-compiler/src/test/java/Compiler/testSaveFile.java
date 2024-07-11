package Compiler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * <p>
 * Using a temp file to test the javaFX saving operation. Below are some resources that helped
 * </p>
 *
 * <a href="https://blogs.oracle.com/javamagazine/post/working-and-unit-testing-with-temporary-files-in-java">Working with Unit Tests</a>
 * <a href="https://coderanch.com/t/184661/certification/JUnit-test-read-write-file">Junit Read and Write File</a>
 * <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html">file Tutorial</a>
 */

public class testSaveFile {
    private Path tempFile;

    @BeforeEach
    public void setUp() throws IOException {
        System.out.println("Setting up temporary file for test...");
        tempFile = Files.createTempFile("testFile", ".txt");
        System.out.println("Temporary file created: " + tempFile.toString());
    }

    @AfterEach
    public void tearDown() throws IOException {
        System.out.println("Tearing down temporary file...");
        Files.deleteIfExists(tempFile);
        System.out.println("Temporary file deleted: " + tempFile.toString());
    }

    @Test
    public void testWriteFile() throws IOException {
        String testContent = "Test content for the file.";
        File file = tempFile.toFile();

        System.out.println("Starting testWriteFile...");
        SaveUserFile.writeFile(file, testContent);

        assertTrue(file.exists(), "File should exist");
        System.out.println("THE FILE EXISTS!!! COMPLETE SUCCESS!!");

        char[] buffer = new char[testContent.length()];
        try (FileReader fileReader = new FileReader(file)) {
            System.out.println("Reading content from file...");
            fileReader.read(buffer);
        }

        String fileContent = new String(buffer);
        System.out.println("Contents from file: " + fileContent);

        assertEquals(testContent, fileContent, "File content should match the input content");
        System.out.println("testContent and fileContant match <3 .");
    }
}
