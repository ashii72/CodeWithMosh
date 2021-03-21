package com.ashkan.types;

import java.util.Arrays;

public class ArraySection {

    // Old Syntax
    int[] numbers1 = new int[5];

    //New Syntax
    int[] numbers2 = { 2, 3, 1, 5, 4 };

    public String arrayListOldSyntax() {
        numbers1[0] = 1;
        numbers1[1] = 2;
        return Arrays.toString(numbers1);
    }

    public String arrayListNewSyntax() {
        return Arrays.toString(numbers2);
    }

    public int arrayListNewSyntaxLength() {
        return numbers2.length;
    }

    public String arrayListNewSyntaxSort() {
        Arrays.sort(numbers2);
        return Arrays.toString(numbers2);
    }
}
