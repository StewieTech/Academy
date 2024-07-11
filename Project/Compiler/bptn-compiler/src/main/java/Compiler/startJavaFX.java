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
        }
    }

//    Hiding the runLater Platform implementation and using this one to ensure that JavaFX has been started if it already hasn't been
    public static void runLater(Runnable task) {
        initialize();
        Platform.runLater(task);
    }
}
