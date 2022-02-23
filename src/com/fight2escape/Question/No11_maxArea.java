package com.fight2escape.Question;

public class No11_maxArea {
    public static void main(String[] args) {

        int[] height = new int[]{};
        int res = (new No11_maxArea()).maxArea(height);
        System.out.println(res);
    }

    public int maxArea(int[] height) {
        int lf = 0, rg = height.length-1, res = rg * Math.min(height[lf], height[rg]);
        while (lf < rg) {
            if (height[lf] <= height[rg]) {
                lf++;
            } else {
                rg--;
            }
            res = Math.max(res, (rg - lf) * Math.min(height[lf], height[rg]));
        }
        return res;
    }
}
