package Learning.FileLearning.FileAndFolderOperation;

import io.cucumber.plugin.event.Node;

import java.io.File;
import java.io.IOException;

public class FileCreation
{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\FileLearningSubfolderFolder\\Test.txt");
        boolean present=file.exists();
        if(!present)
        {
            try {
               boolean fileCreated =file.createNewFile();
                System.out.println("New File created--"+fileCreated);
            } catch (IOException e) {
                throw new RuntimeException();
                //System.out.println(e.getMessage());
            }
        }

    }
}
