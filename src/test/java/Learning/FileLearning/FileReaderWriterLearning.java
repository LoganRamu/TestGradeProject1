package Learning.FileLearning;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterLearning
{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\FileLearningSubfolderFolder\\Test.txt");

            try {
                boolean fileCreated =file.createNewFile();
                FileWriter writer=new FileWriter(file);
                //it has append boolena alos FileWriter writer=new FileWriter(file, true);
                writer.write(86); // Ascii value
                writer.write(" Selenium Test");
                writer.flush();
                writer.close();

                FileReader reader=new FileReader(file);
                int re=reader.read();

                while(re!=-1)
                {
                    System.out.print((char)re);
                    re=reader.read();
                }

                //print using charArray
                char[] ch=new char[(int)file.length()];
                System.out.println(ch.length);
                reader.read(ch);
                for (int i=0;i<ch.length;i++)
                {
                    System.out.println(ch[i]);
                }

            } catch (IOException e) {
                throw new RuntimeException();
                //System.out.println(e.getMessage());
            }
        }


}
