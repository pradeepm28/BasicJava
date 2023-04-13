package com.colruytgroup;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>();

        l1.add(1);
        l1.add(2);

        System.out.println(l1);  // [1,2]
        System.out.println(l1.get(1)); // 2
        System.out.println(l1.contains(1));
        l1.add(0,7);
        System.out.println(l1);  // [7,1,2]
        l1.set(0,0);
        System.out.println(l1);  // [0,1,2]
        l1.add(2);
        System.out.println(l1);  // [0,1,2,2]
        System.out.println(l1.indexOf(2));
        System.out.println(l1.lastIndexOf(2));
        System.out.println(l1.isEmpty());
        System.out.println(l1.stream());

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);

        List<Integer> l3 = new ArrayList<Integer>();
        l3.add(3);
        l3.add(4);
        System.out.println("l3 + l2:" + l3.addAll(l2) + ". l3 now is:" + l3);
    }
}
