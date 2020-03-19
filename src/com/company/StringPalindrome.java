package com.company;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class StringPalindrome {
    public static void main(String args[]) {
        String str="nitin";
        String rev="";
        int j=0;
        String[] arr=str.split("");
        for(int i=arr.length-1;i>=0;i--){
            rev=rev+arr[i];
            j++;
        }
        if (rev.equals(str))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

    }
}
