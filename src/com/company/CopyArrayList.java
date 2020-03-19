package com.company;
import java.util.*;
public class CopyArrayList {
    public static void main(String args[]) {
        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        System.out.println("List1:- ");
        List1.forEach(System.out::println);

        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");
        System.out.println("List2:- ");
        List2.forEach(System.out::println);

        Collections.copy(List1,List2);
        System.out.println();
        System.out.println("Lists after copy:- ");
        System.out.println();
        System.out.println("List1:- ");
        List1.forEach(System.out::println);
        System.out.println("List2:- ");
        List2.forEach(System.out::println);
    }
}
