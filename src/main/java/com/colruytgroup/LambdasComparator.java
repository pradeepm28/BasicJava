package com.colruytgroup;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdasComparator {
    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("one","two","eight");

        Comparator<String> cmp = (s1,s2) -> s1.compareTo(s2);
        l1.sort(cmp);

        System.out.println(l1);


    }
}
