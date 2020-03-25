package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListProblemStatement {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in List :- ");
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>(n);
        System.out.println("Add " + n + " integers");
        for (int i = 0; i < n; i++) {
            int y = Integer.parseInt(sc.nextLine());
            list.add(y);
        }
        System.out.println("The original list is :- "+ list);
        System.out.print("Enter the number of queries you want to execute :- ");
        int q = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < q; j++) {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            int s = Integer.parseInt(sc.nextLine());
            switch (s) {
                case 1:
                    int index;
                    do {
                        System.out.print("Enter the index numeber on which you want to insert an integer in the list:- ");


                        index  = Integer.parseInt(sc.nextLine());
                        if (index>=list.size())
                            System.out.println("Index is ot of bound, Please enter the index below : " + list.size());
                    }while(index>=list.size());
                    System.out.print("Enter the integer :- ");
                    int x = Integer.parseInt(sc.nextLine());
                    list.set(index,x);
                    break;
                case 2:
                    int z;
                    do {
                        System.out.print("Enter the index number from which you want to delete an integer from the list:- ");
                        z = Integer.parseInt(sc.nextLine());
                        if (z >= list.size())
                            System.out.println("Index is ot of bound, Please enter the index below : " + list.size());
                    }while(z>=list.size());
                    list.remove(z);
                    break;
            }
        }
        System.out.println("The Updated List is :- " + list);
    }
}
