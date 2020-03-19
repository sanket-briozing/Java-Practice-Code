package com.company;
import java.util.*;
import java.io.*;
public class ArrayListProblemStmt {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //List<ArrayList<Integer>> ListGroup=new ArrayList<>();
        ArrayList ListGroup = new ArrayList<ArrayList<Integer>>();

        for(int i=1;i<=n;i++){
            ArrayList<Integer> l=new ArrayList<>();

            int d=sc.nextInt();
            for(int j=1;j<=d;j++){
                int data=sc.nextInt();
                l.add(data);
            }
            System.out.println("ArrayList : " + l);
            ListGroup.add(l);
            System.out.println("List Of List : " + ListGroup);
        }
        int q=sc.nextInt();
        for(int i=1;i<=q;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();

            try
            {
                ArrayList<Integer> list=new ArrayList<>();
                list = (ArrayList<Integer>) ListGroup.get(x-1);
                System.out.println(list);
                System.out.println(list.get(y-1));

            }catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }

}

