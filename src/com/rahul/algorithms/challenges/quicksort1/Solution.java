package com.rahul.algorithms.challenges.quicksort1;

import java.util.*;
public class Solution {

    static void partition(int[] ar) {
        int randomPivotIndex = 0;
        List<Integer> leftArr = new ArrayList<Integer>();
        List<Integer> equalArr = new ArrayList<Integer>();
        List<Integer> rightArr = new ArrayList<Integer>();
        int pivotElement = ar[randomPivotIndex];
        for(int index=0 ; index < ar.length; index++) {
            if(ar[index] < pivotElement) {
                leftArr.add(ar[index]);
            }
            if(ar[index] == pivotElement) {
                equalArr.add(ar[index]);
            }
            if(ar[index] > pivotElement) {
                rightArr.add(ar[index]);
            }
        }
        printArray(leftArr);
        printArray(equalArr);
        printArray(rightArr);
    }

    static void printArray(List<Integer> ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        partition(ar);
    }
}
