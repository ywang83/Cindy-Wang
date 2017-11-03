package Textbook;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class stackPractice{
    public static void main(String[] args) {
        final Stack<String> myStack = new Stack<>();
        myStack.push("Hello");
        myStack.push("World");
        myStack.push("what");
        myStack.push("up");

        System.out.println(myStack);

        final List<String> myList = new LinkedList<>();

        Stack<String> stackReverse = new Stack<>();
        while (!myStack.isEmpty()){
            stackReverse.push(myStack.pop());
        }

        while (!stackReverse.isEmpty()){
            myList.add(stackReverse.pop());
        }

        System.out.println(myList);

    }
}