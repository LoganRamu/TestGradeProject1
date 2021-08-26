package Learning.FileLearning.FileAndFolderOperation;

import java.io.File;

public class CreateSubFolders
{
    public static void main(String args[])
    {
        File file = new File("C:\\Users\\Admin\\Desktop\\FileLearningSubfolderFolder\\Sub1\\Sub2");
        boolean present=file.exists();
        if(!present)
        {
            file.mkdirs();
        }

    }
}
