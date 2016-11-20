package com.counter;

import java.io.File;
import java.io.IOException;  
import java.util.List;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
  

public class Parser{
  
    public static void main(String args[]) throws IOException {
  
  
        
        String URL = "http://smart-lab.ru/";
        try {
            Document doc = Jsoup.connect(URL).get();
            List<Element> elements = doc.select("html");
            System.out.println("Jsoup Can read HTML page from URL, title : " + elements);
            
        } catch (IOException e) {
            e.printStackTrace();
        }       
    }
}