package mstake2;

import javax.swing.*;

public class MSTake2 extends JFrame
{
    // instance variables - replace the example below with your own
    private char curPlayer;
    private char[][] board;
    private int Mine; //used in the randomplacement() method.
    

    /**
     * Constructor for objects of class MineSweeper
     */
    public MSTake2()
    {
        super("Mine Sweeper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new char[15][15]; // initialize board
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {                
                board[i][j] = ' '; // blank char
            }
        }
        getContentPane().add(new MSP2(this));
        pack();
        curPlayer = '*';
        
        setLocationRelativeTo(null);

        setVisible(true); // Show the JFrame.

    }
    public boolean placeMines(){
        if(curPlayer == '*'){
            randomPlacement(); //the method for placing the mines
            curPlayer = '_';
        }   return false;
    } 
    
    public boolean randomPlacement(){
        int x;
        int y; 
        /** 
         * I had to make it so the mines could never be in a square
         * right on the edge of the board, for purposes of putting a number
         * in the squares adjacent to the mine letting you know how many mines 
         * are near said square. if the mines could be on the edge of the board
         * the method would come back with an out of bounds exception error.
         * given more time i could have fixed but this was easier with such a 
         * time crunch on such a lengthly program.
         */
         for(int i = 0; i < 14; i++){
            x = (int) (Math.random()*11 + 2); 
            y = (int) (Math.random()*11 + 2);
            if(board[x][y] == ' ' && board[x][y] != '*') {
                board[x][y] = '*';
                if(i == 15){ //once fifteen mines are in place return false to
                             // stop placing mines.
                    return false;
                }
            }
            else if(board[x][y] == '*'){
                i = i - 1; //if a mine is accidently placed on top of an already
                           //existing mine, the program will say "oops", take
                           // one away from the value of i and continue placing
                           //mines so that there will always be fifteen total.
            }  
         }
         
         for(int i = 1; i < 14; i++){
             for(int j = 1; j < 14; j++){
         Mine = 0; // initially zero
        if(board[i][j]== ' '){ 
            /**
             * each time a mine is placed the following code will check the 
             * squares adjacent to any empty square, if an empty square finds
             * there is a mine residing close by it will increase the value of
             * "mine" by 1. after checking all squares next to that empty square
             * it will move on to the next until all squares have been checked.
             * however many mines are found residing next to a square will be 
             * the number you see displayed in an empty box bordering a mine
             */
            if(board[i-1][j-1] == '*'){
                Mine++;
                }
            if(board[i][j-1] == '*'){
                Mine++;
                }
            if(board[i+1][j-1] == '*'){
                Mine++;
                }
            if(board[i-1][j] == '*'){
                Mine++;
                }
            if(board[i+1][j] == '*'){
                Mine++;
                }
            if(board[i-1][j+1] == '*'){
                Mine++;
                }
            if(board[i][j+1] == '*'){
                Mine++;
                }
            if(board[i+1][j+1] == '*'){
                Mine++; 
                }
        }
        /**
         * this is the method that tells an empty square what value should
         * be displayed in it if there is a mine nearby.
         */
        if(board[i][j] == ' '){
            if(Mine == 0){
                board[i][j] = ' ';
                }
            if(Mine == 1){
                board[i][j] = '1';
                }
            if(Mine == 2){
                board[i][j] = '2';
                }
            if(Mine == 3){
                board[i][j] = '3';
                }
            if(Mine == 4){
                board[i][j] = '4';
                }
            if(Mine == 5){
                board[i][j] = '5';
                }
            if(Mine == 6){
                board[i][j] = '6';
                }
            if(Mine == 7){
                board[i][j] = '7';
                }
            if(Mine == 8){
                board[i][j] = '8';
                }
        }
             }
        }
         return true;
    }
    public void ComputerAI(int i, int j){
      /**
       * this was meant to uncover any empty squares bordering an empty square
       * that had been clicked on and then the squares bordering that one and 
       * so on, however once i got into it I found it to 
       * be much more lengthly than i had anticipated so i stopped at just 
       * checking all the squares immediately adjacent to the one clicked.
       */
        if(i <=13 && i >= 1 && j <= 13 && j >= 1 && board[i][j]== '_'){ 
            
            if(board[i-1][j-1] == ' ' || board[i-1][j-1] == '1' || 
                    board[i-1][j-1] == '2'|| board[i-1][j-1] == '3' || 
                    board[i-1][j-1] == '4' || board[i-1][j-1] == '5' ||
                    board[i-1][j-1] == '6' || board[i-1][j-1] == '7' ||
                    board[i-1][j-1] == '8'){
                board[i-1][j-1] = '_';
                }
            if(board[i][j-1] == ' ' || board[i][j-1] == '1' || 
                    board[i][j-1] == '2'|| board[i][j-1] == '3' || 
                    board[i][j-1] == '4' || board[i][j-1] == '5' ||
                    board[i][j-1] == '6' || board[i][j-1] == '7' ||
                    board[i][j-1] == '8'){
                board[i][j-1] = '_';
                }
            if(board[i+1][j-1] == ' ' || board[i+1][j-1] == '1' || 
                    board[i+1][j-1] == '2'|| board[i+1][j-1] == '3' || 
                    board[i+1][j-1] == '4' || board[i+1][j-1] == '5' ||
                    board[i+1][j-1] == '6' || board[i+1][j-1] == '7' ||
                    board[i+1][j-1] == '8'){
                board[i+1][j-1] = '_';
                }
            if(board[i-1][j] == ' ' || board[i-1][j] == '1' || 
                    board[i-1][j] == '2'|| board[i-1][j] == '3' || 
                    board[i-1][j] == '4' || board[i-1][j] == '5' ||
                    board[i-1][j] == '6' || board[i-1][j] == '7' ||
                    board[i-1][j] == '8'){
                board[i-1][j] = '_';
                }
            if(board[i+1][j] == ' ' || board[i+1][j] == '1' || 
                    board[i+1][j] == '2'|| board[i+1][j] == '3' || 
                    board[i+1][j] == '4' || board[i+1][j] == '5' ||
                    board[i+1][j] == '6' || board[i+1][j] == '7' ||
                    board[i+1][j] == '8'){
                board[i+1][j] = '_';
                }
            if(board[i-1][j+1] == ' ' || board[i-1][j+1] == '1' || 
                    board[i-1][j+1] == '2'|| board[i-1][j+1] == '3' || 
                    board[i-1][j+1] == '4' || board[i-1][j+1] == '5' ||
                    board[i-1][j+1] == '6' || board[i-1][j+1] == '7' ||
                    board[i-1][j+1] == '8'){
                board[i-1][j+1] = '_';
                }
            if(board[i][j+1] == ' ' || board[i][j+1] == '1' || 
                    board[i][j+1] == '2'|| board[i][j+1] == '3' || 
                    board[i][j+1] == '4' || board[i][j+1] == '5' ||
                    board[i][j+1] == '6' || board[i][j+1] == '7' ||
                    board[i][j+1] == '8'){
                board[i][j+1] = '_';
                }
            if(board[i+1][j+1] == ' ' || board[i+1][j+1] == '1' || 
                    board[i+1][j+1] == '2'|| board[i+1][j+1] == '3' || 
                    board[i+1][j+1] == '4' || board[i+1][j+1] == '5' ||
                    board[i+1][j+1] == '6' || board[i+1][j+1] == '7' ||
                    board[i+1][j+1] == '8'){
                board[i+1][j+1] = '_'; 
                }
            }
    }
    /**
     * this would be used as a helper method if a reset button were added
     * to the GUI however I wasted more time on the above method and was unable 
     * to get to the button implementing.
     */
    public void resetBoard(){
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j++){
                board[i][j]=' ';
                
            }
        }
            
    }
    /**
     * this code was written by the original author of the TICTACTOE
     * program that I modified for this so credit goes to him 
     *  it was a good method so i kept it the same and it's still used the same.
     */
            
    public char getCurPlayer() {
        return curPlayer;
    }
  
// see above only slightly modified by me
    public void switchPlayer() {
        if (curPlayer == '_') {
                curPlayer = '_';
        }
     
        else {
            curPlayer = '_';
        }
    }
   // see above
    public void setSquare(int x, int y, char c) 
    {
        board[x][y] = c;
    }
// see above
    public char getSquare(int x, int y) 
    {   
        return board[x][y];
    }
// see above
    public void printBoard() 
    {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
    }
// if you ever click on a square containing an '*' which is a bomb for 
// all intensive purposes, you will activate this method resulting in a game over
    private boolean checkForLose(char p) {
        boolean lose = false;
        // check row wins:
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
            lose = lose || (board[i][j] == p);
        }
        }
        return lose;
    
    }

// if the whole board is full of '*'s and '_'s, and you have not clicked on an
//'*' this will activate and you will win.
    private boolean checkFullBoard() {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
//checks after every click to see if you filled the board without stepping on a mine.
    public void checkForWin(){
        if (checkFullBoard()) {
            JOptionPane.showMessageDialog(this, "YOU WIN! Congrats on not blowing your foot off!");
            System.exit(0);
        }
    }
    // activates if you click on an '*'.
    public void checkForGameEnd(){
        if(checkForLose('*')){
            JOptionPane.showMessageDialog(this, "Game over, You Stepped on a Mine.");
            System.exit(0);
        }
        

    }

    public static void main(String[] args) {
        MSTake2 newGame = new MSTake2();
        //JOptionPane.showMessageDialog(newGame, "This is a test.");
    }
}

