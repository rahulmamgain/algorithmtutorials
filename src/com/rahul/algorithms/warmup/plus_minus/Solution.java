package com.rahul.algorithms.warmup.plus_minus;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by mrahul on 06-May-17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        double arraySize = in.nextDouble();
        int sum = 0;
        in.nextLine();
        String numberString = in.nextLine();
        String[] numbers = numberString.split(" ");
        double positiveFractionSum = 0;
        double negativeFractionSum = 0;
        double zeroFractionSum = 0;
        for(int index=0; index<arraySize;index++) {
            int number = Integer.parseInt(numbers[index]);
            if(number > 0 ) {
                positiveFractionSum++;
            } else if(number < 0) {
                negativeFractionSum++;
            } else {
                zeroFractionSum++;
            }
        }
        System.out.println(String.format("%.6f", Double.valueOf(positiveFractionSum / arraySize)));
        System.out.println(String.format("%.6f", Double.valueOf(negativeFractionSum / arraySize)));
        System.out.println(String.format("%.6f", Double.valueOf(zeroFractionSum / arraySize)));
    }
}
