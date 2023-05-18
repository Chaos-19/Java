/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmchallenges;

import java.util.ArrayList;

/**
 *
 * @author KAlKIDAN 
 */
public class StringManipulation {

    // kALKIDAN 
    
    public static int indexOf(String input, char key) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == key) {
                return i;
            }
        }
        return -1;
    }
//Sub String Method 
    public static String subString(String input, int startingIndex) {
        String newSubString = "";
        for (int i = startingIndex; i < input.length(); i++) {
            newSubString += input.charAt(i);
        }
        return newSubString;
    }
// Overrloaded Sub String Method 
    public static String subString(String input, int startingIndex, int endingIndex) {
        String newSubString = "";
        for (int i = startingIndex; i < endingIndex; i++) {
            newSubString += input.charAt(i);
        }
        return newSubString;
    }

    //Splite method Implementation
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
                subString = input.substring(starIndex, starIndex + key.length());
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
