package com.company;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListProgram3 {
    public static void main(String[] args) {
        ArrayList<String> colors1= new ArrayList<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Black");
        colors1.add("White");
        colors1.add("Pink");

        System.out.println("Array list before Swap:");
        for(String a: colors1){
            System.out.println(a);
        }
        Collections.swap(colors1, 0, 2);
        System.out.println("\nArray list after swap:");
        for(String b: colors1){
            System.out.println(b);
        }

        ArrayList<String> colors2= new ArrayList<>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Black");
        colors2.add("Pink");
        System.out.println("\nList of second array: " + colors2);

        // Let join above two list
        ArrayList<String> joinedList = new ArrayList<>();
        joinedList.addAll(colors1);
        joinedList.addAll(colors2);
        System.out.println("\nNew array: " + joinedList);

        ArrayList<String> newcolors1 = (ArrayList<String>)colors1.clone();
        System.out.println("\nCloned array list: " + newcolors1);

        newcolors1.removeAll(newcolors1);
        System.out.println("\nArray list after remove all elements "+newcolors1);

        System.out.println("Checking the above array list is empty or not! "+newcolors1.isEmpty());
    }
}
