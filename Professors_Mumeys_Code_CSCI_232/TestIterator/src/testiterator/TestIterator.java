/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testiterator;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Brendan
 */
public class TestIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> aList = new ArrayList<Integer>();
        
        for (int i = 0; i < 100; i++) {
            aList.add(new Integer(i));
        }
        
        Iterator<Integer> aListIterator = aList.iterator();
        while (aListIterator.hasNext()) {
            Integer nextInteger = aListIterator.next();
            System.out.println(nextInteger);
        }
        
    }
}
