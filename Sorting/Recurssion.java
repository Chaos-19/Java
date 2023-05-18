/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author GAEDC
 */
public class Recurssion {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        int key = 7;
        // System.out.println(test(arr, 0, 9, key,'P'));
        test(arr, 0, 9, key, 'P');
    }

    public static void test(int[] arr, int left, int right, int key, char c) {

        //base case 
        System.out.println(c);
        if (right >= left) {
            int mid = (left + right) / 2;

         
            //    if (key < arr[mid]) {
            test(arr, left, mid - 1, key, 'L');
            //  } else if (key > arr[mid]){
            
               if (key == arr[mid]) {
                System.err.println(" found ");
               return;
               }
               test(arr, mid + 1, right, key, 'R');
            //    }
            //  else
            //return mid;
        }

    }
}
