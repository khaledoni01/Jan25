package org.example;

public class Day11 {

    public static void main(String[] args) {

        try {
            int a = Integer.parseInt("10a");
            System.out.println(a);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }



    }

}
