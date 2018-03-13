package com.rahul.algorithms.arraypair;

import java.util.*;

/**
 * Created by mrahul on 20-Nov-17.
 */
public class Solution {

    public int solution(int[] A) {
        Arrays.sort(A);
        int uniqueIndex = 0;
        for(int i=0; i < A.length;) {
            if(i+1 <A.length && A[i] == A[i+1]) {
                i = i + 2;
            } else {
                uniqueIndex = i;
                i++;
            }
        }
        return A[uniqueIndex];
    }
}