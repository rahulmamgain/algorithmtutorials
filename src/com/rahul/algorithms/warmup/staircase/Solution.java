package com.rahul.algorithms.warmup.staircase;

import java.util.Collections;
import java.util.Scanner;

/**
 * Created by mrahul on 06-May-17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        int arraySize = in.nextInt();
        for(int index=1; index<=arraySize;index++) {
            String hashString = String.join("", Collections.nCopies(index, "#"));
            String spaceString = String.join("", Collections.nCopies(arraySize-index, " "));
            System.out.println(spaceString + hashString);
        }
    }
}
