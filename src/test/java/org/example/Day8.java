package org.example;

import javax.swing.*;
import java.util.Arrays;

public class Day8 {

//    i. Write a method which takes an array of int
//    ii. Array can contain 3 values
//    iii. Add all the values
//    iv. Return the total.

    public void arrayTotal(int[] v) {

        int total = 0;

        for(int i=0; i<v.length; i++) {
            total = total + v[i]; // 1 -> 3 -> 6
        }

        System.out.println(total);
    }

    public static void main(String[] args) {
        Day8 d8 = new Day8();
        d8.arrayTotal(new int[]{10, 20});
    }
}
