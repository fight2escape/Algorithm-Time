package com.fight2escape.Question;

import java.util.HashMap;
import java.util.Map;

public class No3_lengthOfLongestSubstring {
    public static void main(String[] args) {
        int res = (new No3_lengthOfLongestSubstring()).lengthOfLongestSubstring("pwwkew");
        System.out.println(res);
    }

    public int lengthOfLongestSubstring(String s) {
        int b = 0, res = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int idx = map.get(ch);
                for (int j = b; j <= idx; j++) {
                    map.remove(s.charAt(j));
                }
                b = idx+1;
            }

            map.put(ch, i);
            res = Math.max(res, i - b + 1);
        }

        return res;
    }
}
