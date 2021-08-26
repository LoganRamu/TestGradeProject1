package Learning.FileLearning.FileAndFolderOperation;

import java.io.File;

public class PrintFileName
{

        public static void main(String[] args) {
            File file = new File("C:\\Users\\Admin\\Desktop\\FileLearningSubfolderFolder\\Test.txt");
            String name=file.getName();
            System.out.println("FileName--"+name);
            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());

        }
}
