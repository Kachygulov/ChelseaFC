package Exceptions;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WebBrowser {

    public static void sleep(int seconds) throws InterruptedException{

        Thread.sleep(seconds*1000);
    }

     public static void readFile(String filePath) throws IOException {

         FileReader fileReader=new FileReader(filePath);
         BufferedReader reader=new BufferedReader(fileReader);
         System.out.println(reader.readLine());
     }

    public static void main(String[] args) throws InterruptedException, IOException {
        sleep(5);


        readFile("src/Exceptions/myFile");
    }


}
