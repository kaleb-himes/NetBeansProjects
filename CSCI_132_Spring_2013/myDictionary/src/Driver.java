/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Brendan
 */


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Random;
import javax.swing.UnsupportedLookAndFeelException;

public class Driver {
    public static Random r = new Random();
    public static BinaryTree dictionary = new BinaryTree();
    public static String source;
    public static String source2;
    public static final String src = "src\\textsource/dictionarySource.txt";
    public static final String src2 = "src\\textsource/userUpdatedSource.txt";
     
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        runProgram();
    }
public static void readInFile(){
   try{
       source = src;
   FileInputStream fstream = new FileInputStream(source);
       
    //Get the object of DataInputStream        
   DataInputStream in = new DataInputStream(fstream);
   BufferedReader br = new BufferedReader(new InputStreamReader(in));
   String strLine;
   //Read File Line By Line
   while ((strLine = br.readLine()) != null)   {    
       TreeNode insertNode = new TreeNode(strLine);
       dictionary.insert(insertNode);
   }
   //Close the input stream
   in.close();
     }catch (Exception e){//Catch exception if any
   System.err.println("Error: " + e.getMessage());
   }
}
public static void runProgram(){
    dictionaryUI.run();
        readInFile();
        readInUserFile();
//        System.out.println("current tree:");
//        PrintTree2.printTree(dictionary);
}   
public static void readInUserFile(){
    try{
       source2 = src2;
   FileInputStream fstream = new FileInputStream(source2);
       
   // Get the object of DataInputStream        
   DataInputStream in = new DataInputStream(fstream);
   BufferedReader br = new BufferedReader(new InputStreamReader(in));
   String strLine;
   //Read File Line By Line
   while ((strLine = br.readLine()) != null)   {
       TreeNode insertNode = new TreeNode(strLine);
       dictionary.insert(insertNode);
   }
   //Close the input stream
   in.close();
     }catch (Exception e){//Catch exception if any
   System.err.println("Error: " + e.getMessage());
   }
      }
    
}
