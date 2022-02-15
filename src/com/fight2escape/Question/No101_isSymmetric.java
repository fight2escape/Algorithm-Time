package com.fight2escape.Question;

public class No101_isSymmetric {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return equals(root.left, root.right);
    }

    private boolean equals(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        } else if (a != null && b != null && a.val == b.val) {
            return equals(a.left, b.right) && equals(a.right, b.left);
        } else {
            return false;
        }
    }
}
