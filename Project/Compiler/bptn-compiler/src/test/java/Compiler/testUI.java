//package Compiler;//package Compiler;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import javafx.application.Platform;
//import javafx.stage.Stage;
//
//import java.io.ByteArrayInputStream;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.TimeUnit;
//
//public class testUI {
//
//    @BeforeAll
//    public static void initJFX() throws InterruptedException {
//        CountDownLatch latch = new CountDownLatch(1);
//        Platform.startup(() -> {
//            latch.countDown();
//        });
//        if (!latch.await(5, TimeUnit.SECONDS)) {
//            throw new IllegalStateException("JavaFX initialization timed out");
//        }
//    }
//
//    @Test
//    public void testJavaFXInitialization() {
//        System.out.println("Testing JavaFX startup... ");
//        assertDoesNotThrow(() -> {
//            Platform.runLater(() -> {
//                try {
//                    new UI().start(new Stage());
//                    System.out.println("JavaFX started successfully !! :D" );
//                } catch (Exception e) {
//                    fail("Exception during JavaFX initialization: " + e.getMessage());
//                }
//            });
//        });
//    }
//}
