package com.fight2escape.Question;

import java.util.HashMap;
import java.util.Map;

public class No409_longestPalindrome {
    public static void main(String[] args) {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        int res = (new No409_longestPalindrome()).longestPalindrome(s);
        System.out.println(res);
    }

    public int longestPalindrome(String s) {
        Map<Character, Integer> stat = new HashMap<>();
        for (char ch:s.toCharArray()) {
            stat.put(ch, stat.getOrDefault(ch, 0) + 1);
        }

        int res = 0;
        boolean has_odd = false;
        for (int n : stat.values()) {
            if (n % 2 == 0) {
                res += n;
            } else {
                res += n-1;
                has_odd = true;
            }
        }

        if (has_odd) {
            res++;
        }

        return res;
    }
}
