/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author kaleb.himes
 */
import java.util.ArrayList;
public class Queue {
    private int firstSpot;
//    ArrayList<Integer> Q1;
//    ArrayList<Integer> Q2;
//    ArrayList<Integer> Q3;
    ArrayList<Integer> Queue = new ArrayList<>();
    
    
    public Queue() {
        for( int i = 1;i< Queue.size();i++){
        firstSpot = Queue.get(0) ;  // empty stack
        }
    }
    
    // stack operations:
    
    public void push(int c) {
            Queue.add(c);
    }
    
    public int pop() {
        int c;
        if(!Queue.isEmpty()){
        c = Queue.get(Queue.size() - 1);
        Queue.remove(Queue.size() - 1);
        return c;
        }
        return 0;
        
    }
    public int total(){
        int t = 0;
         if(!Queue.isEmpty()){
            for(int i = 0; i < Queue.size() - 1; i++){
            t = (Queue.get(i)) + (Queue.get(i+1));
//            return t;
            }
         }
         return t;
    }
}
