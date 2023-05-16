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
            font = node;
            rar = node;
            return;
        }
        rar.nxt = node;
//      node.nxt = font;
        rar = node;
        rar.nxt = font;
    }

    public T dequeue() {
        T data;
        if (font == null) {
            return null;
        }
        else if (font.data==rar.data) {
            font=rar=null;
            return null;
        }
        Node node = font.nxt;
        data = (T) node.data;
        font=null;
        rar.nxt=node;
        font=node;
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
            temp = temp.nxt;
        } while (temp!= font);

    }
}
