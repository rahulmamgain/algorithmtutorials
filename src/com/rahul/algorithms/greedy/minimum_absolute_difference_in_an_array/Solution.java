package com.rahul.algorithms.greedy.minimum_absolute_difference_in_an_array;

import java.util.*;

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
        List<Double> numbers = new ArrayList<>();
        for(String s : numberString.split(" ")) {
            numbers.add(Double.valueOf(s));
        }
        Collections.sort(numbers, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o2.compareTo(o1);
            }
        });
        double minDiff = numbers.get(0);
        for(int index=0 ; index < arraySize-1; index++) {
            double diff = Math.abs(numbers.get(index) - numbers.get(index+1));
            if(diff < minDiff) {
                minDiff = diff;
            }
        }
        System.out.println(String.format("%.0f", minDiff));
    }
}
