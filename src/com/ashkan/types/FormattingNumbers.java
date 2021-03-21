package com.ashkan.types;

import java.text.NumberFormat;

public class FormattingNumbers {

    public void getCurrencyInstance() {
        String result = NumberFormat.getCurrencyInstance().format(1234567.891);
        System.out.println(result);
    }

    public void getPercentInstance() {
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
