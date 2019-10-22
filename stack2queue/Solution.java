package Niuke.stack2queue;


import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() throws Exception{
//        if (stack1.empty()){
//            throw new Exception("null");
//        }
        if (!stack2.empty()){
            return stack2.pop();
        }
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();

    }

    public static void main(String[] args) throws Exception {
        Solution q = new Solution();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.push(4);
        System.out.println(q.pop());
        q.push(5);
        System.out.println(q.pop());
        System.out.println(q.pop());


    }
}
