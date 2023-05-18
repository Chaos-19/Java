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
public class NewClass {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 7, 9};
        int maxnum = num[0];
        int maxsum = 0;
        int minnum = num[0];
        int minsum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < minnum) {
                minnum = num[i];
            }
        }
        // System.out.println(minnum);
        //maxsum=maxsum+num[i];
        for (int i = 0; i < num.length; i++) {
            maxsum = maxsum + num[i];
            //  System.out.println(maxsum);
        }
        maxsum = maxsum - minnum;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > maxnum) {
                maxnum = num[i];
            }
        }

        for (int i = 0; i < num.length; i++) {
            minsum = minsum + num[i];
        }
        minsum = minsum - maxnum;
        System.out.println(minsum + " " + maxsum);

    }
}