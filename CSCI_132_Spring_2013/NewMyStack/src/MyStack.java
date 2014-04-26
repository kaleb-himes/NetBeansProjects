/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brendan
 */
import java.util.ArrayList;
public class MyStack {
    private char topNode;
    ArrayList<Character> StackNode;
    ArrayList<Character> Stack = new ArrayList<Character>();
    
    public MyStack() {
        for( int i=1;i<Stack.size();i++){
        topNode =Stack.get(0) ;  // empty stack
        }
    }
    
    // stack operations:
    
    public void push(char c) {
            Stack.add(c);
    }
    
    public char pop() {
        char c;
        if(!Stack.isEmpty()){
        c = Stack.get(Stack.size() - 1);
        Stack.remove(Stack.size() - 1);
        return c;
        }
        return ' ';
        
    }
    public char peek(){
        char d;
         if(!Stack.isEmpty()){
         d = Stack.get(Stack.size() - 1);
         return d;
         }
         return ' ';
    }
}
