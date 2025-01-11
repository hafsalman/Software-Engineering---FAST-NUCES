//Hafsa Salman
//22K-5161
//Task no. 05

import java.util.Stack;

public class Task_05
{
    public static double evaluatePostfix(String postfixExpression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = postfixExpression.split("\\s+");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = evaluateExpression(operand1, operand2, token);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static double evaluateExpression(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) throw new ArithmeticException("Division by zero");
                return operand1 / operand2;
            case "^":
                return Math.pow(operand1, operand2);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 05");
        System.out.println();

        String postfixExpression = "3 4 + 5 *";
        double result = evaluatePostfix(postfixExpression);
        System.out.println("Result: " + result);
    }
}
