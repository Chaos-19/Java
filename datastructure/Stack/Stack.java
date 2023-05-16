/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.Stack;

/**
 *
 * @author KALKIDAN
 * @param <T>
 */
public class Stack<T> {

    Linked top = null;

    static class Linked<T> {

        T data;
        Linked nxt;

        public Linked(T data) {
            this.data = data;
            nxt = null;
        }
    }

    public void push(T data) {

        Linked newNode = new Linked(data);
        if (top == null) {
            newNode.nxt = null;
        } else {
            newNode.nxt = top;
        }

        top = newNode;

    }

    public  T pop() {
        T data ;
        if (top == null) {
            return null;
        } else {
            Linked temp = top;
            data = (T) temp.data;
            top = temp.nxt;
        }
        return data;
    }
        public  T peek() {
        if (top == null) {
            return null;
        } 
        return (T) top.data;
    }


    public void display() {
        Linked temp = top;
        if (top == null) {
            System.out.println("Empty Stack !");
        } else {

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.nxt;
            }
        }
    }

   public boolean isEmpty() {
        return top == null;
    }
}
