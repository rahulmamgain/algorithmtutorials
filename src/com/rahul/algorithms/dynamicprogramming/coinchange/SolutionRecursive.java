package com.rahul.algorithms.dynamicprogramming.coinchange;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionRecursive {

    static long getWays(long[] c, int m, long n){
        long count = 0;
        if(n==0) {
            return 1;
        }

        if(n<0) {
            return 0;
        }

        if(m<=0 && n >=1) {
            return 0;
        }
        return getWays(c, m-1, n) + getWays(c, m, n-c[m-1]);
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(c, c.length, n);
        System.out.println(ways);
    }
}
