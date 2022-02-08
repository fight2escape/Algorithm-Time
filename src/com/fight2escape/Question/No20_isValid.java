package com.fight2escape.Question;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class No20_isValid {
    public static void main(String[] args) {
        String[] test = new String[]{
                "()[]",
                "[](){{",
                "(((",
                "(())))"
        };
        for (String s : test) {
            Boolean res = (new No20_isValid()).isValid(s);
            System.out.println(s + ":" + res);
        }
    }

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<>() {{
            put(']', '[');
            put(')', '(');
            put('}', '{');
        }};

        Deque<Character> stk = new LinkedList<>();

        for (char ch : s.toCharArray()) {
            if (pairs.containsKey(ch)) {
                if (stk.isEmpty() || stk.peek() != pairs.get(ch)) {
                    return false;
                }
                stk.pop();
            } else {
                stk.push(ch);
            }
        }

        return stk.isEmpty();
    }
}
