package com.rahul.algorithms.warmup.mini_max_sum;

import java.util.Collections;
import java.util.Scanner;

/**
 * Created by mrahul on 06-May-17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        String numbersString = in.nextLine();
        String[] numbersArray = numbersString.split(" ");
        double min = 0;
        double max = 0;
        double sum = Double.valueOf(numbersArray[0]) + Double.valueOf(numbersArray[1]) + Double.valueOf(numbersArray[2]) + Double.valueOf(numbersArray[3]) + Double.valueOf(numbersArray[4]);
        min = sum;
        for(int index=0; index<numbersArray.length;index++) {
            double summedUp = sum - Double.valueOf(numbersArray[index]);
            if(summedUp >= max) {
                max = summedUp;
            }
            if(summedUp <= min) {
                min = summedUp;
            }
        }
        System.out.println(String.format("%.0f", min) + " " + String.format("%.0f", max));
    }
}
