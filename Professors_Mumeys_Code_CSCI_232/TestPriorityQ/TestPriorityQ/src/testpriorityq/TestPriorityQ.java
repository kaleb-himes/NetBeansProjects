/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testpriorityq;

import java.util.PriorityQueue;

/**
 *
 * @author Brendan
 */
public class TestPriorityQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(new Integer(10));
        pq.add(new Integer(5));
        pq.add(new Integer(10));
        pq.add(new Integer(20));

        while (! pq.isEmpty()) {
            System.out.println("next element: " + pq.poll());
        }
    }
}
