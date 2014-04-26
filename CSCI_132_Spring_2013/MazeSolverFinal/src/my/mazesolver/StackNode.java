package my.mazesolver;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brendan
 */
public class StackNode {
    private StackNode previous;
    private int number;
    
    public StackNode(int c) {
        number = c;
        previous = null;
    }
    
    public void setPrevious(StackNode node) {
        previous = node;
    }
    
    public StackNode getPrevious() {
        return previous;
    }
    
    public int getChar() {
        return number;
    }
}
