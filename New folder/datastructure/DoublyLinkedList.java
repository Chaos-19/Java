/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author GAEDC
 */
public class DoublyLinkedList<T> {

    Node head;

    static class Node<T> {

        T data;
        Node prv;
        Node nxt;

    }

    boolean isEmpty() {
        return head == null;
    }

    void insertAtEnd(T data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head=node;
            node.prv = node.nxt = null;
        } else {
            Node temp = head;
            while (temp.nxt != null) {
                temp = temp.nxt;
            }
            temp.nxt = node;
            node.prv = temp;
            node.nxt = null;
            
        }

    }

    public void display() {

        if (head == null) {
            System.out.println("Empty list ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            System.out.println("prev  "+temp.prv);
            temp = temp.nxt;
        }

    }

}
