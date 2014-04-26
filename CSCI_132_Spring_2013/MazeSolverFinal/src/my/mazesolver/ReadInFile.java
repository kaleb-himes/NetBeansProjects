package my.mazesolver;
/**
 *
 * @author Kaleb
 * @version 26 Feb 2013
 */
import java.io.*;
import java.util.ArrayList;
 class ReadInFile{
     static boolean test1 = false;//source file = src1
     static boolean test2 = true;//source file = src2
     public static String source;
     public static final String src1 = "src\\inputmaze.txt";//the src for test1
     public static final String src2 = "src\\inputLarge.txt";//the src for test2
     static ArrayList<ArrayList<Character>> mazeArray = new ArrayList<ArrayList<Character>>();
     static ArrayList<ArrayList<Character>> SolvingMaze = new ArrayList<ArrayList<Character>>();
     static ArrayList<ArrayList<Integer>> shortestArray = new ArrayList<ArrayList<Integer>>();
     static ArrayList<ArrayList<Integer>> SolvingShortest = new ArrayList<ArrayList<Integer>>();
     public static char aChar;
     public static int smallestAdjacent;
     static int one = 0;
     static int two = 0;
     static int three = 0;
     static int four = 0;
     static int smallestNumT = 0;
     static int smallestNumGeneral = 0;
     
    
     
      
     
      public static void readInFile(){
   try{
   // Open the file that is set to true in the class variables
       if(test1 == true && test2 == false){
       source = src1;
       }
       if(test1 == false && test2 == true){
       source = src2;
       }
       if(test1 == true && test2 == true){
           System.out.println("You are attempting to solve two mazes at once, "
                   + "please choose only one maze to solve,\n"+"refer to class"
                   + "ReadInFile and set the test you would like to run to TRUE "
                   + "for whichever maze you would like to solve");
       }
       if(test1 == false && test2 == false){
           System.out.println("You have not selected a maze to solve, "
                   + "refer to class ReadInFile and set one of the tests to "
                   + "true to solve that maze");
       } 
   FileInputStream fstream = new FileInputStream(source);
       
   // Get the object of DataInputStream        
   DataInputStream in = new DataInputStream(fstream);
   BufferedReader br = new BufferedReader(new InputStreamReader(in));
   String strLine;
   //Read File Line By Line
   while ((strLine = br.readLine()) != null)   {
   // Print the content on the console
    System.out.println (strLine); 
    for(int token = 0; token < strLine.length(); token++){
    aChar = strLine.charAt(token);
    /**
     * the below line was for testing, remove the comment if you want to see that
     * it is properly parsing each line as it is read in. 
    */
     //System.out.println("the "+ token+" token is "+ aChar);
   } 
   }
   //Close the input stream
   in.close();
     }catch (Exception e){//Catch exception if any
   System.err.println("Error: " + e.getMessage());
   }
      }

      

   //SEARCHING THE ARRAY FOR SHORTEST ROUTE

 
    public static void main(String args[]) throws IOException{
         try{
        readInFile();
        createArray.createTheArray();
        searchArray.searchTheArray();
        solvingShortest.shortestRoute();
        }catch(IndexOutOfBoundsException ex){
            
        }
    }
 }
  