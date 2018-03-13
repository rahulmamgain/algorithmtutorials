package com.rahul.algorithms.challenges.runningtime;

import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {
        int swaps = 0;
        for (int i=1; i<ar.length; i++) {
            int j = i;
            while(j>=1 && (ar[j] < ar[j-1])) {
                int swap = ar[j-1];
                ar[j-1] = ar[j];
                ar[j] = swap;
                j=j-1;
                swaps++;
            }
        }
        System.out.println(swaps);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
}



