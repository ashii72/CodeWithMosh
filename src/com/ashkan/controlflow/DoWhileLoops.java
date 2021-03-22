package com.ashkan.controlflow;

import java.util.Scanner;

public class DoWhileLoops {

    public void doWhile() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}
