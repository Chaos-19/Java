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
public class CircularDoublyLinkedList<T> {

    Node head;

    static class Node<T> {

        T data;
        Node prv;
        Node nxt;

    }

    boolean isEmpty() {
        return head == null;
    }

    public void inserAtFirst(T data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
            node.prv = node.nxt = node;
        } else {
            node.prv = head.prv;
            head.prv.nxt = node;
            node.nxt = head;
            head.prv = node;

            head = node;

        }

    }

    void insertAtEnd(T data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
            node.prv = node.nxt = node;
        } else {
            Node temp = head;
            while (temp.nxt != head) {
                temp = temp.nxt;
            }
            temp.nxt = node;
            node.prv = temp;
            head.prv = node;
            node.nxt = head;

        }

    }

    public void display() {

        if (head == null) {
            System.out.println("Empty list ");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data+"  ");
            temp = temp.nxt;
        } while (temp != head);

    }

    public void fromTailToHead() {

        if (head == null) {
            System.out.println("Empty list ");
            return;
        }
        Node temp = head.prv;
        do {
            System.out.print(temp.data+ "  ");
            temp = temp.prv;
        } while (temp != head.prv);

    }

    public void deleteByKey(Object key) {

        boolean found = false;
        if (head == null) {
            return;
        } else if (head.data == key) {
            head.nxt.prv = head.prv;
            head.prv.nxt = head.nxt;
            head = head.nxt;
            return;
        }

        Node temp = head, temp2 = null;

        do {

            temp2 = temp;
            temp = temp.nxt;
            if (temp.data == key) {
                found = true;
            }
        } while ((temp.data != key) && (temp != head));
        if (found) {
            temp2.nxt = temp.nxt;
            temp.nxt.prv = temp;
        } else {
            System.out.println("Key Not Found !!");
        }

    }

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("Empty List ");
            return;
        } else {
            head.nxt.prv = head.prv;
            head.prv.nxt = head.nxt;
            head = head.nxt;
        }
    }

}
