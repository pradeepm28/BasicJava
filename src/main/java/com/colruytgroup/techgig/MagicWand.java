package com.colruytgroup.techgig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicWand {

    public static int diff(int a, int b) {
        if (a>b) {
            return a-b;
        }
        else {
            return b-a;
        }
    }

    public static void main(String[] args) {
        int cost = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] ints = new int[N];
        for (int i = 0; i < N; i++) {
            ints[i] = sc.nextInt();
        }
        int[] queries = new int[M];
        for (int j = 0; j < M; j++) {
            queries[j] = sc.nextInt();
        }

        //int[] result = new int[M];
        List<Integer> result = new ArrayList<Integer>();
        for (int j = 0; j < M; j++) {                // Queries is driver loop

            for (int i = 0; i < N; i++) {           // Integers loop for operations + or -
                if (ints[i] != queries[j]) {
                    cost = cost + diff(queries[j],ints[i]);
                }
            }
            //result[j] = cost;
            result.add(cost);
            cost = 0;
        }
        for (int i = 0; i < M; i++) System.out.print(result.get(i) + " ");
    }
}
