package com.rahul.algorithms.warmup.compare_the_triplets;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        String alicesScores = in.nextLine();
        String[] alicesArray = alicesScores.split(" ");
        String bobsScores = in.nextLine();
        String[] bobsArray = bobsScores.split(" ");
        int alicesSum = 0;
        int bobsSum = 0;
        for(int index=0; index<alicesArray.length;index++) {
            if(Integer.parseInt(alicesArray[index]) > Integer.parseInt(bobsArray[index])) {
                alicesSum++;
            } else if(Integer.parseInt(alicesArray[index]) < Integer.parseInt(bobsArray[index])) {
                bobsSum++;
            }
        }
        System.out.println(alicesSum + " " + bobsSum);
    }
}