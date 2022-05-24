package com.banjman;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        byte MONTH_IN_YEAR = 12;
        byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to tour Mortgage Calculator");

        System.out.print("Principle ($1K - $1M): ");
        int principle = scanner.nextInt();
        while (principle < 1000 || principle > 1000000){
            System.out.print("Principle ($1K - $1M): ");
            principle = scanner.nextInt();
        }

        System.out.print("Interest APR : ");
        double monthlyInterest = scanner.nextDouble();
        while (monthlyInterest <= 0 || monthlyInterest > 30){
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
            System.out.print("Interest APR : ");
            monthlyInterest = scanner.nextDouble();
        }
        monthlyInterest = monthlyInterest/PERCENT / MONTH_IN_YEAR;

        System.out.println("Enter a value between 1 and 30");
        System.out.print("Lifetime (Years) : ");
        int lifeTime = scanner.nextInt();
        while (lifeTime < 1 || lifeTime > 30){
            System.out.println("Enter a value between 1 and 30");
            System.out.print("Lifetime (Years) : ");
            lifeTime = scanner.nextInt();
        }

        lifeTime *= MONTH_IN_YEAR;

        double result = principle *
                (monthlyInterest * (Math.pow((1+monthlyInterest), lifeTime)) /
                 ( Math.pow(1 +monthlyInterest, lifeTime) - 1) );

        String mortgage = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage : " + mortgage);
    }
}
