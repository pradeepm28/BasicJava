package com.colruytgroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas2 {
    public static void main(String[] args) {
        //Predicate used in filter method
        List<String> l1 = new ArrayList<>(Arrays.asList("One","Two","Ten"));
        List<String> filteredList = l1.stream().filter(i-> i.startsWith("T")).collect(Collectors.toList());
        System.out.println(filteredList);   // [Two, Ten]
        filteredList.forEach(string -> System.out.println(string));
            //Two
            // Ten

    }

}
