package com.trgt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amount = 0;
        while (amount < 1_000 || amount > 1_000_000) {
            System.out.println("Amount (€1K - €1M): ");
            amount = scan.nextInt();
            if (amount < 1_000 || amount > 1_000_00)
                System.out.println("Please provide an amount between €1K-€1M");
        }

        byte years = 0;
        while (years < 1 || years > 30) {
            System.out.println("Duration (in years): ");
            years = scan.nextByte();
            if (years < 1 || years > 30)
                System.out.println("The duration has to be between 1 and 30 years");
        }

        double interestRate = -1;
        double monthlyInterest = 0;
        while (interestRate < 0 || interestRate > 30) {
            System.out.println("Interest rate: ");
            interestRate = scan.nextDouble();
            if (interestRate < 0 || interestRate > 30)
                System.out.println("The interest rate has to be between 0 and 30");
            monthlyInterest = ((interestRate / 12) / 100);
        }

        int numberOfPayments = years * 12;
        double monthlyPayment = amount
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) -1);

        System.out.println("Monthly amount: " + Math.round(monthlyPayment*100.0) / 100.0);
    }
}
