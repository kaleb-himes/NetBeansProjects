/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkingamethod;

/**
 *
 * @author Kaleb
 */
public class Checkingamethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char x = 97;
//        char y = (char)(x+1);
        System.out.println(x);
        for(int i = 0; i < 10000; i++){
        x++;
        System.out.println(x);
        }
//        System.out.println(y);
//        y++;
//        System.out.println(y);
        


    }
}
