package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Day9{

    private String priv;
    public String getPriv() {
        return priv;
    }
    public void setPriv(String priv) {
        this.priv = priv;
    }


    public String val = "From Day 9";

//     i. Create a HashMap with 2 values
//ii. Loop through the HashMap to print values only using keys

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("1", "NY");
        map.put("2", "PA");

        for(String v : map.keySet()) {
            System.out.println(map.get(v));
        }



    }
}
