package com.colruytgroup;

public class swap2 {

    int a,b;

    public void swapnums(int a, int b){
        System.out.println("Before:"+ a + ":" + b);
        a = a +b;   /*a30 */
        b = a-b;    /*a30, b10 */
        a = a-b;    /*b10, a20 */
        System.out.println("After:"+ a + ":" + b);

    }
}
