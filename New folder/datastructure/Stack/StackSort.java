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
public class StackSort {

    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        System.out.println(input.isEmpty());
        //34, 3, 31, 98, 92, 23
        input.push(34);
        input.push(3);
        input.push(31);
        input.push(98);
        input.push(92);
        input.push(23);
        System.out.println(" input stack ");
        input.display();

        while (!input.isEmpty()) {
            int temp = input.pop();
            while (!tempStack.isEmpty() && tempStack.peek() < temp) {
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        System.out.println(" temp stack ");
        tempStack.display();

    }
}
