/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.Stack.Projects;

import datastructure.Stack.Stack;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author KALKIDAN
 */
public class Calculator {

    public static void main(String[] args) {
        Calculator cal = new Calculator();//
        System.out.println("infinix  " + Arrays.toString(cal.infinixToPostfixConverter("")));
        System.out.println(cal.postfixCalculator(cal.infinixToPostfixConverter("(2+(2^4)")));

    }

    public static int infinxSize = -1;

    public boolean isDigit(String in) {
        try {
            Double.valueOf(in);
            return true;
        } catch (NumberFormatException e) {
        }

        return false;
    }

    public int precedence(String operator) {

        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "x":
            case "/":
                return 2;
            case "^":
                return 3;
            case "$":
                return 4;
            default:
                break;
        }
        return 0;
    }

    public String[] infinixToPostfixConverter(String infinxExpression) {
        if (infinxExpression == null) {
            return new String[]{};
        }
        Stack<String> stack = new Stack<>();
        Pattern pattern = Pattern.compile("((\\d*\\.\\d+)|(\\d+)|([\\$\\^\\+\\-\\(x)/\\(/)]))");
        String postfixExpression[] = new String[infinxExpression.length()+1];
        Matcher matcher = pattern.matcher(infinxExpression);
        while (matcher.find()) {
            String expression = matcher.group();
            if (isDigit(expression)) {
                postfixExpression[++infinxSize] = expression;
            } else if ("(".equals(expression)) {
                stack.push(expression);
            } else if (")".equals(expression)) {
                while (!stack.isEmpty() && !"(".equals(stack.peek())) {
                    postfixExpression[++infinxSize] = stack.peek();
                    stack.pop();
                }
                stack.pop();
            } else {
                if (!stack.isEmpty()) {
                    while (!stack.isEmpty() && precedence(expression) <= precedence((String) stack.peek())) {
                        postfixExpression[++infinxSize] = stack.peek();
                        stack.pop();
                    }
                }

                stack.push(expression);
            }
        }      
        while (!stack.isEmpty()) {
            postfixExpression[++infinxSize] = stack.pop();
        }

        return postfixExpression;
    }

    public double postfixCalculator(String postfixExpression[]) {
        if (postfixExpression.length <= 2) {
            return 0;
        }
        System.out.println(" Arays : " + Arrays.toString(postfixExpression));
        double x = 0, y = 0, result = 0;
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i <= infinxSize; i++) {
            String expre = postfixExpression[i];
            if (isDigit(expre)) {
                stack.push(Double.valueOf(expre));

            } else if (expre.equals("$")) {
                x = stack.pop();
                stack.push(-x);
            } else if (expre.equals("(")) {

            } else if (expre.equals("%")) {
                x = stack.pop();
                stack.push(x / 100);
            } else {
                if (!stack.isEmpty()) {
                    x = stack.pop();
                }
                if (!stack.isEmpty()) {
                    y = stack.pop();
                }
                switch (expre) {
                    case "+":
                        stack.push(y + x);
                        break;
                    case "-":
                        stack.push(y - x);
                        break;
                    case "x":
                        stack.push(y * x);
                        break;
                    case "/":
                        stack.push(y / x);
                        break;
                    case "^":
                        stack.push(Math.pow(y, x));
                        break;
                }
            }
            y = 0;
            x = 0;
        }
        if (!stack.isEmpty()) {
            result = stack.pop();
        }

        infinxSize = -1;
        return result;
    }

}
