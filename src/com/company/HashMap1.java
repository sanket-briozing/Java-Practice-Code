package com.company;
import java.util.*;
import java.lang.*;
public class HashMap1 {
    public static void main(String []args){
        Map<Integer,String> myMap= new HashMap<>();
        myMap.put(1,"Red");
        myMap.put(2,"Black");
        myMap.put(3,"Green");
        myMap.put(4,"Brown");
        myMap.put(5,"White");

        for(Integer i: myMap.keySet()){
            System.out.println(i);
        }

        System.out.println();

        for(String i: myMap.values()){
            System.out.println(i);
        }

        System.out.println();

        for (Integer i : myMap.keySet()) {
            System.out.println("key: " + i + " value: " + myMap.get(i));
        }

        System.out.println();

        System.out.println("Size of the hash map: "+myMap.size());

        //remove all mappinghs form map
        myMap.clear();

        System.out.println("\nYou can see the map is empty: " + myMap);

        boolean result = myMap.isEmpty();
        // check the result
        System.out.println("\nIs hash map empty: " + result);
    }
}
