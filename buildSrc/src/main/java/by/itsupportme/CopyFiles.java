package by.itsupportme;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFiles extends DefaultTask {
    @TaskAction
    void myTask() {
        try {
            File folder = new File("D:\\фото");

            File[] listOfFiles = folder.listFiles();

            if (listOfFiles != null)
                for (File file : listOfFiles) {
                    Files.copy(file.toPath(), new File("D:\\testGradle"
                            + File.separator + file.getName()).toPath());
                }

            System.out.println("Done!");
        } catch (IOException e){
            System.err.println("Problem with file." +
                    "One of the problems may be that the file exists in this directory");
        }
    }
}
