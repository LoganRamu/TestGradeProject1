package Learning.FileLearning.FileAndFolderOperation;

import java.io.File;
import java.io.IOException;

public class FileSize
{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop");
        System.out.println(file.length());
    }
}
