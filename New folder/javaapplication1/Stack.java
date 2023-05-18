/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class Stack<T> {

    Object array[];
    int top = -1;
    int capacity = 12;

    public Stack() {
        array = new Object[capacity];
    }

    public Stack(int size) {
        this.capacity = size;
        array = new Object[capacity];
    }

    void push(T data) {
        array[++top] = data;
    }

    T peek() {
        return (T) array[top];
    }

    T pop() {
            T data = (T) array[top];
            --top;
            return data;
       
    }

    boolean isEmpty() {
        return top == -1;
    }
}
