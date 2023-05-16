package com.colruytgroup;

    // Abstract class
    abstract class Sunstar {
        abstract void printInfo();
    }

    // Abstraction performed using extends
    class Employee extends Sunstar {
        void printInfo() {
            String name = "test";
            int age = 28;
            float salary = 200.2F;

            System.out.println(name);
            System.out.println(age);
            System.out.println(salary);

        }

    }

    // Main Class
    public class AbstractDemo {

        public static void main(String[] args) {
            Sunstar s = new Employee();
            s.printInfo();

        }


}
