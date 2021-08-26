package Learning.FileLearning.FileAndFolderOperation;

import java.io.*;

public class BufferReaderPractise
{
    public static void main(String[] args) throws IOException {
        File fil = new File("C:\\Users\\Admin\\Desktop\\FileLearningSubfolderFolder\\Test2.txt");
        /*FileWriter fileWriter = new FileWriter(fil, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Welcome.");
        bufferedWriter.write("Test.");
        bufferedWriter.flush();
        bufferedWriter.close();*/

        FileReader fileReader = new FileReader(fil);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String text=bufferedReader.readLine();
        int charCount=0;
        int lineCount=0;
        int sentencesCount=0;
        int wordCount=0;

        while(text!=null)
        {

            String[] sentences=text.split("[.]");
            sentencesCount=sentencesCount+sentences.length;
            String[] words=text.split(" ");
            wordCount=wordCount+words.length;
            charCount=charCount+text.length();
            System.out.println(text);
            text=bufferedReader.readLine();
            lineCount++;
        }
        System.out.println(lineCount);
        System.out.println(sentencesCount);
        System.out.println(wordCount);
        System.out.println(charCount);

    }
}
