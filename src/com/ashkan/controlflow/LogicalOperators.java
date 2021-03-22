package com.ashkan.controlflow;

public class LogicalOperators {

    public void isWarm() {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
    }

    public void isEligible() {
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}
