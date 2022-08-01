package org.example;

import java.util.Scanner;

public class Calculator {
    int x;
    int y;

    public int add() {
        var scn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = scn.nextInt();
        System.out.println("Enter second number: ");
        y = scn.nextInt();
        return x + y;
    }

    public int subtract() {
        var scn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = scn.nextInt();
        System.out.println("Enter second number: ");
        y = scn.nextInt();
        return x - y;
    }

    public int divide() {
        var scn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = scn.nextInt();
        System.out.println("Enter second number: ");
        y = scn.nextInt();
        return x / y;
    }

    public int multiply() {
        var scn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = scn.nextInt();
        System.out.println("Enter second number: ");
        y = scn.nextInt();
        return x * y;
    }
}
