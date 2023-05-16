/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.Stack;

/**
 *
 * @author GAEDC
 */
public class HanoiUsingItrative {

    public static void main(String[] args) {
        Stack<Integer> src = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        int i = 0, numofDisk = 3, totalMove = (int) (Math.pow(2, numofDisk) - 1);

        if (numofDisk % 2 == 0) {

        }
        for (i = numofDisk; i >= 1; i--) {
            src.push(i);
        }
        for (i = 1; i < totalMove; i++) {
            if (i % 3 == 1) {
                
            }

        }

    }

}
