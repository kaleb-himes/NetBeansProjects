/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.mazesolver;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author kaleb.himes
 */
public class createArray extends ReadInFile {
    public static void createTheArray(){
           try{
       if(test1 == true && test2 == false){
       source = src1;
       }
       if(test1 == false && test2 == true){
       source = src2;
       }
       if(test1 == true && test2 == true){
           System.out.println("Woops");
       }
       if(test1 == false && test2 == false){
           System.out.println("Woops");
       }
   // Open the file that is the first command line parameter
   FileInputStream fstream = new FileInputStream(source);
   // Get the object of DataInputStream        
   DataInputStream in = new DataInputStream(fstream);
   BufferedReader br = new BufferedReader(new InputStreamReader(in));
   String strLine;
   //Read File Line By Line
   while ((strLine = br.readLine()) != null)   {
       ArrayList<Character> rowArray = new ArrayList<Character>();
       ArrayList<Character> SolvingRows = new ArrayList<Character>();
       ArrayList<Integer> intArray = new ArrayList<Integer>();
       ArrayList<Integer> SolvingInts = new ArrayList<Integer>();
       for(int token = 0; token < strLine.length(); token++){
           
        aChar = strLine.charAt(token);
        SolvingRows.add(aChar);
        rowArray.add(aChar);
        
        if(aChar == '*'){
            SolvingInts.add(-3);
            intArray.add(-3);           
        }
        if(aChar == ' '){
            SolvingInts.add(-1);
            intArray.add(-1);           
        }
        if(aChar == 'T'){
            SolvingInts.add(-7);
            intArray.add(-7);           
        }
        if(aChar == 'S'){
            SolvingInts.add(-5);
            intArray.add(-5);
        }
       }
            System.out.println("break each line into chars, add chars to ArrayList\n"
                    +"add this array list to final 2D ArrayList\n");
            System.out.println(rowArray+"\n");
            mazeArray.add(rowArray);
            SolvingMaze.add(SolvingRows);
            shortestArray.add(intArray);
            SolvingShortest.add(SolvingInts);
        }
   System.out.println("");
         System.out.println("after all little ArrayLists were added to 2D ArrayList\n"
                 +"this is the final 2D ArrayList printed one row at a time.\n");
         for(int i = 0; i< mazeArray.size(); i++){
         System.out.print(mazeArray.get(i)+"\n");
         }
         System.out.println("");
         
         System.out.println(" Asterisks correspond to -3, blanks correspond to -1, S corresponds to -5, and T corresponds to -7 \n");
         for(int i = 0; i< mazeArray.size(); i++){
         System.out.print(shortestArray.get(i)+"\n");
         }
         System.out.println("");
         System.out.println("now we are ready to search the 2D array for a way through =)\n");
   //Close the input stream
   in.close();
     }catch (Exception e){//Catch exception if any
   System.err.println("Error: " + e.getMessage());
   }
      }
    
}
