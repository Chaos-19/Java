/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author GAEDC
 * @param <T>
 */
public class Node<T> {

  public  T data;
   public  Node nxt;

   public Node(T data) {
        this.data = data;
        nxt = null;
    }
}
