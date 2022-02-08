package com.fight2escape.Question;

import java.util.HashMap;

class No2_twoSum {
    public static void main(String[] args) {
        int[] res = (new No2_twoSum()).twoSum(new int[]{2,7,11,15}, 9);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (m.containsKey(key) && m.get(key) != i) {
                return new int[]{i, m.get(key)};
            }
        }

        return new int[]{};
    }
}
