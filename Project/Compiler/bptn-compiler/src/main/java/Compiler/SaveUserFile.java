package Compiler;

import javafx.stage.Stage;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * SaveUserFile and Opening codeFromFile use two different JavaFX stages. as this is the case I created two seperate classes to manage their behavour better
 * <p> Links that helped:
 *  <<a href="https://www.tutorialspoint.com/how-to-save-files-using-a-file-chooser-in-javafx">...</a>>
 *
 */

public class SaveUserFile  {
    private static String contentToSave;

    public static void setContentToSave(String content) {
        contentToSave = content;
    }

//    @Override
    public static void saveToFile(String userOutput) {
        setContentToSave(userOutput);
        startJavaFX.runLater(() -> {
            Stage saveStage = new Stage();
            UI.startFunFacts();
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save your lexical analysis to a file !! :D");

            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Text files", "*.txt"),
                    new FileChooser.ExtensionFilter("All Files", "*.*")
            );
            File userFile = fileChooser.showSaveDialog(saveStage);

            if (userFile != null) {
                writeFile(userFile, contentToSave);
                saveStage.close();
                System.out.println("Your file was saved !! Congratulations !!");
            } else {
                System.out.println("File save was cancelled.");
            }
            UI.stopFunFacts();
        });
    }

    public static void writeFile(File file, String content) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(content);
        } catch (IOException e) {
            System.err.println("Your save failed :( " + e.getMessage());
        }
    }
}