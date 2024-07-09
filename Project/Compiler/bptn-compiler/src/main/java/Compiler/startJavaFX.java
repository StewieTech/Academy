package Compiler;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class startJavaFX extends Application {
    private static boolean isJavaFXstarted = false ;

    @Override
    public void start(Stage primaryStage) {}

    public static synchronized void initialize() {
        if (!isJavaFXstarted) {
            new Thread(() -> launch(startJavaFX.class)).start();
            isJavaFXstarted = true;
//            waitForStart();
        }
    }

    private static void waitForStart() {
        while (!Platform.isFxApplicationThread() ) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void runLater(Runnable task) {
        initialize();
        Platform.runLater(task);
    }
}
