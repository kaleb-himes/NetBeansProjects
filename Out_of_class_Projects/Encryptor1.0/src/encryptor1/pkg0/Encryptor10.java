package encryptor1.pkg0;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Kaleb
 */
public class Encryptor10 {
    public static ArrayList<String> encrypt = new ArrayList<>();
    public static final String src = "src\\textsource/test.txt";
    public static void main(String[] args) {
        readInFile();
}
    public static void readInFile(){
       try{
       FileInputStream fstream = new FileInputStream(src);

        //Get the object of DataInputStream        
       DataInputStream in = new DataInputStream(fstream);
       BufferedReader br = new BufferedReader(new InputStreamReader(in));
       String strLine;
       //Read File Line By Line
       while ((strLine = br.readLine()) != null)   {    
           String[] result = strLine.split("");
           for ( int i=0; i<result.length; i++) {
               if(result[i] != ""){
                 encrypt.add(result[i]);
               }
             }
            for ( int i=0; i<encrypt.size(); i++) {
                 
             }
       }
       //Close the input stream
       in.close();
         }catch (Exception e){//Catch exception if any
       System.err.println("Error: " + e.getMessage());
       }
    }
}