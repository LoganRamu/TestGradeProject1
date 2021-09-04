package Learning.FileLearning.FileAndFolderOperation;

import java.io.File;

public class ListOnlytxtFiles {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop");
        File[] allFiles = file.listFiles();
        for (int i = 0; i < allFiles.length; i++) {
            if (allFiles[i].isFile()) {
                //System.out.println(allFiles[i]);
                String fileName = allFiles[i].getName();
                int last = fileName.lastIndexOf(".");
                String fileType = fileName.substring(last + 1);
                if (fileType.equals("txt")) {
                    System.out.println(fileType);
                }
            }
        }


    }
}
