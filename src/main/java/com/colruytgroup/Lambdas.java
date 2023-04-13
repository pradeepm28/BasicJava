package com.colruytgroup;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambdas {

    public static void main(String[] args) {

        //Supplier
        Supplier<String> supplier = () -> "Hello Lambda!!";
        System.out.println("String is :" + supplier.get());

        //Consumer --  press shift twice to open all types
        Consumer<String> consumer = txt -> {       // multi lines allowed with { };
        // Consumer<String> consumer = (String txt) -> {     -- also can code as
            System.out.println("Consumer implementation!!!");
            System.out.println(txt);
        };
        consumer.accept("8W22");

    }
}
