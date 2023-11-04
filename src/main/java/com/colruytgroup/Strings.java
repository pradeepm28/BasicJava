package com.colruytgroup;

public class Strings {
    public static void main(String[] args) {
        String name = "Pradeep";
        System.out.println("Length of name:" + name.length());
        System.out.println("Hi+Name:" + name.concat(" Hi"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println("Name replaced:" + name.replace("e","c"));
        name = "   Pra   deep  ";
        System.out.println("--" + name.trim() + "--");

    }
}
