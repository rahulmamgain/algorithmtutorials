package com.rahul.algorithms.dynamicprogramming.lcs;

import java.util.*;

public class Solution {

    static int[][] matrix;

    static List<Integer> longestCommonSubsequence(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();
        matrix = new int[a.length][b.length];
        for(int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                int diagnolValue=0, lastRowValue=0, lastColumnValue=0;
                if(i-1 >= 0 && j-1 >= 0) {
                    diagnolValue = matrix[i-1][j-1];
                }
                if(i-1 >= 0) {
                    lastRowValue = matrix[i-1][j];
                }

                if(j-1 >= 0) {
                    lastColumnValue = matrix[i][j-1];
                }
                if(a[i] == b[j]) {
                    matrix[i][j] = 1 + diagnolValue;
                } else {
                    matrix[i][j] = Math.max(lastColumnValue, lastRowValue);
                }
            }
        }
        int maxMatched = 0;

        for(int i=0; i < b.length; i++) {
            for (int j=0; j<a.length; j++) {
                if(matrix[j][i] > maxMatched) {
                    result.add(b[i]);
                    maxMatched = matrix[j][i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        List<Integer> result = longestCommonSubsequence(a, b);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + (i != result.size() - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}

