package Learning.FileLearning;

import java.io.*;

public class BufferReaderWriterLearning
{
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Admin\\Desktop\\FileLearningSubfolderFolder\\Test1.txt");
        /*FileWriter fw = new FileWriter(file, true);
        BufferedWriter bf=new BufferedWriter(fw);
        bf.write("Buffer Test.");
        bf.newLine();
        bf.write("New Test.");
        bf.flush();
        bf.close();*/

        FileReader fr = new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String text=br.readLine();
        int lineCount=0;
        int sentenceCount=0;
        int wordCount=0;
        int charCount=0;
        while(text!=null)
        {

           String[] sentence=text.split("[.]");
            sentenceCount=sentenceCount+sentence.length;
            String[] words=text.split(" ");
            wordCount=wordCount+words.length;
            System.out.print(text);
            charCount=charCount+text.length();
            text=br.readLine();
            lineCount++;
        }
        System.out.println(lineCount);
        System.out.println(sentenceCount);
        System.out.println(wordCount);
        System.out.println(charCount);

    }}

