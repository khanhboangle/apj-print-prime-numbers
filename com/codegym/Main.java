package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers to print: ");
        numbers = input.nextInt();

        int count = 0;
        int N = 2;
        System.out.println("The first " + numbers + " prime numbers are:");

        while (count < numbers) {
            int count2 = 0;
            for (int i = 2; i < N; i++) {
                if (N % i == 0)
                    count2++;
            }
            if (count2 == 0) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}