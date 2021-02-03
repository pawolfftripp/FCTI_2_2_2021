package com.FCTI;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] loopArray = {10, 15, 20, 25, 30};

        int sum = 0;
        int i = 0;

        for (i = 0; i < loopArray.length; i++) {
            sum += loopArray[i];
        }

        System.out.println(sum);

        PowerArray power = new PowerArray();
        System.out.println(Arrays.toString(new ArrayList[]{power.toPower(4, 2)}));
    }
}