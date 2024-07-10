package Compiler;

import javafx.stage.Stage;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * SaveUserFile and Opening codeFromFile use two different JavaFX stages. as this is the case I created two seperate classes to manage their behavour better
 *
 */



public class SaveUserFile  {
    private static String contentToSave;

    public static void setContentToSave(String content) {
        contentToSave = content;
    }


    // <https://www.tutorialspoint.com/how-to-save-files-using-a-file-chooser-in-javafx>
//    @Override
    public static void saveToFile(String userOutput) {
        setContentToSave(userOutput);
        startJavaFX.runLater(() -> {
            Stage saveStage = new Stage();
//        saveStage.setTitle("Save your lexical analysis to a file !! :D");
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
        });
    }


}

