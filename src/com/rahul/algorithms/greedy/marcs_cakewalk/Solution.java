package com.rahul.algorithms.greedy.marcs_cakewalk;

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
        List<Integer> calories = new ArrayList<>();
        for(String s : numberString.split(" ")) {
            calories.add(Integer.valueOf(s));
        }
        Collections.sort(calories, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        double caloriesSum = 0;
        int index = 0;
        for(Integer calorie : calories) {
            caloriesSum = caloriesSum + (calorie * Math.pow(2, index));
            index++;
        }
        System.out.println(String.format("%.0f", caloriesSum));
    }
}
