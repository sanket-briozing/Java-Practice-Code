package com.company;
import java.util.*;
public class HashMapCopy {
    public static void main(String args[]) {

        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");
        System.out.println("\nValues in map1: " + map1);
        map2.put(4, "White");
        map2.put(5, "Blue");
        map2.put(6, "Orange");
        System.out.println("\nValues in map2: " + map2);
        // put all values of map1 in map2
        map2.putAll(map1);
        System.out.println("\nNow values in map2: " + map2);
    }
}