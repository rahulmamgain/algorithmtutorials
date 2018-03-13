package com.rahul.algorithms.dynamicprogramming.coinchange;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long getWays(long[] c, int m, long n){
        Map<String, Long> hashMap = new HashMap<>();
        for(int coinIndex=0; coinIndex< m; coinIndex++) {
            //System.out.println("The Coin Index Is " + coinIndex + " and the coin value is " + c[coinIndex]);
            for(long amountIndex = 0; amountIndex <= n; amountIndex++) {
                //System.out.println("The amount is ----- " + amountIndex);
                long ways = 0;
                if(c[coinIndex] == amountIndex) {
                    ways = ways + 1;
                }
                if(amountIndex-c[coinIndex] >= 0) {
                    ways = ways + hashMap.get((c[coinIndex]) + "|" + (amountIndex-c[coinIndex]));
                }

                if(coinIndex-1 >= 0) {
                    ways = ways + (hashMap.get((c[coinIndex-1]) + "|" + (amountIndex)) == null ? 0 : hashMap.get((c[coinIndex-1]) + "|" + (amountIndex)));
                }
                //System.out.println(c[coinIndex]+"|"+amountIndex +"---------" + ways);
                hashMap.put(c[coinIndex]+"|"+amountIndex, ways);
            }
        }
        return hashMap.get(c[m-1] + "|" + n);
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
