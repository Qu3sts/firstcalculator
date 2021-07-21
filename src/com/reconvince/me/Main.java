package com.reconvince.me;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n" +
                "░█████╗░░█████╗░███╗░░██╗░██████╗░█████╗░██╗░░░░░███████╗\n" +
                "██╔══██╗██╔══██╗████╗░██║██╔════╝██╔══██╗██║░░░░░██╔════╝\n" +
                "██║░░╚═╝██║░░██║██╔██╗██║╚█████╗░██║░░██║██║░░░░░█████╗░░\n" +
                "██║░░██╗██║░░██║██║╚████║░╚═══██╗██║░░██║██║░░░░░██╔══╝░░\n" +
                "╚█████╔╝╚█████╔╝██║░╚███║██████╔╝╚█████╔╝███████╗███████╗\n" +
                "░╚════╝░░╚════╝░╚═╝░░╚══╝╚═════╝░░╚════╝░╚══════╝╚══════╝\n" +
                "\n" +
                "░█████╗░░█████╗░██╗░░░░░░█████╗░██╗░░░██╗██╗░░░░░░█████╗░████████╗░█████╗░██████╗░\n" +
                "██╔══██╗██╔══██╗██║░░░░░██╔══██╗██║░░░██║██║░░░░░██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗\n" +
                "██║░░╚═╝███████║██║░░░░░██║░░╚═╝██║░░░██║██║░░░░░███████║░░░██║░░░██║░░██║██████╔╝\n" +
                "██║░░██╗██╔══██║██║░░░░░██║░░██╗██║░░░██║██║░░░░░██╔══██║░░░██║░░░██║░░██║██╔══██╗\n" +
                "╚█████╔╝██║░░██║███████╗╚█████╔╝╚██████╔╝███████╗██║░░██║░░░██║░░░╚█████╔╝██║░░██║\n" +
                "░╚════╝░╚═╝░░╚═╝╚══════╝░╚════╝░░╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝");
        startCalc();


    }


    public static void startCalc() {
        System.out.println("What would you like to do: ");
        Scanner scanner = new Scanner(System.in);
        String balls = scanner.nextLine();
        String[] testes = {"add", "subtract", "divide", "multiply", "sqrt"};
        if (balls.equalsIgnoreCase(testes[0])) {
            addTo();
            } else if (balls.equalsIgnoreCase(testes[1])) {
                subtract();
            }  else if (balls.equalsIgnoreCase(testes[2])) {
                multiply();
            } else if (balls.equalsIgnoreCase(testes[3])) {
                divide();
            } else if (balls.equalsIgnoreCase(testes[4])) {
                sqrt();
            } else {
            allowedActions();
        }
        }


    public static void resetCalc() {

        System.out.println("\n" +
                "░██████╗██╗░░░██╗░█████╗░░█████╗░███████╗░██████╗░██████╗\n" +
                "██╔════╝██║░░░██║██╔══██╗██╔══██╗██╔════╝██╔════╝██╔════╝\n" +
                "╚█████╗░██║░░░██║██║░░╚═╝██║░░╚═╝█████╗░░╚█████╗░╚█████╗░\n" +
                "░╚═══██╗██║░░░██║██║░░██╗██║░░██╗██╔══╝░░░╚═══██╗░╚═══██╗\n" +
                "██████╔╝╚██████╔╝╚█████╔╝╚█████╔╝███████╗██████╔╝██████╔╝\n" +
                "╚═════╝░░╚═════╝░░╚════╝░░╚════╝░╚══════╝╚═════╝░╚═════╝░");
        System.out.println();
        System.out.println("What would you like to do:");
        Scanner scanner = new Scanner(System.in);
        String[] testes = {"add", "subtract", "divide", "multiply", "sqrt", "tutorial"};
        String balls = scanner.nextLine();
        if (balls.equalsIgnoreCase(testes[0])) {
            addTo();
        } else if (balls.equalsIgnoreCase(testes[1])) {
            subtract();
        }  else if (balls.equalsIgnoreCase(testes[2])) {
            multiply();
        } else if (balls.equalsIgnoreCase(testes[3])) {
            divide();
        } else if (balls.equalsIgnoreCase(testes[4])) {
            sqrt();
        } else {

        }
 
    }

    // Everything below is the same code basically with just the way the integer sum is calculated by Java. I also changed some strings based on what one is selected.
    private static void addTo() { // Created the adding
        Scanner scanner = new Scanner(System.in); // Creates scanner for first number.
        System.out.println("\n" + "First number: "); // Asks for first number.
        int balls = scanner.nextInt(); // Assigns first number to an integer that can be called later on.
        // 000 is the reset number and will trigger the method resetCalc.
        if (balls == 000) {
            resetCalc(); // Calls a method, which is the reset method.
            // The else statement below is if they insert any different integer to continue on with the calculation.
        } else {

            System.out.println("\n" + balls + " + \n"); // Shows all what they put in so far, including the symbol with the type of math they selected.
            System.out.println("Second number: "); // Asks the user to put in the second number, which they will enter on the line below this line.
            Scanner second = new Scanner(System.in); // Creates the scanner needed to take in the input for the second number.
            int ball = second.nextInt(); // This assigns their input to an integer which will be used to add in the integer called sum.
            if (ball == 000) { // Creates the if statement for the reset method.
                resetCalc(); // Stops the current method and goes to resetCalc() method.
            } // Closes the if statement
            int sum = balls + ball; // This adds the two numbers that the user put in.
            System.out.println("The answer to " + balls + " + " + ball + " is " + sum); // This tells the user what their problem and the solution is.
            isThatAll();
            }
        }



    public static void subtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "First number: ");
        int balls = scanner.nextInt();
        if (balls == 000) {
            resetCalc();
        } else {

            Scanner first = new Scanner(System.in);
            System.out.println("\n" + balls + " - \n");
            System.out.println("Second number: ");
            Scanner second = new Scanner(System.in);
            int ball = second.nextInt();
            int sum = balls - ball;
            System.out.println("The answer to " + balls + " - " + ball + " is " + sum);
            isThatAll();
        }


    }
    public static void multiply() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "First number: ");
        int balls = scanner.nextInt();
        if (balls == 000) {
            resetCalc();
        } else {

            Scanner first = new Scanner(System.in);
            System.out.println("\n" + balls + " * \n");
            System.out.println("Second number: ");
            Scanner second = new Scanner(System.in);
            int ball = second.nextInt();
            int sum = balls * ball;
            System.out.println("The answer to " + balls + " * " + ball + " is " + sum);
            isThatAll();
        }
    }
        public static void divide() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n" + "First number: ");
            int balls = scanner.nextInt();
            if (balls == 000) {
                resetCalc();
            } else {

                Scanner first = new Scanner(System.in);
                System.out.println("\n" + balls + " / \n");
                System.out.println("Second number: ");
                Scanner second = new Scanner(System.in);
                int ball = second.nextInt();
                int sum = balls * ball;
                System.out.println("The answer to " + balls + " / " + ball + " is " + sum);
                isThatAll();
            }
        }

    public static void sqrt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to find the square root of: ");
        double balls = scanner.nextDouble();
        if (balls == 000){
            resetCalc();
        }
        double ball = Math.sqrt(balls);
        System.out.println("\n" + "The square root of " + balls + " is " + ball);
        isThatAll();
    }

    public static void allowedActions(){
        System.out.println("\n" +
                "░█████╗░██╗░░░░░██╗░░░░░░█████╗░░██╗░░░░░░░██╗███████╗██████╗░░░░░░░░░░█████╗░░█████╗░████████╗██╗░█████╗░███╗░░██╗░██████╗\n" +
                "██╔══██╗██║░░░░░██║░░░░░██╔══██╗░██║░░██╗░░██║██╔════╝██╔══██╗░░░░░░░░██╔══██╗██╔══██╗╚══██╔══╝██║██╔══██╗████╗░██║██╔════╝\n" +
                "███████║██║░░░░░██║░░░░░██║░░██║░╚██╗████╗██╔╝█████╗░░██║░░██║░░░░░░░░███████║██║░░╚═╝░░░██║░░░██║██║░░██║██╔██╗██║╚█████╗░\n" +
                "██╔══██║██║░░░░░██║░░░░░██║░░██║░░████╔═████║░██╔══╝░░██║░░██║░░░░░░░░██╔══██║██║░░██╗░░░██║░░░██║██║░░██║██║╚████║░╚═══██╗\n" +
                "██║░░██║███████╗███████╗╚█████╔╝░░╚██╔╝░╚██╔╝░███████╗██████╔╝░░░░░░░░██║░░██║╚█████╔╝░░░██║░░░██║╚█████╔╝██║░╚███║██████╔╝\n" +
                "╚═╝░░╚═╝╚══════╝╚══════╝░╚════╝░░░░╚═╝░░░╚═╝░░╚══════╝╚═════╝░░░░░░░░░╚═╝░░╚═╝░╚════╝░░░░╚═╝░░░╚═╝░╚════╝░╚═╝░░╚══╝╚═════╝░");
        System.out.println( "\n Add \n Subtract \n Divide \n Multiply \n Sqrt (Square root) ");
        System.out.println("Type restart to restart the program.");
        Scanner scanner = new Scanner(System.in);
        String balls = scanner.nextLine();
        String ball = "restart";
        if (balls.equalsIgnoreCase(ball)) {
            resetCalc();
        } else {
            allowedActions();
        }


    }

    public static void isThatAll() {
        System.out.println("\n" + "Is that all you would like to do?");
        Scanner ballocks = new Scanner(System.in);
        String ballcock = ballocks.nextLine();
        String[] cockandballs = {"yes", "no", "maybe"};
        if (ballcock.equalsIgnoreCase(cockandballs[0])) {
            System.out.println("Thanks for using the program. <3");
        } else if (ballcock.equalsIgnoreCase(cockandballs[1])) {
            resetCalc();
        } else if (ballcock.equalsIgnoreCase(cockandballs[2])) {
            System.out.println("Make up your fucking mind");
            isThatAll();
        } else {
            System.out.println("Ok. Listen. I have no fucking idea how you can trigger this piece of code from a yes or no question, unless you made a type.");
            isThatAll();
        }
    }


// https://fsymbols.com/generators/tarty/
}