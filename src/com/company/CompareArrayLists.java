package com.company;
import java.util.*;
public class CompareArrayLists {
    public static void main(String[] args) {
        List<String> colors1= new ArrayList<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Black");
        colors1.add("White");
        colors1.add("Pink");

        List<String> colors2= new ArrayList<>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Brown");
        colors2.add("Pink");

        //Storing the comparison output in ArrayList<String>
        List<String> comparisonList = new ArrayList<>();
        for (String color : colors1)
        if(colors2.contains(color))
        {
            System.out.println(color);
        }
        else{
            System.out.println(color+" not found");
        }
        //comparisonList.add(colors2.contains(color) ? color : color+" Not found");
        System.out.println(comparisonList);

    }
}
