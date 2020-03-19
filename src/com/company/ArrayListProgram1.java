package com.company;
import java.io.*;
import java.util.*;

public class ArrayListProgram1 {
    public static void main(String []args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        colors.add(0,"Yellow");
        colors.set(0,"Red");
        colors.remove(2);

        System.out.println("Value at first index is:- "+ colors.get(1));
        System.out.println();

        Collections.sort(colors);

        colors.forEach(System.out::println);
        System.out.println();

        Collections.shuffle(colors);

        colors.forEach(System.out::println);
        System.out.println();

        Collections.reverse(colors);

        colors.forEach(System.out::println);
        System.out.println();

        System.out.println("Original list: " + colors);
        List<String> sub_List = colors.subList(0, 3);
        System.out.println("List of first three colors: " + sub_List);

//        for(String color: colors ){
//            System.out.println(color);
//        }

        if (colors.contains("Red")){
            System.out.println("Found the element");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
