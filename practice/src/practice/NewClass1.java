/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author GAEDC
 */
public class NewClass1 {

    public static void main(String[] args) {
        System.out.println(getLongestSubArrayLength(new int[]{2,4,5,5,5,3,1}, 1));
        //8,2,4,7
        //10,1,2,4,7,2
        //2,4,5,5,5,3,1
        //1,2,3,6,7
        //4,2,2,2,4,4,2,2
    }

    private static int getLongestSubArrayLength(int[] inpute, int absolutDiff) {
        int countSubArray = 0, rangeOfSubArray = 0;
        for (int i = 0; i < inpute.length; i++) {
            ArrayList<Integer> arr1= new ArrayList<>();
            ArrayList<Integer> arr2= new ArrayList<>();
            for (int j = 0; j < inpute.length; j++) {
                if (i != j) {
                    if (Math.abs(inpute[i] - inpute[j]) <= absolutDiff) {
                        rangeOfSubArray = j;
                    }
//                    if (!(Math.abs(inpute[i] - inpute[j]) <= absolutDiff)) {
//                        break;
//                    }
                }
            }
            int subArray[] = Arrays.copyOfRange(inpute, i, rangeOfSubArray + 1);
            if (subArray.length > countSubArray) {
                System.out.println(Arrays.toString(subArray));
                countSubArray = subArray.length;
            }

        }

        return countSubArray;
    }

}
