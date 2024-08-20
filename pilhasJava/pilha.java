package pilhasJava;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class pilha {

    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<String>();

        deque.add("Element 1 (Tail)");
        deque.add("Element 2 (Head)");
        deque.add("Element 3 (Tail)");
        deque.add("Element 4 (Head)");

        System.out.println("---------------------------------------- Deque ---------------------------------------- " + "\n");

        System.out.println("deque geral       : " + deque + "\n");
        System.out.println("deque.pop()       : " + deque.pop() + "\n");
        System.out.println("deque.peek()      : " + deque.peek() + "\n");
        System.out.println("deque.peekFirst() : " + deque.peekFirst() + "\n");
        System.out.println("deque.peekLast()  : " + deque.peekLast() + "\n");


        System.out.println("---------------------------------------- Stack ---------------------------------------- " + "\n");

        Stack<String> stack = new Stack<>();

        stack.add("Element 1 (Tail)");
        stack.add("Element 2 (Head)");
        stack.add("Element 3 (Tail)");
        stack.add("Element 4 (Head)");

        System.out.println("Stack geral : " + stack + "\n");
        System.out.println("Stack.pop   : " + stack.pop().toString() + "\n");



    }

}
