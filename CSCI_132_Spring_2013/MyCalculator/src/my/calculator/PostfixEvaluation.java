package my.calculator;

import java.text.DecimalFormat;
import java.util.ArrayList;

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

public class PostfixEvaluation {
    public static double evaluatePostfix(String expression){
        MyStack operandStack = new MyStack();
        //this is to break the sting up in preparation to be read through to see what we have.
        String[] tokens = expression.split("\\s+"); //this will split the sting on spaces
        //this will read through the sting one item at a time.
        for(int i = 0; i < tokens.length; i++){
            //the current token is...
            String curToken = tokens[i];
            char firstChar = curToken.charAt(0);
            //now we need to find out if the current token is an operation or a number
            //if number, push onto stack
            if(Character.isDigit(firstChar)){
                double value = Double.parseDouble(curToken);
                operandStack.push(new StackNode(value));
            } else { //if operation, perform that operation
                double rightside = operandStack.pop().getValue();
                double leftside = operandStack.pop().getValue();
                double result = 0.0;
                switch (firstChar){
                    case '+' : 
                        result = leftside + rightside;
                        break;
                    case '-' : 
                        result = leftside - rightside;
                        break;
                    case '*' : 
                        result = leftside * rightside;
                        break;
                    case '/' : 
                        result = leftside / rightside;
                        break;
                }
                operandStack.push(new StackNode(result));
            }
        }
        double expressionValue = operandStack.pop().getValue();
        return expressionValue;
    }
    
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void calculate() {
        String inputReturn = calculatorUI.input.getText();
        String s3 = inputReturn;
        //convert s3 to post-fix;
        InfixToPostfixParens converter = new InfixToPostfixParens();
        try{
            String s3conv = converter.convert(s3);
            calculatorUI.output.setText(Double.toString(evaluatePostfix(s3conv)));
        }catch (Exception ex){
         calculatorUI.woops();   
        }
    }
}