package my.calculator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Professor Mumey
 * @author ** Code was written in lecture at Montana State University,
 *            later EDITED BY Kaleb for use in this calculator with the
 *             consent of professor Mumey**
 */
public class MyStack {
    private StackNode topNode;
    
    public MyStack() {
        topNode = null;  // empty stack
    }
    
    // stack operations:
    
    public void push(StackNode node) {
        node.setPrevious(topNode);
        topNode = node;
    }
    
    public StackNode pop() {
        if (topNode == null) {
            return null;
        }
        StackNode currentTopNode = topNode;
        topNode = topNode.getPrevious();
        return currentTopNode;
    }
    public StackNode peek(){
        return topNode;
    }
}
