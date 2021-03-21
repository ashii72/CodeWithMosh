package com.ashkan.types;

public class MathClass {

    public void roundMethod() {
        int result = Math.round(1.1F);
        System.out.println(result);
    }

    public void ceilMethod() {
        int result = (int) Math.ceil(1.1F);
        System.out.println(result);
    }

    public void floorMethod() {
        int result = (int) Math.floor(1.1F);
        System.out.println(result);
    }

    public void maxMethod() {
        int result = Math.max(1,2);
        System.out.println(result);
    }

    public void minMethod() {
        int result = Math.min(1,2);
        System.out.println(result);
    }

    public void randomMethod() {
        int result = (int) (Math.random() * 100);
        System.out.println(result);
    }
}
