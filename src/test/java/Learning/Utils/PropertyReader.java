package Learning.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader
{
    static Properties properties=new Properties();
    FileInputStream fis=null;

    /*public PropertyReader()
    {
        loadProperties();
    }*/

    public void loadProperties()
    {
        try
        {
       fis=new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\TestGradeProject1\\src\\test\\resources\\config.properties");
       properties.load(fis);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getProperty(String key)
    {

        return properties.getProperty(key);
    }
}
