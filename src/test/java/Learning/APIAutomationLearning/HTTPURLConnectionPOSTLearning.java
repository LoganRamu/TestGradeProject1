package Learning.APIAutomationLearning;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HTTPURLConnectionPOSTLearning {

    public static void main(String[] args) throws IOException {
        URL url=new URL("http://dummy.restapiexample.com/api/v1/create");

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type","application/json");

        httpURLConnection.setDoOutput(true);//this should be false for GET by default

        String jsonBody="{\"name\":\"Logan\",\"salary\":\"70000\",\"age\":\"30\"}";
        byte[] inputJson = jsonBody.getBytes();

        OutputStream outputStream=httpURLConnection.getOutputStream();
        outputStream.write(inputJson);

        System.out.println("Response Code--"+httpURLConnection.getResponseCode());
        System.out.println("Response message"+httpURLConnection.getResponseMessage());

        InputStream inputStream=httpURLConnection.getInputStream();
        InputStreamReader inputStreamReader=new InputStreamReader(inputStream);

        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String allLines = bufferedReader.readLine();

        StringBuffer stringBuffer=new StringBuffer();

        while(allLines!=null)
        {
            stringBuffer.append(allLines);
            break;
        }
        System.out.println(stringBuffer);

    }
}
