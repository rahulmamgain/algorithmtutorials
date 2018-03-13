package com.rahul.algorithms.warmup.birthday_cake_candles;

import java.util.Scanner;

/**
 * Created by mrahul on 06-May-17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int sum = 0;
        in.nextLine();
        String numberString = in.nextLine();
        String[] numbers = numberString.split(" ");
        double maxHeight = 0;
        double candlesToBlow = 0;
        for(int index=0; index<arraySize;index++) {
            double candleHeight = Double.parseDouble(numbers[index]);
            if(candleHeight == maxHeight) {
                candlesToBlow ++;
            }
            else if(candleHeight > maxHeight) {
                maxHeight = candleHeight;
                candlesToBlow = 1;
            }
        }
        System.out.println(String.format("%.0f", candlesToBlow));
    }
}
