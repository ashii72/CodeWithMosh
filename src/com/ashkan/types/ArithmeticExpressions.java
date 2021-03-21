package com.ashkan.types;

public class ArithmeticExpressions {

    public void getValues() {

        int x = 1;
        int y = x++;

        System.out.println(x);
        System.out.println(y);
    }

    public void getNewValues() {

        int x = 1;
        int y = ++x;

        System.out.println(x);
        System.out.println(y);
    }

    public void compoundAssignOperators() {
        int x = 8;
        x *= 2;
        System.out.println(x);
    }
}
