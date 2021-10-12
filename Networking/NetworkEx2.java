package Networking;

import java.net.*;

public class NetworkEx2 {
    public static void main(String[] args) throws Exception{
        // URL url = new URL("http://www.codechobo.com/" 
        //         + "hello.html?referer=codechobo#index1");

        URL url = new URL("https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FuXeoH%2FbtrbpVU7BJp%2F3kZPdlxlD6sLiyPkfF4SZ1%2Fimg.png");
        System.out.println("url.getAuthority :" + url.getAuthority());
        System.out.println("url.getContent :" + url.getContent());
        System.out.println("url.getDefaultPort :" + url.getDefaultPort());
        System.out.println("url.getPort :" + url.getPort());
        System.out.println("url.getFile :" + url.getFile());
        System.out.println("url.getHost :" + url.getHost());
        System.out.println("url.getPath :" + url.getPath());
        System.out.println("url.getProtocol :" + url.getProtocol());
        System.out.println("url.getQuery :" + url.getQuery());
        System.out.println("url.getRef :" + url.getRef());
        System.out.println("url.getUserInfo :" + url.getUserInfo());
        System.out.println("url.toExternalForm :" + url.toExternalForm());
        System.out.println("url.toURI :" + url.toURI());
    }    
}
