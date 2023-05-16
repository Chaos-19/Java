/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.Stack;

/**
 *
 * @author GAEDC
 */
public class VlidParenthesis {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String expre = "[())]";

        for (int i = 0; i < expre.length(); i++) {
            char singlChar = expre.charAt(i);
            if (isopeanParenthesis(singlChar)) {
                stack.push(singlChar);
            } else if (!stack.isEmpty() && !isopeanParenthesis(singlChar)) {
                if (!isValid(stack.peek(), singlChar)) {
                    System.out.println("an Balanced parenthesis ");
                    return;
                } else if (isValid(stack.peek(), singlChar)) {
                    stack.pop();
                }
            }else  stack.push(singlChar);
        }
        if (stack.isEmpty()) {
            System.out.println("Balanced parenthesis ");
        } 
    }

    private static boolean isopeanParenthesis(char para) {
        return para == '(' || para == '[' || para == '{';
    }

    private static boolean isValid(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }

}
