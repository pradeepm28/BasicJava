package com.colruytgroup;

public class factorial {

    int i,res=1;
    public int facto(int n){
        for(i=1;i<=n;i++)
        {
            res = res*i;
        }
        return res;
    }

}
