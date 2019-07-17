package q30;

/*
    定义栈的数据结构，
    请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。

*/

import java.util.Stack;

public class Solution {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        stack.push(node);
        minStack.push(minStack.isEmpty() ? node : Math.min(minStack.peek(), node));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
