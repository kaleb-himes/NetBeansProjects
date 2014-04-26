/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package solvemaze;

import java.io.FileReader;
import java.util.Scanner;
import java.util.LinkedList;

/**
 *
 * @author bmumey
 */
public class SolveMaze {

    /**
     * @param args the command line arguments
     */
    static int numRows, numCols;
    static char[][] maze;
    static int startI, startJ;

    public static void printMaze() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    public static void findPath(MazePosition Tposition) {
        // clear breadcrumbs:
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (maze[i][j] == 'b') {
                    maze[i][j] = ' ';
                }
            }
        }
        // reconstruct path:
        MazePosition curPos = Tposition;
        while (curPos != null) {
            if (maze[curPos.i][curPos.j] == ' ') {
                maze[curPos.i][curPos.j] = '+';
            }
            curPos = curPos.previousPosition;
        }
        // print out maze:
        System.out.println("Solution:");
        printMaze();
    }

    public static void exploreMaze() {

        LinkedList<MazePosition> Q = new LinkedList<MazePosition>();
        Q.offer(new MazePosition(startI, startJ, null));

        while (Q.peek() != null) {
            MazePosition curPos = Q.poll();
            if (maze[curPos.i][curPos.j] == 'T') {
                System.out.println("found T!");
                findPath(curPos);
                return;
            }
            if (maze[curPos.i][curPos.j] != 'S') {
                maze[curPos.i][curPos.j] = 'b';
            }
            MazePosition north = new MazePosition(curPos.i - 1, curPos.j, curPos);
            MazePosition south = new MazePosition(curPos.i + 1, curPos.j, curPos);
            MazePosition west = new MazePosition(curPos.i, curPos.j - 1, curPos);
            MazePosition east = new MazePosition(curPos.i, curPos.j + 1, curPos);
            if (maze[north.i][north.j] == ' ' || maze[north.i][north.j] == 'T') {
                Q.offer(north);
            }
            if (maze[south.i][south.j] == ' ' || maze[south.i][south.j] == 'T') {
                Q.offer(south);
            }
            if (maze[west.i][west.j] == ' ' || maze[west.i][west.j] == 'T') {
                Q.offer(west);
            }
            if (maze[east.i][east.j] == ' ' || maze[east.i][east.j] == 'T') {
                Q.offer(east);
            }

        }
        System.out.println("No path found!");
    }

    public static void main(String[] args) {
        // TODO code application logic here

        String fileName = "C:/Users/Brendan/Desktop/maze.txt";
        try {
            Scanner scanner = new Scanner(new FileReader(fileName));
            numRows = scanner.nextInt();
            numCols = scanner.nextInt();
            maze = new char[numRows][];
            scanner.nextLine();
            //System.out.println("numRows = " + numRows + " numCols = " + numCols);
            for (int i = 0; i < numRows; i++) {
                String line = scanner.nextLine();
                maze[i] = line.toCharArray();
            }
            numCols = maze[0].length; // easy way to get maze width

            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    if (maze[i][j] == 'S') {
                        startI = i;
                        startJ = j;
                    }
                }
            }
            //System.out.println("startI = " + startI + " startJ = " + startJ);

            System.out.println("Maze:");
            printMaze();

            exploreMaze();

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
