package Learning.FileLearning.FileAndFolderOperation;

import java.io.File;

public class ListOnlyFolders
{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop");
        File[] allFiles=file.listFiles();
        for(int i=0;i<allFiles.length;i++)
        {
            //System.out.println(allFiles[i]);
            boolean isFile=allFiles[i].isDirectory();
            if(isFile)
            {
                System.out.println(allFiles[i]);
            }
        }


    }
}
