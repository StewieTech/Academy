package Compiler;

import javafx.application.Platform;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.nio.file.Files;

/**
 * <p>
 * Here we are testing two things 1) if code loaded from a temp file is equal to what we expect 2) if code provided to codeSource also equals what we expect
 * <br>
 * As JavaFX is on a different thread then the main thread, we also need to think about how to handle race conditions and concurrency.
* Originally was checking out java.util.concurrent.CountDownLatch but decided just to revert back to using synchronized to handle multithreading ;
 * </p>
*/

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

        System.out.println("\n Running testUserInputCode");
        new testUI().testUserInputCode();
    }
}
