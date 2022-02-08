package com.fight2escape.Question;

import java.util.HashMap;
import java.util.Map;

public class No70_climbStairs {

    public static void main(String[] args) {
        int[] test = {1, 2, 45};
        for (int n : test) {
            int res = (new No70_climbStairs()).climbStairs(n);
            System.out.println(res);
        }
    }

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int a = 1, b = 2, c = 0;

        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
