package com.colruytgroup.techgig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ForestFire {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        if (N >= X) {
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = sc.nextInt();
            }

            Arrays.sort(array);

            List<Integer> arrlist = new ArrayList<Integer>();
            int temp=0,min_energy=0;

            min_energy = array[N-X];

            for (int i = 0; i < N; i++) {
                if (array[i] >= min_energy) {
                       temp=temp + 1;
                }
            }
            if (temp == X) {
                System.out.println(min_energy);
            }
            else {
                System.out.println(-1);
            }
        }
        else {
            System.out.println(-1);
    }

    }
}
