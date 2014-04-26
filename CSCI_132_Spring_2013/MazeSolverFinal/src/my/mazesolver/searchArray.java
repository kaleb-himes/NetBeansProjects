/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.mazesolver;

import java.io.IOException;

/**
 *
 * @author kaleb.himes
 */
public class searchArray extends ReadInFile {
       public static void searchTheArray() throws IOException {
            ifStart();
            ifNotEnd();
   }
       public static int max(int[][] t) {
        int maximum = t[0][0];   // start with the first value
        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t.length; j++) {
                if (t[i][j] > maximum) {
                    maximum = t[i][j];   // new maximum
                }
            }
        }
        return maximum;
    }

    public static int min(int[][] t) {
        int minimum = t[0][0];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i][j] < minimum) {
                    minimum = t[i][j];   // new maximum
                }
            }
        }
        return minimum;
    }
    public static int moveUpInt(int m){
        for(int i = 0; i < mazeArray.size() ; i++){
             for(int j = 0; j < mazeArray.size(); j++){
                 m = mazeArray.get(i-1).get(j);
             }
        }
        return m;
    }
    public static int moveLeftInt(int m){
        for(int i = 0; i < mazeArray.size() ; i++){
             for(int j = 0; j < mazeArray.size(); j++){
                 m = mazeArray.get(i).get(j-1);
             }
        }
        return m;
    }
    public static int moveDownInt(int m){
        for(int i = 0; i < mazeArray.size() ; i++){
             for(int j = 0; j < mazeArray.size(); j++){
                 m = mazeArray.get(i+1).get(j);
             }
        }
        return m;
    }
    public static int moveRightInt(int m){
        for(int i = 0; i < mazeArray.size() ; i++){
             for(int j = 0; j < mazeArray.size(); j++){
                 m = mazeArray.get(i).get(j+1);
             }
        }
        return m;
    }
   
   public static void ifStart(){
       int x = 1;
             /**
             * this method will look for the start position in the maze.
             * it will then check up, right, down, and left to see where
             * possible moves could be made, if a move can be made, it 
             * will add that possible move to a stack as the char 1.
             */
       for(int i = 0; i < mazeArray.size() ; i++){
             for(int j = 0; j < mazeArray.size(); j++){
                 
             if(mazeArray.get(i).get(j).equals('S')){
                if(mazeArray.get(i-1).get(j).equals(' ')){
                mazeArray.get(i-1).set(j, '+');
                shortestArray.get(i-1).set(j, x);
                //CHANGE THE BLANK TO X
                }
                if(mazeArray.get(i).get(j-1).equals(' ')){
                mazeArray.get(i).set(j-1, '+');
                shortestArray.get(i).set(j-1, x);
                //CHANGE THE BLANK TO X
                }
                if(mazeArray.get(i+1).get(j).equals(' ')){
                mazeArray.get(i+1).set(j, '+');
                shortestArray.get(i+1).set(j, x);
                //CHANGE THE BLANK TO X
                }
                if(mazeArray.get(i).get(j+1).equals(' ')){
                mazeArray.get(i).set(j+1, '+');
                shortestArray.get(i).set(j+1, x);
                //CHANGE THE BLANK TO X
                } 
             }
           }
         } 
   }
   public static void ifNotEnd(){
       int y = 2;
       boolean notFound = true;
            /**
            * this method will now look at all the 1's and see which moves
            * could be made from there, then all the 2's, then the 3's and so on
            * until all blank chars have been accounted for and added to the stack
            */
       for(int t=0; t<mazeArray.size()*mazeArray.size(); t++){
        for(int i = 0; i < mazeArray.size(); i++){
             for(int j = 0; j < mazeArray.size(); j++){
                 // since x is now 2 we are looking for x-1 = 1
                 //HAVING ISSUES WITH THIS SEARCH METHOD NEED HELP
             if(mazeArray.get(i).get(j) == '+' && notFound == true){
                
                if(mazeArray.get(i).get(j-1).equals('T')){
                    foundEnd();
//                    notFound = false;
                }
                else if(mazeArray.get(i).get(j-1)!='T' && mazeArray.get(i).get(j-1).equals(' ')){
                mazeArray.get(i).set(j-1, '+');
                shortestArray.get(i).set(j-1, y);
                y++;
                }
                if(mazeArray.get(i-1).get(j).equals('T')){
                    foundEnd();
                    notFound = false;
                }
                else if(mazeArray.get(i-1).get(j)!='T' && mazeArray.get(i-1).get(j).equals(' ')){
                mazeArray.get(i-1).set(j, '+');
                shortestArray.get(i-1).set(j, y);
                y++;
                }
                if(mazeArray.get(i+1).get(j).equals('T')){
                    foundEnd();
                    notFound = false;
                }
                else if(mazeArray.get(i+1).get(j)!='T' && mazeArray.get(i+1).get(j).equals(' ')){
                mazeArray.get(i+1).set(j, '+');
                shortestArray.get(i+1).set(j, y);
                y++;
                }
                if(mazeArray.get(i).get(j+1).equals('T')){
                    foundEnd();
                    notFound = false;
                }
                else if(mazeArray.get(i).get(j+1)!='T' && mazeArray.get(i).get(j+1).equals(' ')){
                mazeArray.get(i).set(j+1, '+');
                shortestArray.get(i).set(j+1, y);
                y++;
                }             
             }             
        }             
        }        
        } 
   }
   public static void foundEnd(){
        System.out.println("");
        System.out.println("possible moves found");
         System.out.println("");
        for(int z = 0; z< mazeArray.size(); z++){
            System.out.print(mazeArray.get(z)+"\n");
        }
        
        System.out.println("");
        for(int z = 0; z< mazeArray.size(); z++){
            System.out.print(shortestArray.get(z)+"\n");
        }
   }
}
