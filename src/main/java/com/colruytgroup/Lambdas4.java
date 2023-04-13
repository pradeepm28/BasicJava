package com.colruytgroup;

import java.sql.SQLOutput;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class Lambdas4 {

    public static void main(String[] args) {

        // Lambdas for performance tuning while converting primitive to obj and viceversa

        IntSupplier supplier = () -> 10;
        System.out.println(supplier.getAsInt());

        DoubleToIntFunction d = (double value) -> (int)Math.floor(value);
        System.out.println(d.applyAsInt(Math.PI));
    }
}
