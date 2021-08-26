package Learning.FileLearning.FileAndFolderOperation;

import java.io.File;

public class ListAllFilesAndFolders
{
    public static void main(String[] args) {
    File file = new File("C:\\Users\\Admin\\Desktop");
    String[] allFiles=file.list();
        for (String st:allFiles) {
            System.out.println(st);
        }


}
}
