package com.colruytgroup;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner readInput =  new Scanner(System.in);
        System.out.println("Enter some number:-");
        int numeric =readInput.nextInt();
        System.out.println(numeric);

        Scanner readText =  new Scanner(System.in);
        System.out.println("Enter some text:-");
        String text =readText.nextLine();
        System.out.println(text);
    }
}
