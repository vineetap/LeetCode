package main.java;

import java.util.Stack;

public class _NonLC7 {
    public static void printUnique(String input)
    {
        Stack<Character> stack = new Stack<>();
        for (int index = 0; index < input.length(); index++)
        {
            if (!stack.isEmpty() && stack.peek() == input.charAt(index))
            {
                continue;
            }
            else
            {
                stack.push(input.charAt(index));
            }
        }
        System.out.println(stack.toString());
    }

    public static void main(String[] args)
    {
        printUnique("abababaabbbaaaa");
    }
}
