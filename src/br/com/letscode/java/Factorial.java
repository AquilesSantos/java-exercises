package br.com.letscode.java;

import java.util.Scanner;

public class Factorial {

    public static int factorialCalculator(int num) {
        int f = num;
        for(int i = num; i > 1; i--) {
            f = f * (i - 1);
            num = f;
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