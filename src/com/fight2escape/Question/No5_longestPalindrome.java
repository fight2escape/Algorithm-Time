package com.fight2escape.Question;

public class No5_longestPalindrome {
    public static void main(String[] args) {
        String res = (new No5_longestPalindrome()).longestPalindrome("aabbba");
        System.out.println(res);
    }

    public String longestPalindrome(String s) {
        int l = 0, r = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.length() - i <= r-l) {
                break;
            }
            for (int j = s.length() - 1; j >= i; j--) {
                if (j+1-i <= r-l) {
                    break;
                }
                if (check(s.substring(i,j+1))) {
                    l = i;
                    r = j + 1;
                }
            }
        }
        return s.substring(l, r);
    }

    public boolean check(String s) {
        int l = 0, r = s.length()-1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
