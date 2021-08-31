package Learning.APIAutomationLearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HTTPURLConnectionGETLearning {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.dictionaryapi.dev/api/v2/entries/en/hello");

        HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
        httpUrlConnection.setRequestMethod("GET");

        int responseCode = httpUrlConnection.getResponseCode();
        System.out.println(responseCode);

        String responseMessage = httpUrlConnection.getResponseMessage();
        System.out.println(responseMessage);

        InputStream inputStream = httpUrlConnection.getInputStream();

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String allLine = bufferedReader.readLine();

        StringBuffer stringBuffer = new StringBuffer();

       /* while(allLine!=null)
        {
            System.out.println(allLine);
            allLine=bufferedReader.readLine();
        }*/

        //also we can StringBuffer, since its a mutable

        while (allLine != null) {
            stringBuffer.append(allLine);
            break;
        }

        System.out.println(stringBuffer);
    }
}
