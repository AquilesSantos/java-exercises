package br.com.letscode.java;

import java.util.Scanner;

public class Factorial_3 {

    public static int factorialCalculator(int num) {
        if (num != 1) {
            return num * factorialCalculator(num - 1);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("[ - Factorial Calculator - ]\n\tEnter a number: ");

        int num = input.nextInt();

        System.out.print("\tFactorial of " + num + " → " + factorialCalculator(num));
    }
}