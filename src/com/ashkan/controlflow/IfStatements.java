package com.ashkan.controlflow;

public class IfStatements {

    public void temp() {

        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");
    }

    public void simplifyIf() {
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
    }
}
