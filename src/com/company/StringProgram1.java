package com.company;

public class StringProgram1 {
    public static void main(String args[]) {
        String abc = "I am in pune";
        String arr[] = abc.split(" ");
//        for (String a : arr) {
//            System.out.println(a);
//        }
        for (int i=0;i<arr.length;i++){
            String rev[]=arr[i].split("");
            for(int j=rev.length-1;j>=0;j--){
                System.out.print(rev[j]);
            }
            System.out.print(" ");
        }
    }
}
