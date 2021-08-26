package Learning.FileLearning.FileAndFolderOperation;

import java.io.File;
import java.io.IOException;

public class FileRename
{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\FileLearningSubfolderFolder\\OldName.txt");
        try {
            boolean present=file.exists();
            if(!present) {
                file.createNewFile();
            }
            File file1 = new File("C:\\Users\\Admin\\Desktop\\FileLearningSubfolderFolder\\NewName.txt");
            boolean rename=file.renameTo(file1);
            System.out.println("Rename--"+rename);
            /*boolean present1=file.exists();
            if(!present1) {
                boolean rename=file.renameTo(file1);
                System.out.println("Rename--"+rename);
            }*/



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
