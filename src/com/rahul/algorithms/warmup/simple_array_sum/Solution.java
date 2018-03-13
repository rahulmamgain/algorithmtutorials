package com.rahul.algorithms.warmup.simple_array_sum;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int sum = 0;
        in.nextLine();
        String numberString = in.nextLine();
        String[] numbers = numberString.split(" ");
        for(int index=0; index<arraySize;index++) {
            sum = sum + Integer.parseInt(numbers[index]);
        }
        System.out.println(sum);
    }
}