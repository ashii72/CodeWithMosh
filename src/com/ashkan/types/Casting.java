package com.ashkan.types;

public class Casting {

    public void getImplicitCasting() {

        // Implicit Casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);
    }

    public void getExplicitCasting() {

        // Explicit Casting
        // double > float > long > int > short > byte
        double x = 1.1;
        int y = (int) x +2;
        System.out.println(y);
    }

    public void getStringToIntCasting() {

        String x = "1";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);
    }

    public void getStringToDoubleCasting() {

        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);
    }


}
