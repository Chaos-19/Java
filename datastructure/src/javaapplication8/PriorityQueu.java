/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package javaapplication8;

import java.util.ArrayList;

/**
 *
 * @author chaos & bekina
 * @param <T>
 */
/*public class PriorityQueu<T> {

    /*
    declaring front and rar node variables
    to hold reference to the front and rar node
     */
  /*  Node<T> front;
    Node<T> rar;

    //methode to insert(add) a node
    void enqueu(T data) {
        //create new node   
        Node<T> node = new Node<>(data);

        if (rar == null) {
            /* 
            chacking if the queu is empty
            and setting rar and front 
             */
      /*      rar = front = node;
        }
        rar.next = node; //set the new node next of the previous rar node  
        rar = node; //and set the new node rar
    }

    // overloaded methode take int priority
    void enqueu(T data, int priority) {
        //create new node   
        Node<T> node = new Node<>(data, priority);

        if (rar == null) {
            /* 
            chacking if the queu is empty
            and setting rar and front 
             */
         /*   rar = front = node;
        } else if (node.priority >= front.priority) {

            node.next = front;
            front = node;

        } else {

            Node temp = front;
            Node temp2 = temp;

            while (temp != null) {

                if (node.priority >= temp.priority) {
                    temp2.next = node;
                    node.next = temp;
                    break;
                }
                temp2 = temp;
                temp = temp.next;
            }
        }
//        rar.next = node; //set the new node next of the previous rar node  
//        rar = node; //and set the new node rar
    }

    Node deque() {
        //holding the previous front node
        Node res = front;

        //setting the new front
        front = res.next;

        return res;//returing the romoved(dequeued) node
    }

    T deque(int index) {
        int count = -1;

        try {

            if (rar != null) {
                Node start = front;
                Node next = start;

                while (start != null) {
                    ++count;
                    if (index == count) {
                        next.next = start.next;
                        return (T) start.data;
                    }
                    next = start;
                    start = start.next;
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }

    void traverse(int n) {
        //checking if the Queu is not empty
        if (rar != null) {
            Node start = front;
            while (start != null) { //
                System.err.println(start.data + " : " + n);
                start = start.next;
            }

        } else {
            System.out.println("Empty Queu!");
        }
    }

    int length() {
        int count = 0;
        //checking if the Queu is not empty
        if (rar != null) {
            Node start = front;
            while (start != null) { //
                count++;
                start = start.next;
            }
            return count;
        }
        return 0;
    }

    int search(T item) {
        int index = -1, count = -1;

        //checking if the Queu is not empty
        if (rar != null) {
            Node start = front;
            while (start != null) {
                ++index;
                if (item == start.data) {
                    return index;
                }
                start = start.next;
            }
        }

        return -1;
    }

    void removeDuplicates(T key) {
        ArrayList<T> listEle = new ArrayList<>();

        if (front != null) {
            Node temp = front;
            Node temp2 = temp;

            while (temp != null) {
                if (!listEle.contains((T) temp.data)) {
                    listEle.add((T) temp.data);
                    temp2 = temp;
                    temp = temp.next;
                } else if (listEle.contains((T) temp.data)) {
                    temp2.next = temp.next;
                    temp = temp.next;
                } else {

                    temp2 = temp;
                    temp = temp.next;
                }
            }

        }
    }

    void reverse() {
        ArrayList<T> reverseList = new ArrayList<>();

        if (rar != null) {
            Node start = front;
            while (start != null) { //
                reverseList.add((T) start.data);
                start = start.next;
            }
            System.out.println(reverseList.toString());

        } else {
            System.out.println("Empty Queu!");
        }

    }
    
    //helpper function to sort the list 
    void sort(Node front) {
        Node i = front;
        Node j = i.next;

        while (i != null) {
            while (j != null) {
                if ((int) j.data <= (int) i.data) {
                    T tmp = (T) j.data;

                    j.data = i.data;
                    i.data = tmp;
                }
                j = j.next;
            }

            i = i.next;
            if (i != null) {
                j = i.next;
            }
        }
    }

    boolean palindrome() {
        String result = "";
        String revResult = "";

        if (rar != null) {
            Node temp = front;
            while (temp != null) { //
                result += temp.data;
                temp = temp.next;
            }

            for (int i = result.length() - 1; i >= 0; i--) {
                revResult += result.charAt(i);
            }
            return result.equalsIgnoreCase(revResult);

        }
        return false;
    }

    void merge(PriorityQueu<T>... list) {

        for (PriorityQueu<T> node : list) {
            Node temp = node.front;

            while (temp != null) {
                if (temp.priority == 0) {
                    this.enqueu((T) temp.data);
                } else {
                    this.enqueu((T) temp.data, temp.priority);
                }
                temp = temp.next;
            }
        }

    }

}
*/