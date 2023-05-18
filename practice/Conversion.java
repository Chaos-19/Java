/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;

/**
 *
 * @author GAEDC
 */
public class Conversion {

    static int arr[];
    public static void main(String[] args) {
        // toBinary(3,10);
        //  System.out.println(getPower(10,2,0));
        //getPower(0);
      // convert(90);
      int decimal= 55;
      arr=new int[getPower(decimal, 2, 0)+1];
        palce(decimal,arr);

    }

    private static void toBinary(int decimal, int rema, int indx, int arr[]) {
        int factor = (int) Math.pow(2, decimal);
        int count = 0;
        //int rema=10;
        if (factor <= 1) {
            // --decimal;
            indx++;
            factor = (int) Math.pow(2, decimal);
            if (factor <= rema) {
                System.out.println(rema + " count :  " + factor + "  inf : " + indx);
                rema = rema - factor;
                arr[indx] = 1;
            }

            return;
        }
        factor = (int) Math.pow(2, decimal);
        System.out.println("FActor of two : " + Math.pow(2, decimal));
        indx++;
        if (factor <= rema) {
            System.out.println(" count :  " + indx);
            rema = rema - factor;
            arr[indx] = 1;
        }
        toBinary(decimal - 1, rema, indx, arr);

    }

    static int getPower(int num, int value, int power) {
        // int power = 1, value = 2;

        if (num >= value) {
            value = value * 2;
            power++;
            return getPower(num, value, power);
        }
        return power;
    }

    static void convert(int decimal) {
        int bina[] = new int[getPower(decimal, 2, 0) + 1];
        Arrays.fill(bina, 0);
        toBinary(getPower(decimal, 2, 0), decimal, -1, bina);

        for (int i = 0; i < bina.length; i++) {
            System.out.print(bina[i]);
        }
        System.out.println("");

    }

    static void palce(int decimal,int bina[]) {
        
        if (decimal <=0) {
            System.out.println(Arrays.toString(bina));
            return;
        }
      // bina = new int[getPower(decimal, 2, 0) + 1];
       int factor = (int) Math.pow(2, getPower(decimal, 2, 0));
       System.out.println("indexe  : "+ getPower(decimal, 2, 0));
       bina[arr.length-getPower(decimal, 2, 0)-1]=1;
       decimal=decimal-factor;
        palce(decimal,bina);
    }

}
