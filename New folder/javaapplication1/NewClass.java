/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author GAEDC
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewClass {

    static char stack[] = new char[35];
    static int top = -1;

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("((\\d*\\.\\d+)|(\\d+)|([\\+\\-\\*/\\(\\)]))");
        Scanner s = new Scanner(System.in);
        String out = "";
        String data = s.next();
        Matcher m = pattern.matcher(data);
        String in[] = new String[data.length()];
        while (m.find()) {
            char n = m.group().charAt(0);
            if (isDigit(n)) {
                out += n;
            } else if (n == '(') {
                push(n);
            } else if (n == ')') {
                while (!empty() && peek() != '(') {
                    out += peek();
                    pop();
                }
                pop();
            } else {
                if (!empty()) {
                    while (!empty() && proc(n) <= proc(peek())) {
                        out += peek();
                        pop();
                    }
                }
                push(n);
            }
        }
        System.out.println(out);
    }

    static void push(char n) {
        stack[++top] = n;
    }

    static char peek() {
        if (top < 0) {
            return ' ';
        }
        return stack[top];
    }

    static void pop() {
        if (top < 0) {
        } else {
            stack[top] = 0;
        }
        --top;
    }

    static boolean empty() {
        return top == -1;
    }

    static boolean isDigit(char n) {

        return n >= '0' && n <= '9' || n >= 'a' && n <= 'z';
    }

    static int proc(char n) {
        if (n == '+' || n == '-') {
            return 1;
        } else if (n == '*' | n == '/') {
            return 2;
        } else if (n == '^') {
            return 3;
        }
        return -1;
    }
}
