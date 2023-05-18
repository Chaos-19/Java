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
public class StringManipulation {

    public static void main(String[] args) {

       //String name = "kalkidan";
        //System.out.println(startsWith(name,"kal"));
           String name = "geekss@for@geekss";

        //System.out.println(name.substring(4, 6).endsWith("da"));
        System.out.println(Arrays.toString(name.split("s@")));
        System.out.println("My Split : " + Arrays.toString(kalkidanSplit(name, "s@")));
        

//        System.out.println(test_startsWith(name, "Da", true));
//          System.out.println(test_endsWith(name, "i", false));
        
        
    }

    // A method to check whether a specified string starts with ofr not with a given prefix.
    public static boolean startsWith(String inputString, String prefix) {

        for (int i = 0; i < prefix.length(); i++) {
            if (inputString.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // A method to check whether a specified string ends with ofr not with a given suffix6.
    public static boolean endsWith(String inputString, String suffix) {
        int len = inputString.length() - suffix.length();
        for (int i =0;i<suffix.length();i++) {
            if (inputString.charAt(i+len) != suffix.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static String test_startsWith(String inputString, String key, boolean expectation) {
        if (startsWith(inputString, key) == expectation) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    public static String test_endsWith(String inputString, String key, boolean expectation) {
        if (endsWith(inputString, key) == expectation) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
    
        public static Object[] kalkidanSplit(String input, String key) {
        ArrayList<String> splitedString = new ArrayList<>();
        int starIndex = 0;
        boolean isStart = false, isEnd = false;
        String subString = "";
        String segment = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == key.charAt(0) && isStart == false) {
                starIndex = i;
                isStart = true;
                if(starIndex + key.length()>input.length()) {
                    subString = input.substring(starIndex, starIndex + key.length());
                }
                if (subString.equals(key)) {
                    i += key.length();
                    splitedString.add(segment);
                    isStart = false;
                    segment = "";
                } else {
                    isStart = false;
                }
            }
            if(i<input.length())
            segment += input.charAt(i);
        }
        if (!segment.isEmpty()) {
            splitedString.add(segment);
        }
        return splitedString.toArray();
    }


}
