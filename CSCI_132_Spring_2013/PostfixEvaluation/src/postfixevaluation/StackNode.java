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
    private double value;
    
    public StackNode(double v) {
        value = v;
        previous = null;
    }
    
    public void setPrevious(StackNode node) {
        previous = node;
    }
    
    public StackNode getPrevious() {
        return previous;
    }
    
    public double getValue() {
        return value;
    }
}
