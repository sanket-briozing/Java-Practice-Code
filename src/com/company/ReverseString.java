package com.company;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class ReverseString {
    public static void main(String args[]) {
       String x="abcd";
       String[] arr=x.split("");
       for(int i=arr.length-1;i>=0;i--){
           System.out.print(arr[i]);
       }
    }
}
