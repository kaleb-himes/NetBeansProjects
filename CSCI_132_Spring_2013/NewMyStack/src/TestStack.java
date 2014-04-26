/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brendan
 */
public class TestStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push('a');
        myStack.push('b');
        myStack.push('c');
        
        char peek = myStack.peek();
        System.out.println("peek =" + peek);
        char current = myStack.pop();
        while (current != ' ') {
            System.out.println(current);
            peek = myStack.peek();
            System.out.println("peek =" + peek);
            current = myStack.pop();
        
        }
    }
}

