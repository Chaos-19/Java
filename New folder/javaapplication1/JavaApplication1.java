/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author GAEDC
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    static String stack[] = new String[25];
    static int top = -1;
    static int size = -1;

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("((\\d*\\.\\d+)|(\\d+)|([\\+\\-\\*/\\(\\)]))");
        Scanner s = new Scanner(System.in);

        String data = s.next();
        String out[] = new String[data.length()];
        Matcher m = pattern.matcher(data);
        String in[] = new String[data.length()];
        while (m.find()) {
            String n = m.group();
            if (isDigit(n)) {
                out[++size] = n;
            } else if ("(".equals(n)) {
                push(n);
            } else if (")".equals(n)) {
                while (!empty() && !"(".equals(peek())) {
                    out[++size] = peek();
                    pop();
                }
                pop();
            } else {
                if (!empty()) {
                    while (!empty() && proc(n) <= proc(peek())) {
                        out[++size] = peek();
                        pop();
                    }
                }
                push(n);
            }
        }
        while (!empty()) {
            out[++size] = peek();
            pop();
        }

        System.out.println(Arrays.toString(out));
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= size; i++) {
            String v = out[i];
            if (isDigit(v)) {
                st.push(Integer.valueOf(v));

            } else {
                if (!st.isEmpty()) {
                    int x = st.peek();
                    st.pop();
                    int y = st.peek();
                    st.pop();
                    switch (v) {
                        case "+":
                            st.push(y + x);
                            break;
                        case "-":
                            st.push(y - x);
                            break;
                        case "*":
                            st.push(y * x);
                            break;
                        case "/":
                            st.push(y / x);
                            break;
                    }
                }
            }
        }

        System.out.println("Result : " + st.peek());

        while (!st.isEmpty()) {
            System.out.println("pop " + st.pop());
        }
        System.out.println("Is Empty " + st.isEmpty());
    }

    static void push(String n) {
        stack[++top] = n;
    }

    static String peek() {
        if (top < 0) {
            return "";
        }
        return stack[top];
    }

    static void pop() {
        if (top < 0) {
        } else {
            stack[top] = "";
        }
        --top;
    }

    static boolean empty() {
        return top == -1;
    }

    static boolean isDigit(String n) {
        try {
            Double.valueOf(n);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    static int proc(String n) {
        char p = n.charAt(0);
        if (p == '+' || p == '-') {
            return 1;
        } else if (p == '*' | p == '/') {
            return 2;
        } else if (p == '^') {
            return 3;
        }
        return -1;
    }
}
