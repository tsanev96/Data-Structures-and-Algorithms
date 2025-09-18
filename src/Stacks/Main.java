package Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);

        var topNotRemoved = stack.peek();

        var stringReverser = new StringReverser();

        System.out.println(stringReverser.reverse("abcd"));;

    }
}
