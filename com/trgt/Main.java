package com.trgt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Amount: ");
        int amount = scan.nextInt();

        System.out.println("Duration (in years): ");
        byte years = scan.nextByte();

        System.out.println("Interest rate: ");
        double interestRate = scan.nextFloat();

        double monthlyInterest = ((interestRate / 12) / 100);
        int numberOfPayments = years * 12;
        double monthlyPayment = amount
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) -1);

        System.out.println("Monthly amount: " + Math.round(monthlyPayment*100.0) / 100.0);
    }
}
