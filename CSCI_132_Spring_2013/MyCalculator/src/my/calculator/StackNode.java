package my.calculator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Professor Mumey
 * @author ** Code was written in lecture at Montana State University,
 *            later EDITED BY Kaleb for use in this calculator with the
              consent of professor Mumey**
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
