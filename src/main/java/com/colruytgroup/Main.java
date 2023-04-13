package com.colruytgroup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hi!!");

        /* *** Sample Array *** */
        /*arry a1 = new arry();
        for(int i=0; i<a1.list1.length;i++) {
            System.out.println(a1.list1[i]);
        }*/

        /* *** check prime *** */
        /*prime p1 = new prime();
        p1.isPrime(13);*/

        /* *** swap 2 numbers *** */
        /*swap2 s1 = new swap2();
        s1.swapnums(10,20);*/

        /* Input via Scanner */
        /*int n;
        System.out.println("enter a number");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        System.out.println("entered number is:" + n);*/

        /* Input via BufferedReader */
        /*System.out.println("enter a text");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println(name);*/

        /* Factorial of a number */
        /*factorial f1= new factorial();
        System.out.println(f1.facto(5));*/

        ternary t1= new ternary();
        t1.biggest(2,3,4);

    }
}