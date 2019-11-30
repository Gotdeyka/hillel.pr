package lesson_7;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.empty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("peek" + stack.peek());

        Integer number = stack.pop();

        System.out.println("pop" + number);

        System.out.println("In stack after pop");
        for (Integer integer : stack) {
            System.out.println(integer);
        }
    }
}
