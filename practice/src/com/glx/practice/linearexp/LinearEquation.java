package com.glx.practice.linearexp;

import java.util.Scanner;

public class LinearEquation {
 
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter linear equation in variable a: ");
        String input = scanner.nextLine();
        Scanner equationScanner = new Scanner(input);
        int constantTerm = 0;
        int coefficientOfA = 0;
        boolean equalSignEncountered = false;
        boolean positiveTerm = true;
        while (equationScanner.hasNext()) {
            String token = equationScanner.next();
            if (token.equals("=")) {
                equalSignEncountered = true;
                positiveTerm = true;
            } else if (token.equals("+")) {
                positiveTerm = true;
            } else if (token.equals("-")) {
                positiveTerm = false;
            } else if (token.endsWith("a")) {
                String coefficientString = token.substring(0, token.length() - 1);
                int coefficient = Integer.parseInt(coefficientString);
                if (equalSignEncountered) {
                    positiveTerm = !positiveTerm;
                }
                if (positiveTerm) {
                    coefficientOfA = coefficientOfA + coefficient;
                } else {
                    coefficientOfA = coefficientOfA - coefficient;
                }
            } else {
                int coefficient = Integer.parseInt(token);
                if (equalSignEncountered) {
                    positiveTerm = !positiveTerm;
                }
                if (positiveTerm) {
                    constantTerm = constantTerm + coefficient;
                } else {
                    constantTerm = constantTerm - coefficient;
                }
            }
        }
        double result = -1.0 * constantTerm / coefficientOfA;
        System.out.println("a = " + result);
    }
}