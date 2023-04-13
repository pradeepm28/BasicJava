package com.colruytgroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Lambdas3 {
    public static void main(String[] args) {

        User U1 = new User("Bob");
        User U2 = new User("Alice");
        User U3 = new User("Java");

        List<User> userList = Arrays.asList(U1, U2, U3);
        System.out.println("Initial User List:" + userList);

        List<String> names = new ArrayList<>();

        Function<User, String> toName = (User user) -> user.getName();
        for (User user : userList) {
            String name = toName.apply(user);  //Function's only abstract method
            names.add(name);
        }
        userList.forEach(u -> System.out.println(u));
        names.forEach(s -> System.out.println(s));
    }
}