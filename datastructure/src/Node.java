/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 * @param <T>
 */
public class Node<T> {

    public T data;
    public Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
