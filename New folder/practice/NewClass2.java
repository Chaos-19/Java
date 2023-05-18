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
public class NewClass2 {

    public static void main(String[] args) {
        System.out.println(kth(new int[]{7,10,4,3,20,15}));
    }

    private static int birthdayCakeCandles(int[] candles) {
        int tallestCandl = candles[0], countTallestCandl = 0;
        for (int i = 1; i < candles.length; i++) {
            if (tallestCandl < candles[i]) {
                tallestCandl = candles[i];
            }
        }
        for (int i = 1; i < candles.length; i++) {
            if (tallestCandl == candles[i]) {
                countTallestCandl++;
            }
        }
        return countTallestCandl;

    }

    private static int kth(int[] arr) {
        int min = arr[0], countTallestCandl = 0;
        int minIndex = -1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (j != minIndex) {
                    if (min > arr[j]) {
                        min = arr[j];
                        minIndex=j;
                        System.out.println(" arr "+ arr[j]+" min " +minIndex);
                        countTallestCandl++;
                        
                    }
                }
            }
            min=arr[4];
        }
        return countTallestCandl;
    }

}
