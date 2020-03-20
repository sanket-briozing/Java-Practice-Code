package com.company;
import java.util.*;
public class HashMapProblemStmt {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        //sc.nextLine();
        Map<String, Integer> hash_map= new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            String name=sc.nextLine();
            int phone=Integer.parseInt(sc.nextLine());
            System.out.println(name + " : " + phone);
            hash_map.put(name,phone);
        }
//        for(String i:hash_map.keySet())
//        {
//            System.out.println(i + " : " + hash_map.get(i));
//        }
        for(int i=1;i<=n;i++) {
            String q = sc.nextLine();
            if(hash_map.containsKey(q))
            System.out.println(hash_map.get(q));
            else
            {
                System.out.println("Not found");
            }
        }
    }
}
