package com.fight2escape.Question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No136_singleNumber {
    public static void main(String[] args) {
        int[] test = {
                4,2,1,2,1
        };
        int res = (new No136_singleNumber()).singleNumber(test);
        System.out.println(res);
    }

    public int singleNumber(int[] nums) {
        // 位运算
        int res = 0;
        for (int n:nums) {
            res ^= n;
        }
        return res;

        // 排序+遍历
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i+=2) {
//            if (i == nums.length-1 || nums[i] != nums[i+1]) {
//                return nums[i];
//            }
//        }
//
//        return -1;

        // map
//        Map<Integer, Integer> cnt = new HashMap<>();
//
//        for (int n:nums) {
//            if (cnt.containsKey(n)) {
//                cnt.put(n, cnt.get(n) + 1);
//            } else {
//                cnt.put(n, 1);
//            }
//        }
//
//        for (Integer k : cnt.keySet()) {
//            if (cnt.get(k) == 1) {
//                return k;
//            }
//        }
//
//        return -1;
    }
}
