package zbrajanjeStogova;

import java.util.Stack;


public class StackAddition {

    public static Stack<Integer> addStacks(Stack<Integer> stack1, Stack<Integer> stack2) { //metoda za zbrajanje stogova

        Stack<Integer> resultStack = new Stack<>(); // stog za rezultat

        // Provjeravamo duljinu stogova
        int length1 = stack1.size();
        int length2 = stack2.size();

        if (length1 > length2) {
            System.out.println("************* first is longer *****************");
        } else if (length2 > length1) {
            System.out.println("************* second is longer *****************");
        } else {
            System.out.println("**************** same length ********************");
        }

        // Zbrajanje elemenata do iste duljine
        int length = Math.min(length1, length2);
        for (int i = 0; i < length; i++) {
            int sum = stack1.pop() + stack2.pop();
            resultStack.push(sum);
        }

        // Dodavanje preostalih elemenata duljeg stoga
        Stack<Integer> longerStack = length1 > length2 ? stack1 : stack2;
        while (!longerStack.isEmpty()) {
            resultStack.push(longerStack.pop());
        }

        return resultStack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Dodavanje elemenata u stogove
        stack1.push(24);
        stack1.push(3);
        stack1.push(7);
        stack1.push(8);
        stack1.push(9);
        stack1.push(11);
        stack1.push(14);
        stack1.push(30);
        stack1.push(3000);

        stack2.push(1);
        stack2.push(1);
        stack2.push(1);
        stack2.push(1);
        stack2.push(1);
        stack2.push(1);
        stack2.push(1);

        // Zbrajanje stogova
        Stack<Integer> result = addStacks(stack1, stack2);

        // Ispis rezultata
        System.out.println("res = " + result);
    }
}
