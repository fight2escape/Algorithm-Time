package com.fight2escape.Question;

import java.util.ArrayList;
import java.util.List;

public class No119_getRow {
    public static void main(String[] args) {
        int[] test = {0,1,2,3,4};
        for (int i:test) {
            List<Integer> res = (new No119_getRow()).getRow(i);
            for (Integer item:res) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();

        res.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j > 0 ; j--) {
                if (j == i) {
                    res.add(1);
                } else {
                    res.set(j, res.get(j) + res.get(j-1));
                }
            }
        }

        return res;
    }
}
