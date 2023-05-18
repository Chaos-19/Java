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
public class NewClass {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        Stack<Integer> temp = new Stack();
        Stack<Integer> des = new Stack();
        System.out.println("empty  :" + st.isEmpty());
        //st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println("peek()  " + st.peek());
//        st.display();
//
//        while(!st.isEmpty()){
//        temp.push(st.pop());
//        }
//        

        for (int i = 1; i < (2 * 3) - 1; i++) {

            if (!st.isEmpty()) {
                if (i % 3 == 1) {
                    if (st.isEmpty()) {
                        des.push(st.pop());
                    } else if (!st.isEmpty()) {
                        if (st.peek() != null) {
                            des.push(st.pop());
                        }
                    }
                } else if (i % 3 == 2) {
                    if (st.isEmpty()) {
                        temp.push(st.pop());
                    } else if (!st.isEmpty()) {
                        temp.push(st.pop());
                    }
                }
            } else if (i % 3 == 0) {

                if (des.isEmpty()) {
                    des.push(temp.pop());
                } else if (!des.isEmpty() && temp.peek() > des.peek()) {
                    temp.push(des.pop());
                }
            }

        }
        System.out.println("------- source ----");
        st.display();
        System.out.println("------- temp ----");
        temp.display();
        System.out.println("------- des ----");
        des.display();

        System.out.println("peek()  " + temp.pop());
    }

    public static void solve(int no, Stack<Integer> st, Stack<Integer> des, Stack<Integer> temp) {

        if (no == 1) {
            des.push(st.pop());
            return;
        }
        solve(no - 1, st, temp, des);

    }

}
