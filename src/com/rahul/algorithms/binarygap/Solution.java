package com.rahul.algorithms.binarygap;

/**
 * Created by mrahul on 20-Nov-17.
 */
public class Solution {

    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        System.out.println(binaryString);
        int lastIndexOf1 = binaryString.lastIndexOf("1");
        int max = 0, itmMax = 0;
        for(int i=lastIndexOf1; i>=0;i--) {

            if(binaryString.charAt(i) == "1".charAt(0)) {
                if(itmMax >= max) {
                    max = itmMax;
                }
                itmMax = 0;
            } else {
                itmMax++;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(15 ));
    }
}
