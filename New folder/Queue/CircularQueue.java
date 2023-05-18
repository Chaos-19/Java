/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import datastructure.Node;

/**
 *
 * @author GAEDC
 */
public class CircularQueue<T> {

    Node font;
    Node rar;

    public void enqueue(T data) {
        Node node = new Node(data);

        if (font == null) {
            font = rar = node;
            return;
        }
        node.nxt = rar.nxt;
        font.nxt = node;
        rar.nxt = node;
        rar = node;
    }

    public T dequeue() {
        T data;
        if (font == null) {
            return null;
        }
        Node node = font;
        data = (T) node.data;
        font = font.nxt;
        return data;
    }

    public boolean isEmpty() {
        return font == null;
    }

    public void display() {
        if (font == null) {
            System.out.println("Empty List ");
            return;
        }
        Node temp = font;
        do {
            System.out.println(temp.data);
        } while (temp.nxt != rar);

    }
}
