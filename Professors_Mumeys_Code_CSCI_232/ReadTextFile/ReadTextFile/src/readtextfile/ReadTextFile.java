/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readtextfile;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author bmumey
 */
public class ReadTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String fileName = "C:/Users/Brendan/Desktop/maze.txt";
        try {
            Scanner scanner = new Scanner(new FileReader(fileName));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                char[] row = line.toCharArray();
                System.out.println(row);
        }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
