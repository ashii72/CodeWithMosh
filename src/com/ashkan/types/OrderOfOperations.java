package com.ashkan.types;

public class OrderOfOperations {

    public void getFirst() {

        int x = 10 + 3 * 2;
        System.out.println(x);
    }

    public void getSecond() {

        int y = (10 + 3) * 2;
        System.out.println(y);
    }
}
