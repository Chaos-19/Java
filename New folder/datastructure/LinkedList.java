/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.HashSet;

public class LinkedList {

    public Noden head;

    static class Noden {

        int data;
        Noden nxt;

        public Noden(int data) {
            this.data = data;
            nxt = null;
        }
    }

    public LinkedList insert(LinkedList lis, int data) {

        Noden new_Node = new Noden(data);
        if (head == null) {
            head = new_Node;
        } else {
            Noden temp = head;
            while (temp.nxt != null) {
                temp = temp.nxt;
            }
            temp.nxt = new_Node;
        }
        return lis;
    }

    public LinkedList insertAtFirst(LinkedList lis, int data) {

        Noden new_Node = new Noden(data);
        if (head == null) {
            head = new_Node;
        } else {
            Noden temp = head;
            head = new_Node;
            new_Node.nxt = temp;
        }
        return lis;
    }

    public void display() {
        Noden temp = head;
        if (temp == null) {
            System.out.println("empty List ");
        } else {

            while (temp != null) {
                System.out.println("data :" + temp.data);
                temp = temp.nxt;
            }
        }
    }

    public int delete() {
        Noden new_Node = head;
        int data = 0;
        if (head == null) {
            System.out.println("Empty List");
            return 0;
        } else if (head.nxt == null) {
            head = null;
        } else {
            Noden temp = head, temp2 = null;
            while (temp.nxt != null) {
                temp2 = temp;
                temp = temp.nxt;
            }
            data = temp.data;
            temp2.nxt = null;
        }
        return data;
    }

    public void deleletAtFirst() {
        Noden temp = head;
        if (head == null) {
            System.out.println("Empty list ");
        } else {
            head = temp.nxt;
        }

    }

    public void deleteByKey(int key) {
        Noden new_Node = head;
        int data = 0;
        boolean exist = false;
        if (head == null) {
            System.out.println("Empty List");
        } else if (new_Node.data == key) {
            deleletAtFirst();
        } else {
            Noden temp = head, temp2 = null;
            try {
                while (temp.data != key) {
                    temp2 = temp;
                    temp = temp.nxt;
                    exist = true;
                }
                if (exist) {
                    temp2.nxt = temp.nxt;
                } else {
                    System.out.println("Key not Found");
                }
            } catch (Exception e) {
                System.out.println("Key not Found");
            }
        }

    }

    public void recurse(Noden temp) {
        //base case
        if (temp == null) {
            return;
        } else {
            System.out.println(temp.data);
        }
        recurse(temp.nxt);
    }

    public void reverseLinkedList() {

        if (head == null) {
            System.out.println("Empty List");
        } else {
            Noden temp = head, pre = null, next = null;
            while (temp != null) {
                next = temp.nxt;
                temp.nxt = pre;
                pre = temp;
                temp = next;
            }
            head = pre;

        }
    }

    public boolean detectLoop(Noden h) {
        HashSet<Noden> s = new HashSet<>();
        while (h != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(h)) {
                return true;
            }

            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);

            h = h.nxt;
        }

        return false;
    }

    public int length() {
        int length = 0;

        Noden temp = head;
        while (temp != null) {
            length++;
            temp = temp.nxt;
        }

        return length;
    }

    public int getMin() {
        int min = head.data;

        Noden temp = head;
        while (temp != null) {
            if (min > temp.data) {
                min = temp.data;
            }
            temp = temp.nxt;
        }
        return min;
    }

}
