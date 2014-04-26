/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brendan
 */
public class PostfixEvaluation {

    public static double evaluatePostfix(String expression) {
        MyStack operandStack = new MyStack();
        String[] tokens = expression.split("\\s+"); // this splits the string on spaces
        for (int i = 0; i < tokens.length; i++) {
            String curToken = tokens[i];
            //System.out.println("token " + i + " = " + curToken);
            char firstChar = curToken.charAt(0);
            if (Character.isDigit(firstChar)) { // curToken is a number
                double value = Double.parseDouble(curToken);
                operandStack.push(new StackNode(value));
            } else {
                double rhs = operandStack.pop().getValue();
                double lhs = operandStack.pop().getValue();
                double result = 0.0;
                switch (firstChar) {
                    case '+':
                        result = lhs + rhs;
                        break;
                    case '-':
                        result = lhs - rhs;
                        break;
                    case '*':
                        result = lhs * rhs;
                        break;
                    case '/':
                        result = lhs / rhs;
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
    public static void main(String[] args) {
        // TODO code application logic 

        String test = "1.5 1.5 + 2.0 -";
        System.out.println(test + " evaluates to: " +evaluatePostfix(test));
    }
}
