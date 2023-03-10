package org.example.polynomial;

import java.util.Stack;

public class Polynomial {
    String input;
    Stack<Integer> intStack;

    public Polynomial(String input) {
        this.input = input;
        this.intStack = new Stack<Integer>();

    }

    public static int calc(String exp) {
        int result = 0;

        String[] bits = exp.split(" ");

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[2]);
        String op = bits[1];

        if (op.equals("+"))
            result = a + b;
        else if (op.equals("-"))
            result = a - b;
        return result;
    }

}
