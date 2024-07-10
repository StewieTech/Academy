package Compiler;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class testUI {

    @BeforeAll
    public static void initToolkit() {
        Platform.startup(() -> {}); // Initialize JavaFX platform
    }

    @Test
    public void testLoadCodeFromFile() {
        Platform.runLater(() -> {
            try {
                // Set up the stage and UI instance
                Stage stage = new Stage();
                UI uiInstance = new UI();
                uiInstance.start(stage);

                File testFile = File.createTempFile("test", ".java");
                Files.write(testFile.toPath(), "int x = 42;".getBytes());
                System.out.println("Created a temporary file with test content");

                UI.setCodeSource(new String(Files.readAllBytes(testFile.toPath())));
                assertEquals("int x = 42;", UI.getCodeSource(), "Code source should match file content");
                System.out.println("Loaded code matches the expected content");

                // Clean up the temporary file
                testFile.delete();
            } catch (Exception e) {
                fail("Exception during test: " + e.getMessage());
            }
        });

        // Allow time for the JavaFX thread to complete
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUserInputCode() {
        Platform.runLater(() -> {
            try {
                // Simulate user input for code entry
                String userInput = "int y = 100;";
                UI.setCodeSource(userInput);
                assertEquals(userInput, UI.getCodeSource(), "Code source should match user input");
                System.out.println("User input code matches the expected content");
            } catch (Exception e) {
                fail("Exception during test: " + e.getMessage());
            }
        });

        // Allow time for the JavaFX thread to complete
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        initToolkit();
        System.out.println("Running testLoadCodeFromFile");
        new testUI().testLoadCodeFromFile();
//        System.out.println("SUCCESS!!: Temp File matches the example codesource !!");

        System.out.println("\n Running testUserInputCode");
        new testUI().testUserInputCode();
//        System.out.println("SUCCESS!!: User input matches the example codesource !!");
    }
}
