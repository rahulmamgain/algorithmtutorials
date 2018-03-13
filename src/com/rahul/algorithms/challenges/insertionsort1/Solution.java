package com.rahul.algorithms.challenges.insertionsort1;

import java.util.*;

public class Solution {



    public static void insertIntoSorted(int[] ar) {
        int numberToBePushed = ar[ar.length-1];
        for(int index = ar.length-2; index>=0; index--){
            if(numberToBePushed < ar[index]) {
                ar[index+1] = ar[index];
                if(index == 0) {
                    printArray(ar);
                    ar[0] = numberToBePushed;
                }
                printArray(ar);
            } else{
                ar[index+1] = numberToBePushed;
                printArray(ar);
                break;
            }
        }
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}

