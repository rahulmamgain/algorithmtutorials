package com.rahul.algorithms.warmup.a_very_big_sum;

import java.util.Scanner;

/**
 * Created by mrahul on 06-May-17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        int arraySize = in.nextInt();
        long sum = 0;
        in.nextLine();
        String numberString = in.nextLine();
        String[] numbers = numberString.split(" ");
        for(int index=0; index<arraySize;index++) {
            sum = sum + Long.parseLong(numbers[index]);
        }
        System.out.println(sum);
    }
}