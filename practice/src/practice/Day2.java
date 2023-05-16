/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

public class Day2 {

    public static void main(String[] args) {
        System.out.println(roundOffGrade(83));  
    }

    private static double roundOffGrade(double grade) {
        if (grade > 40 && grade<100) {
            if (findNextMultiple(grade) - grade < 3) {
                return findNextMultiple(grade);
            }
        }
        return grade;
    }

    private static double findNextMultiple(double input) {
        if (input > 40) {
            return (input % 5) == 0 ? input + 5 : (input - (input % 5)) + 5;
        }
        return input;
    }

}
