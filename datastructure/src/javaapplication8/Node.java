/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author HP
 * @param <T>
 */
public class Node<T> {

    public T data;
    public int priority;
    public Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

   
}
