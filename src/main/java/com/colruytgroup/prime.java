package com.colruytgroup;

public class prime {
    int primeno=0;

    /*public prime(int pno){
        this.primeno=pno;
    }*/

    public void isPrime(int pnum){
        int i;
        for(i=2;i<pnum;i++)
        {
            if(pnum%i==0){
                System.out.println(pnum + " is not a prime!!!");
                break;
            }
        }
        if(i==pnum){
            System.out.println(pnum +" is Prime!!!");
        }

    }

}
