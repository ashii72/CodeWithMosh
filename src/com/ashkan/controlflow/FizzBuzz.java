package com.ashkan.controlflow;

import java.util.Scanner;

public class FizzBuzz {

    Scanner scanner = new Scanner(System.in);

    public void fizzBuzz() {

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0) {
            System.out.println("Fizz");
        }
        else if (number % 3 == 0){
            System.out.println("Buzz");
        }
        else
            System.out.println(number);
    }
}
