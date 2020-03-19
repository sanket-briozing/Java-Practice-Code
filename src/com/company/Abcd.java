package com.company;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Abcd {
    public static void main(String args[]){
        String x="abcd";
        String[] xArr = x.split("");
            for(int i=0;i<xArr.length;i++){
                for(int j=0;j<=i;j++){
                    if(j==0)
                    System.out.print(xArr[i].toUpperCase());
                    else
                        System.out.print(xArr[i].toLowerCase());
                }
                System.out.print("  ");
            }

    }
}
