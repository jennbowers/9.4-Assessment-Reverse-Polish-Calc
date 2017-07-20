import java.util.Stack;

/**
 * Created by jenniferbowers on 7/20/17.
 */

public class ReversePolishCalc {
    // The stack
    private Stack<Double> stack = new Stack();

    // You'll need a variable here to keep track of the top of the stack
//    private Double topOfStack = stack.get(0);

    // The array of the input string split up
    private String[] tokens;


    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = input.split(",");

        // 2. Allocate a stack as big as the number of tokens
//        stack = new Stack(tokens.length);

        // 3. write the algorithm
        double firstOperand;
        double secondOperand;
        double tempSolution;

        for(int i = 0; i < tokens.length; ++i) {
            if (tokens[i].equals("+")) {
                firstOperand = stack.pop();
                secondOperand = stack.pop();
                tempSolution = secondOperand + firstOperand;
                stack.push(tempSolution);
                System.out.println(stack);
            } else if (tokens[i].equals("-")) {
                firstOperand = stack.pop();
                secondOperand = stack.pop();
                tempSolution = secondOperand - firstOperand;
                stack.push(tempSolution);
                System.out.println(stack);
            } else if (tokens[i].equals("*")) {
                firstOperand = stack.pop();
                secondOperand = stack.pop();
                tempSolution = secondOperand * firstOperand;
                stack.push(tempSolution);
                System.out.println(stack);
            } else if (tokens[i].equals("/")) {
                firstOperand = stack.pop();
                secondOperand = stack.pop();
                tempSolution = secondOperand / firstOperand;
                stack.push(tempSolution);
                System.out.println(stack);
            } else {
                stack.push(Double.parseDouble(tokens[i]));
                System.out.println(stack);
            }
        }

        // 4. return the result
        System.out.println(stack.pop());
        return stack.pop();
    }

//    private void push(String number) {
//        // push on the stack
//    }
//
//    private void push(double d) {
//        // change the double to a string and then push it on the stack
//    }
//
//    private double pop() {
//        // remove the string from the top of the stack and convert it to a double and return it
//    }
}

