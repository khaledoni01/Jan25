package org.example;

public class Day3 {

//2. Write a program which initialize two instance variable and prints
//    whichever greetings and name is provided while creating the object.
//Write a program which will print out default values of primitive data
//    types.

    String greetings;
    String name;
    boolean b;
    public Day3(String greet, String nam) {
        greetings = greet;
        name = nam;
        b = true;
    }
    public static void main(String[] args) {
        Day3 d3 = new Day3("Good Morning", "John");

        System.out.println(d3.greetings + ", " + d3.name);

        System.out.println(d3.b);

    }

}
