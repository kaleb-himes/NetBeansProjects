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
    private char character;
    
    public StackNode(char c) {
        character = c;
        previous = null;
    }
    
    public void setPrevious(StackNode node) {
        previous = node;
    }
    
    public StackNode getPrevious() {
        return previous;
    }
    
    public char getChar() {
        return character;
    }
}
