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
 * @param <T>
 */
public class Queue<T>  {

    Node font;
    Node rar;


    public void enqueue(T data) {
        Node node = new Node(data);

        if (rar == null) {
            font = rar = node;
            return;
        }
        rar.nxt = node;
        rar = node;
    }

  public  T dequeue() {
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

}
