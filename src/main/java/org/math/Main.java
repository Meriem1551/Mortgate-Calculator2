package org.math;

import java.util.Scanner;
import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInterestRate = 0;
        int Principal = 0;
        byte period = 0;
        long num_of_payment = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal (1k - 1M): ");
             Principal = scanner.nextInt();
            if (Principal >= 1000 && Principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1K and 1M");
        }
        while (true) {
            System.out.print("Annual Interest Rate (1 - 30): ");
            float annualInterestRate = scanner.nextFloat();
            if (annualInterestRate >= 1 && annualInterestRate <= 30){
                monthlyInterestRate = annualInterestRate / PERCENT /MONTHS_IN_YEAR;
                break;
            }
                System.out.println("Enter a valid value between 1 and 30");

        }
        while (true) {
            System.out.print("Period (Years 1 - 30): ");
            period = scanner.nextByte();
            if (period >= 1 && period <= 30) {
                num_of_payment = period * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Entera valid value between 1 and 30");
        }
        double result = Principal
                * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), num_of_payment)
                /(Math.pow((1 + monthlyInterestRate), num_of_payment) - 1));
        String Montgage = NumberFormat.getCurrencyInstance().format(result);
        System.out.print("Montgage: " + Montgage);

    }
}