package br.com.letscode.java;

import java.util.Scanner;

public class Factorial_2 {

    public static int factorialCalculator(int num) {
        int x = num;
        while (x > 1) {
            num = num * (x - 1);
            x--;
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