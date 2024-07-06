package Compiler;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveUserFile extends Application {
    private static String contentToSave;

    public static void setContentToSave(String content) {
        contentToSave = content;
    }

    @Override
    public void start(Stage saveStage) {
        saveStage.setTitle("Save your lexical analysis to a file !! :D");
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save your lexical analysis to a file !! :D");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text files", "*.txt*"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
        File userFile = fileChooser.showSaveDialog(saveStage);

        if (userFile != null) {
            try (FileWriter fileWriter = new FileWriter(userFile)) {
                fileWriter.write(contentToSave);
                System.out.println("Your file was saved !! Congratulations !!");
            } catch (IOException e) {
                System.err.println("Your save failed :( " + e.getMessage());
            }
        }
        saveStage.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

