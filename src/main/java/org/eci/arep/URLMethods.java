package org.eci.arep;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author diego.macia-d
 */
public class URLMethods {

    public static void main(String[] args) {
        try{
            URL url = new URL("http://ldbn.escuelaing.edu.co:80/path/index.html?param=1&param2=2#hello");
            System.out.println("Host: " + url.getHost());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("File: " + url.getFile());
            System.out.println("Path: " + url.getPath());
            System.out.println("Port: " + url.getPort());
            System.out.println("Ref: " + url.getRef());
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Query: " + url.getQuery());
        }catch(MalformedURLException e){
            
        }
    }
}
