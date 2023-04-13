package com.colruytgroup;

import java.util.concurrent.Executors;

public class RunnableDemo implements Runnable {

    @Override
    public void run() {
            int i =0;
            while (i++ < 10){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        }

    public static void main(String[] args) {
        System.out.println("Main thread is- " + Thread.currentThread().getName());
        RunnableDemo obj= new RunnableDemo();
        obj.run();

    }
}


