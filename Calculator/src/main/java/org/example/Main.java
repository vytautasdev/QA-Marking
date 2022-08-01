package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var calculator = new Calculator();
        var scn = new Scanner(System.in);

        System.out.println("Hello welcome to my calculator");
        System.out.println("------------------------------");
        System.out.println("What would you like to do? please enter a number");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        var choice = scn.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected - Addition operation.");
                System.out.println("The result is: " + calculator.add());
                break;
            case 2:
                System.out.println("You have selected - Subtraction operation.");
                System.out.println("The result is: " + calculator.subtract());
                break;
            case 3:
                System.out.println("You have selected - Division operation.");
                System.out.println("The result is: " + calculator.divide());
                break;
            case 4:
                System.out.println("You have selected - Multiplication operation.");
                System.out.println("The result is: " + calculator.multiply());
                break;
            default:
                System.out.println("I know only so much mathematics.. please enter a valid choice");

        }
    }
}