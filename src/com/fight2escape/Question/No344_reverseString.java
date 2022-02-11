package com.fight2escape.Question;

public class No344_reverseString {
    public static void main(String[] args) {
        char[] test = {'h', 'e', 'l', 'l', 'o'};
        (new No344_reverseString()).reverseString(test);
        System.out.println(test);
    }

    public void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            char tmp = s[i];
            s[i] = s[len-i-1];
            s[len-i-1] = tmp;
        }
    }
}
