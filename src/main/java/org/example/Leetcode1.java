package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode1 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i: candies) {
            if (i >= max)
                max = i;
        }
        List<Boolean> b = new ArrayList<>();
        for (int i: candies) {
            b.add((i+extraCandies)>=max);
        }
        return b;
    }

    public static void main(String[] args) {
        Leetcode1 obj=new Leetcode1();
        Scanner sc=new Scanner(System.in);
        int candies[]=new int[5];
        int n=candies.length;
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }
        int extraCandies=sc.nextInt();
        List<Boolean> result=obj.kidsWithCandies(candies,extraCandies);
        System.out.println(result);

    }
}


