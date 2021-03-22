package com.ashkan.types;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    Scanner scanner = new Scanner(System.in);

    public void calculateMortgage() {

        int principal = 0;
        double annualInterestRate = 100F;
        double monthlyInterestRate = 0;
        byte years = 0;
        int numberOfPayments = 0;


        while (principal < 1000 || principal > 1_000_000) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal < 1000 || principal > 1_000_000)
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }


        while (annualInterestRate < 1 || annualInterestRate > 30) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
            if (annualInterestRate < 1 || annualInterestRate > 30)
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }



        while (years < 1 || years > 30) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            numberOfPayments = years * MONTHS_IN_YEAR;
            if (years < 1 || years > 30)
            System.out.println("Enter a value between 1 and 30.");
        }


        double formula = Math.pow((1 + monthlyInterestRate),numberOfPayments);
        double mortgage = principal * monthlyInterestRate * formula / (formula - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
