package com.fight2escape.Question;

public class No415_addStrings {
    public static void main(String[] args) {
        String a = "111";
        String b = "9";
        String res = (new No415_addStrings()).addStrings(a, b);
        System.out.println(res);
    }

    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i1 = num1.length()-1, i2 = num2.length()-1, add = 0, sum;

        while (i1>=0 || i2>=0 || add>0) {
            // 提前结束
            if ((i1 < 0 || i2 < 0) && add == 0) {
                break;
            }

            int a = i1 < 0 ? 0 : num1.charAt(i1) - '0';
            int b = i2 < 0 ? 0 : num2.charAt(i2) - '0';

            sum = a + b + add;
            add = sum / 10;
            res.append(sum % 10);

            i1--;
            i2--;
        }
        res.reverse();

        if (i1 >= 0) {
            res.insert(0, num1.substring(0, i1+1));
        }

        if (i2 >= 0) {
            res.insert(0, num2.substring(0, i2+1));
        }

        return res.toString();
    }
}
