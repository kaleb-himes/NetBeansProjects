package minesweeper;


import java.awt.* ;
import java.awt.event.* ;
import java.awt.geom.* ;
import javax.swing.* ;
import javax.swing.event.* ;

public class MineSweeper{ //mines = -1
    static int rows=10;
    static int columns=10;
    public static void startNewGame(int width, int height){
    width=columns;
    height=rows;
    int mines = 10;
    while(mines>0){
        int x=(int) Math.floor ( Math.random ( ) * height );
        int y=(int) Math.floor ( Math.random ( )* width );
        int now = (height*y)+x;
        if(now != -1){
            now = -1;
            mines--;
        }
    }
/*Starts a new game with a randomly generated minefield that has width columns and height rows.*/
}
    int getWidth(){
        return columns;
    }
    
    int getHeight(){
        return rows;
    }

    boolean openCell(int x, int y){
        int now=(rows*y)+x;
        if(now == -1)
            return false;
        else if(now == 0){
          if(x<0 || x>10)
                return true;
         else if(y<0 || y>10)
                 return true;
             else if( now>1)
                   return true;
                      else{
                          openCell( x - 1, y );
                          openCell( x - 1, y - 1 );
                          openCell( x, y - 1 );
                          openCell( x + 1, y - 1 );
                          openCell( x + 1, y );
                          openCell( x + 1, y + 1 );
                          openCell( x , y + 1 );
                          openCell( x - 1, y + 1 );
                       }                 
                   }
/*Opens the cell at the coordinates (x,y), and if the value of the cell is zero, recursively opens all
the neighbouring cells. If the cell contains a mine, the method returns false, otherwise it returns
true.*/ return true;
        }

    boolean markCell(int x, int y){
        int now = ( rows * y ) + x ;
        if(now == -1)
            return true;
        else
            return false;
      /*Marks the cell at the coordinates (x,y) to be a presumed mine. If the cell really contains a mine,*/
/*the method returns true, otherwise it returns false.*/
}
    boolean isOpen(int x, int y){
        int now = ( rows * y ) + x ;
        if(now == 0)
        return true;
        else
        return false;
//Returns true if the cell at the coordinates (x,y) is open, and returns false otherwise.
}
    boolean isMarked(int x, int y){
         int now = ( rows * y ) + x ;
        if(now == -1)
            return true;
        else
            return false;
//Returns true if the cell at the coordinates (x,y) is marked as a mine, and returns false otherwise.

}
    int getValue(int x, int y){
        int now = ( rows * y ) + x ;
        int value=0;
        int left =(rows*(y))+(x-1);
        int right =(rows*(y))+(x+1);
        int up =(rows*(y-1))+(x);
        int upleft =(rows*(y-1))+(x-1);
        int upright =(rows*(y-1))+(x+1);
        int down =(rows*(y+1))+(x);
        int downleft =(rows*(y+1))+(x-1);
        int downright =(rows*(y+1))+(x+1);
        if(now == -1)
            return -1;
        else if(up == -1)
            value++;
                else if(down == -1)
                    value++;
                        else if(left == -1)
                            value++;
                            else if(right == -1)
                                value++;
                                else if(upright == -1)
                                    value++;
                                    else if(upleft == -1)
                                        value++;
                                        else if(downleft == -1)
                                            value++;
                                            else if(downright == -1)
                                                value++;
         return value;
/*If the cell at the coordinates (x,y) is not a mine, returns its numerical value, i.e., the number of
mines in its immediate neighbourhood. If the cell is a mine, returns -1.*/
        }
    }
