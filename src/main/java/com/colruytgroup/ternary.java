package com.colruytgroup;

public class ternary {
    public void biggest(int a, int b, int c){
        int res = (a>b) ? ((a>c? a:c)):((b>c? b:c));
        System.out.println("Biggest among 3  numbers is:" + res);
    }

}
