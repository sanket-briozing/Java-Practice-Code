package com.company;
import org.omg.Messaging.SyncScopeHelper;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Palindrome {
    public static void main(String args[]){
        int input=12321;
        int rev=0;
        do{
            rev=(rev*10)+(input%10);

        }while ((input=input/10)!=0);

        if(input==rev)
            System.out.println("input is palindrome");
        else
            System.out.println("input is not palindrome");

    }
}
