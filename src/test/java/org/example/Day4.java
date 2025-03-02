package org.example;

public class Day4 {

//2. Write a program which will print a final variable by creating object. Also,
//    static variable by referring class.

    public static int staticVar = 10;

    public final int FINAL_VAR = 20;

    public static void main(String[] args) {

        System.out.println( staticVar );

        System.out.println( new Day4().FINAL_VAR );


    }
}
