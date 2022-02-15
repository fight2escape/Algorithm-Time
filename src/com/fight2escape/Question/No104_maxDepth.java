package com.fight2escape.Question;

import java.util.Deque;
import java.util.LinkedList;

public class No104_maxDepth {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

//    BFS
//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        Deque<TreeNode> q = new LinkedList<>();
//        int res = 0;
//        q.add(root);
//
//        while (!q.isEmpty()) {
//            res += 1;
//            int sz = q.size();
//            for (int i = 0; i < sz; i++) {
//                TreeNode cur = q.remove();
//                if (cur.left != null) {
//                    q.add(cur.left);
//                }
//                if (cur.right != null) {
//                    q.add(cur.right);
//                }
//            }
//        }
//
//        return res;
//    }
}
