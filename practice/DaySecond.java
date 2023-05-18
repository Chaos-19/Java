/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author GAEDC
 */
public class DaySecond {

    public static void main(String[] args) {

        findMaxSum(new int[]{9, 3, 1, 5, 7});
    }

    private static void findMaxSum(int[] input) {
        int min = input[0];
        int max = input[0];
        int sumOfArray=0;
        for (int i = 0; i < input.length; i++) {
            sumOfArray+=input[i];
            if (min > input[i]) {
                min = input[i];
            }
            if (max < input[i]) {
                max = input[i];
            }  
        }
        int minSum =sumOfArray-max , maxSum = sumOfArray-min;
        System.out.println(minSum + "  " + maxSum);
    }
}
