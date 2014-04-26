/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kaleb
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
            System.out.println("token "+i+" = "+curToken);
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
    public static void main(String[] args) {
        String s1 = "10 2 3 * +";
        System.out.println(s1+" evaluates to "+evaluatePostfix(s1));
        
        String s2 = "3 4 5 6 7 8 * / + - *";
        System.out.println(s2+" evaluates to "+evaluatePostfix(s2));
        
        String s3 = "(10 + 2) * ((4 / 2) + 5)";
        //convert s3 to post-fix;
        InfixToPostfixParens converter = new InfixToPostfixParens();
        try{
            String s3conv = converter.convert(s3);
            System.out.println(s3+" converts to "+ s3conv);
            System.out.println(s3+" evaluates to "+evaluatePostfix(s3conv));
        }catch (Exception ex){    
        };
        System.out.println(evaluatePostfix("1.5 1.5 + 2.0 -"));
    }
}
