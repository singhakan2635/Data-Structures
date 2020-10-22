package com.practise.DataStructures;

public class Main
{
    public static void main(String[] args) {

        // Implementing the Generic Stack
        StackGeneric<String> stack = new StackGeneric<>(3);
        stack.push("ABC");
        stack.push("ASD");
        stack.push("iydd");
        stack.push("ysgd");
        while (!stack.isEmpty())
            System.out.print(stack.pop()+" ");
        System.out.println();

        //Implementing the int stack
        Stack stack1 = new Stack(3);
        int i=1;
        while (i<5)
        {
            stack1.push(i);
            i++;
        }
        while (!stack1.isEmpty())
        {
            System.out.print(stack1.pop()+" ");
        }
    }
}
