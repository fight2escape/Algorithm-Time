package com.fight2escape.Question;

import java.util.Arrays;

public class No169_majorityElement {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
