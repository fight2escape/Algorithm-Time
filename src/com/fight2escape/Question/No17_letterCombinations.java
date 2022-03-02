package com.fight2escape.Question;

import java.lang.reflect.Array;
import java.util.*;

public class No17_letterCombinations {
    public static void main(String[] args) {
        List<String> res = (new No17_letterCombinations()).letterCombinations("2345");
        System.out.println(res);
    }

    Map<Character, List<String>> map = new HashMap<>(){{
        put('2', List.of("a", "b", "c"));
        put('3', List.of("d", "e", "f"));
        put('4', List.of("g", "h", "i"));
        put('5', List.of("j", "k", "l"));
        put('6', List.of("m", "n", "o"));
        put('7', List.of("p", "q", "r", "s"));
        put('8', List.of("t", "u", "v"));
        put('9', List.of("w", "x", "y", "z"));
    }};

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return List.of();
        }
        List<String> cur = map.get(digits.charAt(0));
        if (digits.length() == 1) {
            return cur;
        }

        List<String> after = letterCombinations(digits.substring(1));
        List<String> res = new ArrayList<>();
        for (String c:cur) {
            for (String a:after) {
                res.add(c + a);
            }
        }
        return res;
    }
}
