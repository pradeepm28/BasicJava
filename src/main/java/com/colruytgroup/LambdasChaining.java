package com.colruytgroup;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdasChaining {

    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println("c1 consumed " + s);
        Consumer<String> c2 = s -> System.out.println("c2 consumed " + s);

        Consumer<String> c3 = c1.andThen(c2); // c3 chained c1 & c2
        c3.accept("Hello");

        Predicate<String> p1 = s -> s == null;
        System.out.println(p1.test(null));
        System.out.println(p1.test("Text"));
        System.out.println("---------");

        Predicate<String> p2 = s -> s.isEmpty();
        System.out.println(p2.test(""));
        System.out.println(p2.test("Text1"));
        System.out.println("---------");

        Predicate<String> p3 = p1.negate().and(p2.negate());
        System.out.println(p3.test(null));
        System.out.println(p3.test(""));
        System.out.println(p3.test("Java"));
    }
}
