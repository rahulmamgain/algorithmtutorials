package com.rahul.algorithms.sorting.big_sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by mrahul on 07-May-17.
 *
 * This almost feels like cheating
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(bi.readLine());
        List<BigInteger> numbers = new ArrayList<>();
        List<String> numbersString = new ArrayList<>();
        for(int index=0; index<arraySize; index++) {
            String numberString = bi.readLine();
            if(numberString.length() > 999) {
                numbersString.add(numberString);
            } else {
                numbers.add(new BigInteger(numberString));
            }
        }
        Collections.sort(numbers);
        Collections.sort(numbersString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o1.length()).compareTo(o2.length());
            }
        });
        for(BigInteger number : numbers) {
            System.out.println(number);
        }

        for(String number : numbersString) {
            System.out.println(number);
        }
    }
}
