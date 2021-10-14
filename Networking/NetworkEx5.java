package Networking;

import java.net.*;
import java.io.*;

public class NetworkEx5 {
    public static void main(String[] args){
        URL url = null;
        InputStream in = null;
        FileOutputStream out = null;
        String address = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FuXeoH%2FbtrbpVU7BJp%2F3kZPdlxlD6sLiyPkfF4SZ1%2Fimg.png";

        int ch = 0;

        try{
            url = new URL(address);
            in = url.openStream();
            out = new FileOutputStream("test.png");

            while((ch=in.read()) != -1){
                out.write(ch);
            }
            in.close();
            out.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
