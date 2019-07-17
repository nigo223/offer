package q9;

/*
    用两个栈来实现一个队列，完成队列的Push和Pop操作。
    队列中的元素为int类型。

    分析：
        一个栈存入，一个栈取出

*/

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack2.empty()) {
            return stack2.pop(); // 栈2非空，直接取出
        } else { // 栈2是空的
            if (stack1.empty()) { // 如果栈1也是空的，说明队列是空的
                throw new RuntimeException("队列空，元素不能出队");
            }
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
}
