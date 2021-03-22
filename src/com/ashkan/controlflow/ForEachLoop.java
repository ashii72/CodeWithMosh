package com.ashkan.controlflow;

public class ForEachLoop {

    public void forEach() {
        String [] fruits = { "Apple", "Mango", "Orange" };

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);
    }
}
