package com.fight2escape.Question;

public class No190_reverseBits {
    public static void main(String[] args) {
        int[] test = {2,3};
        for (int n : test) {
            int res = (new No190_reverseBits()).reverseBits(n);
            System.out.println(res);
        }
    }

    public int reverseBits(int n) {
        int res = 0, cur;

        for (int i = 0; i < 32; i++) {
            cur = n & 1;

            res <<= 1;
            res += cur;

            n >>= 1;
        }

        return res;
    }
}
