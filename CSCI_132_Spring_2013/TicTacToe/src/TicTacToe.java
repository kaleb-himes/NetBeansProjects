
import java.awt.GridLayout;
import javax.swing.*;


/**
 * Write a description of class TicTacToe here.
 * 
 * @author Brendan
 * @version 13 Jan 2011
 */
public class TicTacToe extends JFrame
{
    // instance variables - replace the example below with your own
    private char curPlayer;
    private char[][] board;

    /**
     * Constructor for objects of class TicTacToe
     */
    public TicTacToe()
    {
        super("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new char[3][3]; // initialize board

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {                
                board[i][j] = ' '; // blank char
            }
        }
        getContentPane().add(new TTTPanel(this));
        pack();
        curPlayer = 'X';
        
        setLocationRelativeTo(null);

        setVisible(true); // Show the JFrame.

    }
    public boolean ComputerAI(){
        
        for (int j = 0; j < 2; j++) {
                /*checks the vertical columns from the top down searching for
                 * two 'X's in a row if it does not find two it moves on to the
                 * next method, if it does find two X's it switches players and 
                 * stops this method with a value of true
                 */
            if(board[0][j] == 'O' && board[1][j] == 'O' && 
               board[2][j] == ' ') {
                            board[2][j] = 'O'; 
                            switchPlayer();
                            return true;
            } 
            // Same as above but instead checks from the botom to the top
                else if(board[2][j] == 'O' && board[1][j] == 'O' &&
                        board[0][j] == ' ' ) {
                            board[0][j] = 'O';
                            switchPlayer();
                            return true;
            }
                //Same as above but instead checks for two o's not in a row but
                //that could be connected with a blank in the center
                else if(board[0][j] == 'O' && board[2][j] == 'O' &&
                        board[1][j] == ' ' ) {
                            board[1][j] = 'O';
                            switchPlayer();
                            return true;
            }
            
         }
            /*This is identicle to the verticle method but instead checks the
             * horizontal rows for X's in in a row from right to left
             */
                for(int i = 0; i < 2; i++){
                    
                if(board [i][0] == 'O' && board[i][1] == 'O' &&
                   board [i][2] == ' ') {
                            board [i][2] = 'O';
                            switchPlayer();
                            return true;
                            
                    }
                // checks left to right
                else if(board [i][2] == 'O' && board[i][1] == 'O' &&
                        board [i][0] == ' ') {
                            board [i][0] = 'O';
                            switchPlayer();
                            return true;
                    }
                // checks for an two apart that could be connected in middle.
                else if(board [i][0] == 'O' && board[i][2] == 'O' &&
                        board [i][1] == ' ') {
                            board [i][1] = 'O';
                            switchPlayer();
                            return true;
                    }
                }
                /*These methods all check the horizontal plays that could result
                 * in a win and attempts to block those possible winning moves.
                 */
                if(board[0][0] == 'O' && board[1][1] == 'O' &&
                   board[2][2] == ' ') {
                    board[2][2] = 'O';
                    switchPlayer();
                    return true;
        }
                else if(board [0][2] == 'O' && board[1][1] == 'O' &&
                        board[2][0] == ' ') {
                    board[2][0] = 'O';
                    switchPlayer();
                    return true;
        }
                else if(board [0][0] == 'O' && board[2][2] == 'O' &&
                        board[1][1] == ' ') {
                    board[1][1] = 'O';
                    switchPlayer();
                    return true;
        }
                else if(board [0][2] == 'O' && board[2][0] == 'O' &&
                        board[1][1] == ' ') {
                    board[1][1] = 'O';
                    switchPlayer();
                    return true;
        }
                else if(board[2][2] == 'O' && board[1][1] == 'O' &&
                        board[0][0] == ' ') {
                    board[0][0] = 'O';
                    switchPlayer();
                    return true;
        }
                else if(board[2][0] == 'O' && board[1][1] =='O' &&
                        board[0][2] == ' ') {
                    board[0][2] = 'O';
                    switchPlayer();
                    return true;
        }
        
        for (int j = 0; j < 2; j++) {
                /*checks the vertical columns from the top down searching for
                 * two 'X's in a row if it does not find two it moves on to the
                 * next method, if it does find two X's it switches players and 
                 * stops this method with a value of true
                 */
            if(board[0][j] == 'X' && board[1][j] == 'X' && 
               board[2][j] == ' ') {
                            board[2][j] = 'O'; 
                            switchPlayer();
                            return true;
            } 
            // Same as above but instead checks from the botom to the top
                else if(board[2][j] == 'X' && board[1][j] == 'X' &&
                        board[0][j] == ' ' ) {
                            board[0][j] = 'O';
                            switchPlayer();
                            return true;
            }
                //Same as above but instead checks for two x's not in a row but
                //that could be connected with a blank in the center
                else if(board[0][j] == 'X' && board[2][j] == 'X' &&
                        board[1][j] == ' ' ) {
                            board[1][j] = 'O';
                            switchPlayer();
                            return true;
            }
            
         }
            /*This is identicle to the verticle method but instead checks the
             * horizontal rows for X's in in a row from right to left
             */
                for(int i = 0; i < 2; i++){
                    
                if(board [i][0] == 'X' && board[i][1] == 'X' &&
                   board [i][2] == ' ') {
                            board [i][2] = 'O';
                            switchPlayer();
                            return true;
                            
                    }
                // checks left to right
                else if(board [i][2] == 'X' && board[i][1] == 'X' &&
                        board [i][0] == ' ') {
                            board [i][0] = 'O';
                            switchPlayer();
                            return true;
                    }
                // checks for an two apart that could be connected in middle.
                else if(board [i][0] == 'X' && board[i][2] == 'X' &&
                        board [i][1] == ' ') {
                            board [i][1] = 'O';
                            switchPlayer();
                            return true;
                    }
                }
                /*These methods all check the horizontal plays that could result
                 * in a win and attempts to block those possible winning moves.
                 */
                if(board[0][0] == 'X' && board[1][1] == 'X' &&
                   board[2][2] == ' ') {
                    board[2][2] = 'O';
                    switchPlayer();
                    return true;
        }
                else if(board [0][2] == 'X' && board[1][1] == 'X' &&
                        board[2][0] == ' ') {
                    board[2][0] = 'O';
                    switchPlayer();
                    return true;
        }
                else if(board [0][0] == 'X' && board[2][2] == 'X' &&
                        board[1][1] == ' ') {
                    board[1][1] = 'O';
                    switchPlayer();
                    return true;
        }
                else if(board [0][2] == 'X' && board[2][0] == 'X' &&
                        board[1][1] == ' ') {
                    board[1][1] = 'O';
                    switchPlayer();
                    return true;
        }
                else if(board[2][2] == 'X' && board[1][1] == 'X' &&
                        board[0][0] == ' ') {
                    board[0][0] = 'O';
                    switchPlayer();
                    return true;
        }
                else if(board[2][0] == 'X' && board[1][1] =='X' &&
                        board[0][2] == ' ') {
                    board[0][2] = 'O';
                    switchPlayer();
                    return true;
        }
                else {
                    randomMove();
                    switchPlayer();
                    return true;
                }
        
        
    }
    
    //If none of the above methods are found then the computer will make a random
    //move with the below method.
    public void randomMove(){
        int x;
        int y; 
        
         if(board[1][1] == ' ') {
               board[1][1] = 'O';
                    }
         else if(board[1][1] != ' '){
            x = (int) (Math.random()*3);
            y = (int) (Math.random()*3);
            if(board[x][y] == ' ') {
                board[x][y] = 'O';
            }
            else{ 
                checkFullBoard();
                checkForGameEnd();
                randomMove();
                
                
            }
         }
     }
    
    public void resetBoard(){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j <2; j++){
                board[i][j]=' ';
                
            }
        }
            
    }
            
    public char getCurPlayer() {
        return curPlayer;
    }
  

    public void switchPlayer() {
        if (curPlayer == 'X') {
            curPlayer = 'O';
        }
        else {
            curPlayer = 'X';
        }
    }
    

    public void setSquare(int x, int y, char c) 
    {
        board[x][y] = c;
    }

    public char getSquare(int x, int y) 
    {
        return board[x][y];
    }

    public void printBoard() 
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
    }

    private boolean checkForWin(char p) {

        boolean win = false;
        // check row wins:
        for (int i = 0; i < 3; i++) {
            win = win || (board[i][0] == p && board[i][1] == p && board[i][2] == p);
        }
        // check column wins:
        for (int j = 0; j < 3; j++) {
            win = win || (board[0][j] == p && board[1][j] == p && board[2][j] == p);
        }
        // check diagonal wins:
        win = win || (board[0][0] == p && board[1][1] == p && board[2][2] == p);
        win = win || (board[0][2] == p && board[1][1] == p && board[2][0] == p);

        return win;
    }

    private boolean checkFullBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public void checkForGameEnd() {
        if (checkForWin('X')) {
            JOptionPane.showMessageDialog(this, "X wins!!!!");
            System.exit(0);
        } else if (checkForWin('O')) {
            JOptionPane.showMessageDialog(this, "O wins!!!!");
            System.exit(0);
        } else if (checkFullBoard()) {
            JOptionPane.showMessageDialog(this, "Game over, draw.");
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        TicTacToe newGame = new TicTacToe();
        //JOptionPane.showMessageDialog(newGame, "This is a test.");
    }
}
