/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brendan
 */

package solvemaze;

public class MazePosition {

    public int i, j;
    public MazePosition previousPosition;
    
    public MazePosition (int i, int j, MazePosition p) {
        this.i = i;
        this.j = j;
        previousPosition = p;
    }
}
