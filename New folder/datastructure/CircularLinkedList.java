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
public class CircularLinkedList {

    Node head;
    Node tail;

    public void insertAtFirst(Object data) {
        Node new_node = new Node(data);
        head = new_node;
        tail = new_node;
        new_node.nxt = tail;

    }

    public void insertAtEnd(Object data) {

        if (tail == null) {
            insertAtFirst(data);
        } else {
            Node new_node = new Node(data);
            tail.nxt = new_node;
            tail = new_node;
            tail.nxt = head;

        }
    }

    public void display() {
        if (tail == null) {
            return;
        }
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.nxt;
        } while (temp != head);
    }

    public void deleteAtEnd() {

        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.nxt != tail) {
            temp = temp.nxt;
        }
        tail = temp;
        tail.nxt = head;
    }

    public void deleteByKey(Object key) {
        boolean found = false;
        if (head == null) {
            return;
        } else if (head.data == key) {
            head = head.nxt;
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
        } else {
            System.out.println("Key Not Found !!");
        }

    }

}
