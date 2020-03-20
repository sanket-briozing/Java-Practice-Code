package com.company;
import java.util.*;
public class HashMap2 {
    public static void main(String[] args) {
        Map<String, String> hash_map = new HashMap<>();
        hash_map.put("Red", "Its Red color");
        hash_map.put("Green", "Its Green color");
        hash_map.put("Black", "Its Black color");
        hash_map.put("White", "Its White color");
        hash_map.put("Blue", "Its Blue color");

        System.out.println("The Original map: " + hash_map);
        System.out.println("\n1. Is key 'Green' exists?");
        if (hash_map.containsKey("Green")) {
            System.out.println("yes! - " + hash_map.get("Green"));
        } else {
            System.out.println("no!");
        }

        System.out.println("\n2. Is key 'orange' exists?");
        if (hash_map.containsKey("orange")) {
            System.out.println("yes! - " + hash_map.get("orange"));
        } else {
            System.out.println("no!");
        }
    }
}
