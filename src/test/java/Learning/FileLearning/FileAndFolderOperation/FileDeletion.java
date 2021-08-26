package Learning.FileLearning.FileAndFolderOperation;

import java.io.File;

public class FileDeletion
{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\FileLearningSubfolderFolder\\Test.txt");
        boolean present=file.exists();
        if(present)
        {
           boolean delete= file.delete();
            System.out.println("File deleted--"+delete);
        }
    }
}
