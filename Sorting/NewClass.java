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
public class NewClass {

    public static void main(String[] args) {
        int arr[] = {14, 7, 5, 2};
        System.out.println("UnSorted : " + Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        dividIntoSubArray(arr, start, end);
        System.out.println("Sorted : " + Arrays.toString(arr));

    }

    private static void dividIntoSubArray(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int middl = (start + end) / 2;

        dividIntoSubArray(arr, start, middl);
        dividIntoSubArray(arr, middl + 1, end);
        mergeSubArray(arr, start, end);
    }

    private static void mergeSubArray(int[] arr, int start, int end) {
        int temp[] = new int[arr.length];
        int left = start;
        int leftEnd = (start + end) / 2;
        int rightStart = leftEnd + 1;
        int index = start;

        while (left <= leftEnd && rightStart <= end) {
            if (arr[left] <= arr[rightStart]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[rightStart];
                rightStart++;
            }
            index++;
        }

        while (left <= leftEnd) {
            temp[index] = arr[left];
            left++;
            index++;
        }
        while (rightStart <= end) {
            temp[index] = arr[rightStart];
            rightStart++;
            index++;
        }

        for (int i = start; i <=end; i++) {
            arr[i] = temp[i];
        }

    }
}
