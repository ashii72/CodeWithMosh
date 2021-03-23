package com.ashkan;

import com.ashkan.controlflow.*;
import com.ashkan.types.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Primitive Types
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        System.out.println(primitiveTypes.getAge());

        // Reference Types
        ReferenceTypes referenceTypes = new ReferenceTypes();
        System.out.println(referenceTypes.getDate());

        // Primitive Vs Reference
        PrimitiveVsReference primitiveVsReference = new PrimitiveVsReference();
        System.out.println(primitiveVsReference.getPoint());

        // Strings
        Strings strings = new Strings();
        System.out.println(strings.getMessage());
        System.out.println(strings.checkMessageEndWith());
        System.out.println(strings.checkMessageStartWith());
        System.out.println(strings.checkMessageLength());
        System.out.println(strings.checkMessageIndexOf());
        System.out.println(strings.replaceCharacter());
        System.out.println(strings.toLowerCase());
        System.out.println(strings.trim());

        // Escape Sequences
        EscapeSequences escapeSequences = new EscapeSequences();
        System.out.println(escapeSequences.escapeChar());
        System.out.println(escapeSequences.driveEscapeChar());
        System.out.println(escapeSequences.newLineEscapeChar());
        System.out.println(escapeSequences.tabEscapeChar());

        // Array Section
        ArraySection arraySection = new ArraySection();
        System.out.println(arraySection.arrayListOldSyntax());
        System.out.println(arraySection.arrayListNewSyntax());
        System.out.println(arraySection.arrayListNewSyntaxLength());
        System.out.println(arraySection.arrayListNewSyntaxSort());

        // Multi Dimensional Array
        MultiDimensionalArray multiDimensionalArray = new MultiDimensionalArray();
        System.out.println(Arrays.deepToString(multiDimensionalArray.getArrayNumbers()));

        // Arithmetic Expressions
        ArithmeticExpressions arithmeticExpressions = new ArithmeticExpressions();
        arithmeticExpressions.getValues();
        arithmeticExpressions.getNewValues();
        arithmeticExpressions.compoundAssignOperators();

        // Order Of Operations
        OrderOfOperations orderOfOperations = new OrderOfOperations();
        orderOfOperations.getFirst();
        orderOfOperations.getSecond();

        // Casting
        Casting casting = new Casting();
        casting.getImplicitCasting();
        casting.getExplicitCasting();
        casting.getStringToIntCasting();
        casting.getStringToDoubleCasting();

        // Math Class
        MathClass mathClass = new MathClass();
        mathClass.roundMethod();
        mathClass.ceilMethod();
        mathClass.floorMethod();
        mathClass.maxMethod();
        mathClass.minMethod();
        mathClass.randomMethod();

        // Formatting Numbers
        FormattingNumbers formattingNumbers = new FormattingNumbers();
        formattingNumbers.getCurrencyInstance();
        formattingNumbers.getPercentInstance();

        // Reading Input
        ReadingInput readingInput = new ReadingInput();
        readingInput.getAge();
        readingInput.getName();
        System.out.println("************************************************________________________________________************************************************");

        // Logical Operators
        LogicalOperators logicalOperators = new LogicalOperators();
        logicalOperators.isWarm();
        logicalOperators.isEligible();

        // If Statements
        IfStatements ifStatements = new IfStatements();
        ifStatements.temp();
        ifStatements.simplifyIf();

        // Ternary Operator
        TernaryOperator ternaryOperator = new TernaryOperator();
        ternaryOperator.ternary();

        // Switch Statements
        SwitchStatements switchStatements = new SwitchStatements();
        switchStatements.role();

        // FizzBuzz
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz();
    }
}
