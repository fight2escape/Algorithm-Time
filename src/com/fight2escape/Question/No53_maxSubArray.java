package com.fight2escape.Question;

public class No53_maxSubArray {
    public static void main(String[] args) {
        int[] test = {7,-1,2};
        int res = (new No53_maxSubArray()).maxSubArray(test);
        System.out.println(res);
    }

    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

}
