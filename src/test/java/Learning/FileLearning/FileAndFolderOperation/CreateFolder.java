package Learning.FileLearning.FileAndFolderOperation;

import java.io.File;

public class CreateFolder
{
    public static void main (String args[]) {
        File file = new File("C:\\Users\\Admin\\Desktop\\FileLearningFolder");
        boolean exists=file.exists();
        System.out.println("Folder Preset--"+exists);
        if(!exists)
        {
            file.mkdir();
            System.out.println("Folder Created");
           boolean exists1=file.exists();
            System.out.println("Folder Preset--"+exists1);

        }

    }
}
