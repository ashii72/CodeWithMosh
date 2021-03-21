package com.ashkan.types;

import java.util.Scanner;

public class ReadingInput {

    public void getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);
    }

    public void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String  name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}
