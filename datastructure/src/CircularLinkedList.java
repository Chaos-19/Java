
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HP
 * @param <T>
 */
public class CircularLinkedList<T> {

    Node head;
    Node tail;

   public void insertAtFirst (T data){
        Node temp = new Node(data);

        if (head == null) {
            head = tail = temp;
            temp.next = head;
            
        }
        else{
        temp.next = head;
        tail.next = temp;
      head = temp;
      }}

    public void insertAtEnd(T data) {

        if (tail == null) {
            insertAtFirst(data);
        } else {
            Node temp = new Node(data);
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
    }

    public void traverse() {
        if (tail == null) {
            return;
        }
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }
    	public void deleteAtfront(){
		
      if(head==null){
		return;
      }
		else{
			Node temp=head;
			head=head.next;
			
		}}

   public void deleteAtEnd() {

        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = head;
    }

    public void deleteByKey(T key) {
        boolean found = false;
        if (head == null) {
            return;
        } else if (head.data == key) {
            head = head.next;
            //tail = head;
        }

        Node temp = head, temp2 = null;

        do {
            temp2 = temp;
            temp = temp.next;
            if (temp.data == key) {
                temp2.next = temp.next;
                found = true;
            }
        } while ((temp.data != key) && (temp != head));
        if (!found) {
            System.out.println("Key Not Found !!");
        }

    }

    int search(T item) {
        int index = -1;

        //checking if the Queu is not empty
        if (tail != null) {
            Node temp = head;
            do {
                ++index;
                if (item == temp.data) {
                    return index;
                }
                temp = temp.next;
            } while (temp != head);
        }

        return -1;
    }

    int length() {
        int count = 0;
        //checking if the Queu is not empty
        if (head != null) {
            Node temp = head;
            do { //
                count++;
                temp = temp.next;
            } while (temp != head);
            return count;
        }
        return 0;
    }

    void removeDuplicates() {
        ArrayList<T> listEle = new ArrayList<>();

        if (head != null) {
            Node temp = head;
            Node temp2 = temp;

            do {
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
            } while (temp != head);

        }
    }

    void reverse() {
        ArrayList<T> reverseList = new ArrayList<>();

        if (head != null) {
            Node temp = head;
            do { //
                reverseList.add((T) temp.data);
                temp = temp.next;
            } while (temp != head);

            for (int i = reverseList.size() - 1; i >= 0; i--) {
                System.out.println(reverseList.get(i));
            }

        } else {
            System.out.println("Empty Queu!");
        }

    }

    void sort() {
        Node i = head;
        Node j = i.next;

        do {
            while (j != head) {
                if ((int) j.data <= (int) i.data) {
                    T tmp = (T) j.data;

                    j.data = i.data;
                    i.data = tmp;
                }
                j = j.next;
            }

            i = i.next;
            if (i != tail) {
                j = i.next;
            }
        } while (i != head);
    }

    boolean palindrome() {
        String result = "";
        String revResult = "";

        if (head != null) {
            Node temp = head;
            do {
                result += temp.data;
                temp = temp.next;
            } while (temp != head);

            for (int i = result.length() - 1; i >= 0; i--) {
                revResult += result.charAt(i);
            }
            return result.equalsIgnoreCase(revResult);

        }
        return false;
    }

    void merge(CircularLinkedList<T>... list) {

        for (int i =0;i <list.length;i++) {
            Node temp = list[i].head;

            do {

                this.insertAtEnd((T) temp.data);

                temp = temp.next;
            } while (temp != list[i].head);
        }

    }

    void insert() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
   

}
