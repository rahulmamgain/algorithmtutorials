package com.rahul.algorithms.warmup.diagonal_difference;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int sum = 0;
        String[][] nByN = new String[arraySize][arraySize];
        int diagnolSum = 0;
        int reverseDiagnolSum = 0;
        in.nextLine();
        for(int index=0; index<arraySize;index++) {
            String numberString = in.nextLine();
            diagnolSum = diagnolSum + Integer.parseInt(numberString.split(" ")[index]);
            reverseDiagnolSum = reverseDiagnolSum + Integer.parseInt((numberString.split(" "))[arraySize-index-1]);
        }
        System.out.println(Math.abs(diagnolSum - reverseDiagnolSum));
    }
}
