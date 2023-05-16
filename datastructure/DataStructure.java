/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import Queue.CircularQueue;
import Queue.Queue;
import datastructure.Stack.Stack;

/**
 *
 * @author GAEDC
 */
public class DataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*      LinkedList lis = new LinkedList();
        lis.display();
        lis.insert(lis, 5);
        lis.insert(lis, 9);
        lis.insert(lis, 1);
        lis.insert(lis, 7);
        lis.insert(lis, 10);
        lis.insert(lis, 21);
  
        lis.insertAtFirst(lis, 0);
        
       
        
        System.out.println("Length : " +lis.length());
        System.out.println("min : "+ lis.getMin());
        lis.display();
        
           
        lis.deleteByKey(0);
        lis.deleteByKey(5);
         System.out.println("Detect Loop : "+lis.detectLoop(lis.head));
        lis.delete();
        lis.delete();
        lis.delete();
System.out.println("datastructure");
        lis.display();
        lis.deleletAtFirst();
        lis.deleletAtFirst();
        System.out.println("datastructure.DataStructure.main()");
        lis.display();
        lis.recurse(lis.head);
         lis.reverseLinkedList();
        System.out.println("--------------------------------");
        lis.recurse(lis.head);

        Queue<Integer> q = new Queue();
 System.out.println(" empty : "+ q.isEmpty());
        q.enqueue(6);
        q.enqueue(4);
        q.enqueue(9);
        q.enqueue(8);
        q.enqueue(2);
        q.enqueue(7);
       while(!q.isEmpty())
  System.out.println(" deQueue : "+ q.dequeue());
        CircularLinkedList clis = new CircularLinkedList();
        clis.insertAtFirst(7);
        clis.insertAtEnd(55);
        clis.insertAtEnd(3);
        clis.insertAtEnd(8);
        
        clis.deleteByKey(55);
        
        clis.display();

        CircularDoublyLinkedList<Integer> cDLL = new CircularDoublyLinkedList<>();

        cDLL.insertAtEnd(5);
        cDLL.insertAtEnd(8);
        cDLL.insertAtEnd(3);
        cDLL.insertAtEnd(1);
        cDLL.insertAtEnd(9);
        cDLL.insertAtEnd(2);
        /*        cDLL.inserAtFirst(Integer.MAX_VALUE);
        cDLL.inserAtFirst(Integer.SIZE);
        
        cDLL.deleteByKey(4);
        
        cDLL.deleteAtFirst();
        cDLL.deleteAtFirst();
        
        cDLL.display();

        System.out.println("\nTraversing from Tail to head ");
        cDLL.fromTailToHead();*/
        CircularQueue<Integer> cq = new CircularQueue();

        cq.enqueue(5);
        cq.enqueue(3);
        cq.enqueue(8);
        cq.enqueue(1);
        cq.enqueue(10);
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.display();

    }

}
