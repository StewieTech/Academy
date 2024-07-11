package Compiler;

import javafx.application.Platform;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.nio.file.Files;

// As JavaFX is on a different thread then main we use the library below to handle race conditions and concurrency
// decided just to revert back to using synchronized to handle multithreading no longer using import java.util.concurrent.CountDownLatch;

public class testUI {

    @BeforeAll
    public static void startTestUI() {
        Platform.startup(() -> {}); // Initialize JavaFX platform
    }

    @Test
    public void testLoadCodeFromFile() {
        Platform.runLater(() -> {
            try {
                // Set up the stage and UI instance
                Stage stage = new Stage();
                UI uiObject = new UI();
                uiObject.start(stage);

                File testFile = File.createTempFile("test", ".java");
                Files.write(testFile.toPath(), "int x = 42;".getBytes());
                System.out.println("Created a temporary file with test content" + testFile);

                UI.setCodeSource(new String(Files.readAllBytes(testFile.toPath())));
                assertEquals("int x = 42;", UI.getCodeSource(), "Code source should match file content");
                System.out.println("SUCCESS!!: Temp File matches the example codesource !!" + " " +  UI.getCodeSource());
                testFile.delete();
                System.out.println("Test file deleted: " + testFile.toString());
            } catch (Exception e) {
                fail("Exception during test: " + e.getMessage());
            }
        });

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
                System.out.println("SUCCESS!!: User input matches the example codesource !!" + " " + UI.getCodeSource());
            } catch (Exception e) {
                fail("Exception during test: " + e.getMessage());
            }
        });

        // Giving time for the JavaFX thread just to manage unexpected behaviours
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        startTestUI();
        System.out.println("Running testLoadCodeFromFile");
        new testUI().testLoadCodeFromFile();
//        System.out.println("SUCCESS!!: Temp File matches the example codesource !!");

        System.out.println("\n Running testUserInputCode");
        new testUI().testUserInputCode();
//        System.out.println("SUCCESS!!: User input matches the example codesource !!");
    }
}
