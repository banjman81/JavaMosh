package com.banjman;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        byte MONTH_IN_YEAR = 12;
        byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to tour Mortgage Calculator");
        System.out.print("Principle : ");
        int principle = scanner.nextInt();
        System.out.print("Interest APR : ");
        double monthlyInterest = scanner.nextDouble()/PERCENT / MONTH_IN_YEAR;
        System.out.print("Lifetime (Years) : ");
        int lifeTime = scanner.nextInt() *MONTH_IN_YEAR;

        double result = principle *
                (monthlyInterest * (Math.pow((1+monthlyInterest), lifeTime)) /
                 ( Math.pow(1 +monthlyInterest, lifeTime) - 1) );

        String mortgage = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage : " + mortgage);
    }
}
