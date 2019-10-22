package Niuke.MinStack;

import java.util.Stack;

public class Solution {
    Stack<Integer> mystack = new Stack<Integer>();
    Stack<Integer> minstack = new Stack<Integer>();

    public void push(int node) {
        mystack.push(node);
        if (minstack.empty())
            minstack.push(node);
        else if (node<minstack.peek())
            minstack.push(node);

    }

    public void pop() {
        if (mystack.peek()==minstack.peek())
            minstack.pop();
        mystack.pop();
    }

    public int top() {

        return mystack.peek();
    }

    public int min() {
        return minstack.peek();

    }
}
