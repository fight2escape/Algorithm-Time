package com.fight2escape.Question;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class No225_MyStack {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(2);
        ms.push(3);
        ms.push(4);
        ms.push(6);
        System.out.println(ms.top());
        System.out.println(ms.empty());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.empty());

    }

}
class MyStack {

    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);

        int size = q.size();
        if (size > 1) {
            for (int i = 0; i < size-1; i++) {
                q.offer(q.poll());
            }
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
