package com.company;
import java.io.*;
import java.util.*;
public class ArrayListProgram2 {
    public static void main(String []args) {
        Collection values= new ArrayList();
        values.add(5);
        values.add(9.225);
        values.add("sanket");
        values.add(8.2f);

        Iterator i=values.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
//        for(Object i: values){
//            System.out.println(i);
//        }
    }
}
