package com.rahul.algorithms.challenges.insertionsort2;
import java.io.*;
import java.util.*;

public class Solution {

    private static int numberToFind;

    public static void insertionSortPart2(int[] ar)
    {
        for (int i=1; i<ar.length; i++) {
            if(ar[i] == numberToFind) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        numberToFind = in.nextInt();
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
}


