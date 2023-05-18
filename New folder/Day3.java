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
public class Day3 {

    public static void main(String[] args) {
        System.out.println(getLongestSubArrayLength3(new int[]{4, 2, 2, 2, 4, 4, 2, 2}));
        //System.out.println(sun(new int[]{1,2,3,6,7}));
        //8,2,4,7
        //10,1,2,4,7,2
        //2,4,5,5,5,3,1
        //1,2,3,6,7
        //4,2,2,2,4,4,2,2
    }
//Final Mthode

    private static int getLongestSubArrayLength3(int[] inpute) {
        int count = 0, hold = 0, index = 0;
        for (int i = 0; i < inpute.length; i++) {
            for (int j = i; j < inpute.length; j++) {
                if (Math.abs(inpute[i] - inpute[j]) <= 0) {
                    count++;
                    System.out.println(i + " in " + inpute[j]);
                    index = j;
                }
                if (count >= hold) {
                    hold = count;
                }
                if (!(Math.abs(inpute[i] - inpute[j]) <= 0)) {
                    count = 0;
                    break;
                }
            }
            count = 0;
        }
        if (count > hold) {
            count = hold;
        }

        return hold;
    }

    private static int getLongestSubArrayLength(int[] inpute) {
        int count = 0, hold = 0, index = 0;
        for (int i = 0; i < inpute.length; i++) {
            for (int j = i; j < inpute.length; j++) {
                if (Math.abs(inpute[i] - inpute[j]) <= 4) {
                    count++;
                    System.out.println(i + " in " + inpute[i] + " - " + inpute[j] + "  <= " + 1);
                    index = j;
                }
//                else if (count > hold) {
//                    hold = count;
//                    count = 0;
//                     System.out.println(i + "  " + inpute[i]+" % "+inpute[j]+"  <= "+1);
//                    index = 0;
//                }

            }
            if (count > hold) {
                hold = count;
                count = 0;
//                     System.out.println(i + "  " + inpute[i]+" % "+inpute[j]+"  <= "+1);
                index = 0;
            }

        }
        if (count < hold) {
            count = hold;
        }

        return count;
    }

    /*private static int getLongestSubArrayLength1(int[] inpute) {
        int count = 0, hold = 0;
        for (int i = 0; i < inpute.length; i++) {
            for (int j = 1 + i; j < inpute.length; j++) {
                if (Math.abs(inpute[i] - inpute[j]) <= 1) {
                    count++;
                    System.out.println(j + " val -: " + Math.abs(inpute[i] - inpute[j]) + "  count " + count + "  hold " + hold);
                } else if (count >= hold) {
                    hold = count;
                    if (i >= 1 && Math.abs(inpute[j - i] - inpute[i]) > 1) {
                        System.out.println("dif " + i);
                        count = 0;
                        break;
                    }
                }

            }
        }

        return hold;
    }*/
    static int sun(int[] in) {
        int count = 0, hol = 0;
        for (int i = 1; i < in.length; i++) {
            if (Math.abs(in[i - 1] - in[i]) <= 2) {
                count++;
                System.out.print("  " + in[i - 1] + " ");
            }
            if (!(Math.abs(in[i - 1] - in[i]) <= 2)) {
                count = 0;
            } else {
                if (count > hol) {
                    hol = count;
                }

            }
        }
        if (count < hol) {
            count = hol;
        }
        System.out.println(" ");
        return count;
    }

}
