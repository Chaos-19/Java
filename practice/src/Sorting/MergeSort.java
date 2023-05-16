/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Arrays;

/**
 *
 * @author GAEDC
 */
public class MergeSort {

    public static void main(String[] args) {
        //mergeSort(new int[]{4,7,8,2,0,32});
        int arr[] = {4, 7, 8, 2, 0, 32, 5, 1};
        int left = 0;
        int right = arr.length - 1;
        System.out.println("unSorted : " + Arrays.toString(arr));
        mergeSort(arr, left, right);
        System.out.println("Sorted : " + Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int left, int right) {
        //base case 
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int leftStart, int rightEnd) {
        int sortedArray[] = new int[arr.length];
       // int i = leftStart;
       // int leftEnd = (left + rightEnd) / 2;
        //int j = leftEnd + 1;
        //int index = left;

         
        int leftEnd = (leftStart + rightEnd)/2;
        int rightStart = leftEnd + 1;
        int lefts=leftStart;
        int right=rightStart;
        int index=leftStart;
        
        
        
        while (lefts <= leftEnd && right <= rightEnd) {

            if (arr[lefts] <= arr[right]) {
                sortedArray[index] = arr[lefts];
                index++;
                lefts++;

            } else {
                sortedArray[index] = arr[right];
                index++;
               rightStart++;

            }

        }

        while (lefts <= leftEnd) {
            sortedArray[index] = arr[lefts];
            index++;
            lefts++;

        }
        while (right <= rightEnd) {
            sortedArray[index] = arr[rightStart];
            rightStart++;
            index++;
        }
        System.out.println("temp : " + Arrays.toString(sortedArray));
        for (int k = leftStart; k <= rightEnd; k++) {
            arr[lefts] = sortedArray[k];
        }

    }
    
    


    private static void divid(int[] array,int leftStart, int rightEnd){
        if(leftStart >= rightEnd)
            return;
        int middle=(leftStart + rightEnd)/2;
        divid(array, leftStart, middle);
   //   System.out.println(Arrays.toString(array))
        divid(array, middle +1 , rightEnd);
    //System.out.println(Arrays.toString(array));
        merge(array, leftStart, rightEnd); //  System.out.println(Arrays.toString(array));
  
    }
    private static void merge1(int[] array , int leftStart, int rightEnd){
        int[] temp=new int[array.length];
        int leftEnd = (leftStart + rightEnd)/2;
        int rightStart = leftEnd + 1;
        int left=leftStart;
        int right=rightStart;
        int index=leftStart;

        while(left <= leftEnd && right <= rightEnd){
            if((array[left] <= array[right])){
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }
        while(left <= leftEnd){
            temp[index]=array[left];
            index++;
            left++;
        }
        while(right <= rightEnd){
            temp[index]=array[right];
            index++;
            right++;
        }
        System.out.println("Sorted : " + Arrays.toString(temp));
        for(int i=leftStart ; i <= rightEnd ; i++){
            array[i]=temp[i];
        }
    }
}
    

