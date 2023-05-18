/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import datastructure.Stack.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author GAEDC
 */
public class Challenge2 {

    public static void main(String[] args) {
        // System.out.println(viralAdvertising(7));
         Stack<String> stack = new Stack<>();
        Pattern pattern = Pattern.compile("((\\d*\\.\\d+)|(\\d+)|([a-z]+)|([\\^\\+\\-\\*/\\(/)]))");
        String infinxExpression = "4+78+cos(4)*sin(3)";
        Matcher matcher = pattern.matcher(infinxExpression);
        while(matcher.find()){
        
            System.out.println(matcher.group());
        }

    }

    private static int viralAdvertising(int day) {
        int shared = 5;
        int noOfLike = shared / 2;
        int liked = 2;
        int cumulative = noOfLike;
        if (day == 1) {
            return noOfLike;
        }

        for (int i = 2; i <= day; i++) {
            shared = noOfLike * 3;
            noOfLike = shared / 2;
            cumulative += noOfLike;

        }

        return cumulative;
    }
}
