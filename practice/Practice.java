/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;

/**
 *
 * @author GAEDC
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //System.out.println(binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 9));
        String n = "hh";
        char nam[] = n.toCharArray();
        //8,2,4,7
        //10,1,2,4,7,2
        //2,4,5,5,5,3,1
        //1,2,3,6,7
        //4,2,2,2,4,4,2,2
        System.out.println(getLongestSubArrayLength(new int[]{15, 10, 1, 2, 4, 7, 2}, 5));
    }

    private static int binarySearch(int[] i, int key) {
        int left = i.length - 1;
        int right = 0;
        int mid = (left + right) / 2;

        while (left != right) {
            mid = (left + right) / 2;
            if (i[mid] > key) {
                left = mid - 1;
            } else if (i[mid] < key) {
                right = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int divisibleSumPair(int input[], int divisor) {
        int noOfPair = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if (input[i] < input[j]) {
                    if ((input[i] + input[j]) % divisor == 0) {
                        noOfPair++;
                        System.out.println(input[i] + " i and j " + input[j]);
                    }
                }
            }
        }
        return noOfPair;
    }

    private static int getLongestSubArrayLength(int[] inpute, int absolutDiff) {
        int countSubArray = 0, rangeOfSubArray = 0;
        for (int i = 0; i < inpute.length; i++) {
            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();
            for (int j = 0; j < inpute.length; j++) {
                if (i != j) {
                    if (Math.abs(inpute[i] - inpute[j]) <= absolutDiff) {
                        if (i < j) {
                            arr1.add(inpute[j]);
                        } else if (i > j) {
                            arr2.add(inpute[j]);
                        } else {
                            arr1.add(inpute[j]);
                            arr2.add(inpute[j]);
                        }
                    }

                }
            }
            countSubArray = Integer.max(arr1.size(), arr2.size());
            if (countSubArray >= rangeOfSubArray) {
                rangeOfSubArray = countSubArray;
            }
        }

        return rangeOfSubArray;
    }
    
    
    
    
    
    
}
