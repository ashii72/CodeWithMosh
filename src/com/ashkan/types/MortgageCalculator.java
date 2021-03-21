package com.ashkan.types;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    Scanner scanner = new Scanner(System.in);

    public void calculateMortgage() {

        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.println(principal);


        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
        System.out.println(monthlyInterestRate);


        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;
        System.out.println(numberOfPayments);


        double formula = Math.pow((1 + monthlyInterestRate),numberOfPayments);
        double mortgage = principal * monthlyInterestRate * formula / (formula - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
