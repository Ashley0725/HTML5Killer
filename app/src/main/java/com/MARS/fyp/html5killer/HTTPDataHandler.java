package com.MARS.fyp.html5killer;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;

/**
 * Created by PC on 2016/10/24.
 */

public class HTTPDataHandler {
    static String stream = null;


    public HTTPDataHandler() {
    }

    public String GetHTTPData(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            // Check the connection status
            if (urlConnection.getResponseCode() == 200) {
                // 200= ok
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                // read the BufferedInputStream
                BufferedReader r =new BufferedReader(new InputStreamReader(in));
                StringBuilder sb = new StringBuilder();
                String line;
                while((line=r.readLine()) != null){
                    sb.append(line);
                    stream = sb.toString();
                    urlConnection.disconnect();
                }

            } else {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String PostHTTPData(String urlString, String json){
        try{
            URL url =new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();

            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);

            byte[] out = json.getBytes(StandardCharsets.UTF_8);
            int length = out.length;
            urlConnection.setFixedLengthStreamingMode(length);
            urlConnection.setRequestProperty("Content-type","application/json: charset-UTF-8");
            try(OutputStream os = urlConnection.getOutputStream()){
                os.write(out);
            }
            InputStream response = urlConnection.getInputStream();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String PutHTTPData(String urlString, String newValue){
        try{
            URL url =new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();

            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);

            byte[] out = newValue.getBytes(StandardCharsets.UTF_8);
            int length = out.length;
            urlConnection.setFixedLengthStreamingMode(length);
            urlConnection.setRequestProperty("Content-type","application/json: charset-UTF-8");
            try(OutputStream os = urlConnection.getOutputStream()){
                os.write(out);
            }
            InputStream response = urlConnection.getInputStream();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String PutHTTPData(String urlString, String newValue){
        try{
            URL url =new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();

            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);

            byte[] out = newValue.getBytes(StandardCharsets.UTF_8);
            int length = out.length;
            urlConnection.setFixedLengthStreamingMode(length);
            urlConnection.setRequestProperty("Content-type","application/json: charset-UTF-8");
            try(OutputStream os = urlConnection.getOutputStream()){
                os.write(out);
            }
            InputStream response = urlConnection.getInputStream();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
