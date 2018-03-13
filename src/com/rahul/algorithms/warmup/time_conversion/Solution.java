package com.rahul.algorithms.warmup.time_conversion;

import java.util.Scanner;

/**
 * Created by mrahul on 06-May-17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        String timeString = in.nextLine();
        String[] times = timeString.split(":");
        boolean isPM = times[2].contains("PM");
        String hour = times[0];
        String minutes = times[1];
        String seconds = times[2].replace("PM", "").replace("AM", "");
        if(isPM) {
            hour = String.format("%02d", 12 + Integer.parseInt(hour) == 24 ? 12 : 12 + Integer.parseInt(hour));

        } else {
            hour = String.format("%02d", Integer.parseInt(hour) == 12 ? 00 : Integer.parseInt(hour));
        }
        System.out.println(hour+":"+minutes+":"+seconds);
    }
}
