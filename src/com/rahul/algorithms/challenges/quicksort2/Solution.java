package com.rahul.algorithms.challenges.quicksort2;

import java.util.*;
public class Solution {

    private static List<Integer> sortedList = new ArrayList<Integer>();

    private static boolean isFirstCall = true;

    static void quickSort(List<Integer> ar) {
        if(ar.size() == 1) {
            sortedList.add(ar.get(0));
        } else {
            int pivotElement = ar.get(0);
            List<Integer> leftArr = new ArrayList<Integer>();
            List<Integer> equalArr = new ArrayList<Integer>();
            List<Integer> rightArr = new ArrayList<Integer>();
            for(int index=0 ; index < ar.size(); index++) {
                Integer indexElement = ar.get(index);
                if(indexElement < pivotElement) {
                    leftArr.add(indexElement);
                }
                if(indexElement == pivotElement) {
                    equalArr.add(indexElement);
                }
                if(indexElement > pivotElement) {
                    rightArr.add(indexElement);
                }
            }
            if(leftArr.size() > 0) {
                if(!isFirstCall) {
                    printArray(leftArr);
                }
                quickSort(leftArr);
            }
            if(equalArr.size() > 0){
                sortedList.addAll(equalArr);
            }
            if(rightArr.size() > 0) {
                if(!isFirstCall) {
                    printArray(rightArr);
                }
                quickSort(rightArr);
            }
        }
        isFirstCall = false;
    }

    static void printArray(List<Integer> ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] ar = new Integer[n];
        for(int i=0;i<n;i++){
            ar[i]=Integer.valueOf(in.nextInt());
        }
        quickSort(Arrays.asList(ar));
        printArray(sortedList);
    }
}

