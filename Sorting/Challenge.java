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
public class Challenge {

    public static void main(String[] args) {
        String in = "the quick brown fox jumps over the lazy dog";
        System.out.println(sort(in));
    }

    public static String sort(String input) {
        char sort[] = input.toCharArray();
        System.out.println("befor : " + Arrays.toString(sort));
        for (int i = 0; i < sort.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < sort.length; j++) {
                
                if (sort[min] > sort[j]) {
                    min = j;
                }
            }
            int temp = sort[i];
            sort[i] = sort[min];
            sort[min] = (char) temp;
        }
        input="";
        for (int i = 0; i <sort.length-1; i++) {
            if(sort[i]!=' '&& sort[i]!=sort[i+1])
            input += sort[i];   
        }
        System.out.println("After: " + Arrays.toString(sort));
        return input ;
    }

    public static void sort1(String input) {
        char sort[] = input.toCharArray();
        System.out.println("befor : " + Arrays.toString(sort));
        for (int i = 0; i < sort.length; i++) {
            for (int j = i + 1; j < sort.length; j++) {
                if (sort[i] > sort[j]) {
                    int temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = (char) temp;
                }
            }

        }
        System.out.println("After: " + Arrays.toString(sort));
//         input = Arrays.toString(sort);
    }
}
