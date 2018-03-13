package com.rahul.algorithms.arraycyclicrotation;

/**
 * Created by mrahul on 20-Nov-17.
 */
public class Solution {

    /**
     *  [3, 8, 9, 7, 6]
     */


    public int[] solution(int[] A, int K) {
        if(A.length > 0) {
            for(int i=0; i<K;i++) {
                int nextElement = A[0];
                for(int j=1; j <= A.length - 1; j++) {
                    int temp = A[j];
                    A[j] = nextElement;
                    nextElement = temp;
                }
                A[0] = nextElement;
            }
        }
        return  A;
    }
}
