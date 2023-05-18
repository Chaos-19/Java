/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author GAEDC
 */
public class Assign {

    public static void main(String[] args) {
        System.out.println(timeConverter("12:06:34pM"));
        dayOfProgrammer(1985);
    }

    /*
    private static String timeConverter(String string) {

        String inputTime[] = string.split(":");

        String militaryTime = "";
        System.out.println(inputTime[2]);
        if (inputTime[2].equals("pm")) {
            int time = Integer.valueOf((String) inputTime[0]) + 12;
            militaryTime += time + ":" + inputTime[1] + ":" + inputTime[2];
            return militaryTime;
        }

        return string;
   }
     */
    private static String timeConverter(String timeInput) {

        String[] SplitedTime = timeInput.split(":");
        String militaryTime = "";
        String timeZone = SplitedTime[2].substring(2, SplitedTime.length + 1);

        if (timeZone.equalsIgnoreCase("pm")) {
            int time = Integer.valueOf((String) SplitedTime[0]) + 12;
            militaryTime += time + ":" + SplitedTime[1] + ":" + SplitedTime[2];
        } else if (timeZone.equalsIgnoreCase("am") && SplitedTime[0].equals("12")) {
            militaryTime += "00:" + SplitedTime[1] + ":" + SplitedTime[2];
        } else {
            militaryTime = timeInput;
        }
        return militaryTime;
    }

    static boolean isValid(String htime, String minute) {
        return (Integer.valueOf(htime) >= 0 && Integer.valueOf(htime) <= 12) && (Integer.valueOf(minute) >= 0 && Integer.valueOf(minute) <= 59);
    }

    private static int socktMerchant(int numofScock, int[] sockColor) {

        for (int i = 0; i < numofScock; i++) {
            int min = i;
            for (int j = i + 1; j < sockColor.length; j++) {
                if (sockColor[min] > sockColor[j]) {
                    min = j;
                }
            }
            int temp = sockColor[min];
            sockColor[min] = sockColor[i];
            sockColor[i] = temp;
        }
        int color = sockColor[0];
        int countPair = 0, noOfPair = 0;
        for (int i = 0; i < sockColor.length; i++) {
            if (sockColor[i] == color) {
                countPair++;
                if (countPair == 2) {
                    noOfPair++;
                    countPair = 0;
                }
            } else {
                color = sockColor[i];
                countPair = 1;
            }
        }
        return noOfPair;
    }

    private static void dayOfProgrammer(int year) {
        int totalNoOfDay = 31 + 31 + 30 + 31 + 30 + 31 + 31;
        
        int dayofProgram = 0;
        
        
        if (year >= 1700 && year <= 2700) {

            if(year==1918){
                 dayofProgram = 256 - (totalNoOfDay + 14);
            System.out.println(dayofProgram + "." + 9 +"."+  year);
            }
            else if (year % 4 == 0) {
                
                dayofProgram = 256 - (totalNoOfDay + 29);
                System.out.println(dayofProgram + "." + 9 +"."+  year);
            }

            else if (year % 400 == 0 && year % 100 != 0) {
                dayofProgram = 256 - (totalNoOfDay + 29);
                System.out.println(dayofProgram + "." + 9+"."+  year);
            } else {
                dayofProgram = 256 - (totalNoOfDay + 28);
                System.out.println(dayofProgram + "." + 9+"."+ year);
            }

        }
    }

}
