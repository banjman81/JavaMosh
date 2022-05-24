package com.banjman;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        byte age = 30;
//        int viewCount = 3_123_454_789; too long for int
        long viewCount = 3_123_454_789L;
        float price = 10.99F; // add suffix to denote that it is float and not double
        char letter = 'a';
        boolean isEligible = false;
//      escape sequences
        String message = "\"Hello Ben \""; // use backslash to add special char
        String message2 = "c:\\windows\\..."; // double backslash is required to add \ to string
        String message3 = "c:\nwindows\n..."; // new line
        String message4 = "c:\twindows\\..."; // tab
//        System.out.println(message4);

//      ARRAYS
//        int[] numbers = new int[5]; //needs to initialize with the size
//        numbers[0] = 1;
//        numbers[1] = 2;
////        numbers[10] = 3; exception error
//        Arrays.toString(numbers); // return string representation of array
//        System.out.println(numbers); // prints memory space

//        int[] numbers = {2,3,5,1,4};
//        Arrays.sort(numbers); // sort array
//      Multi-dimensional array
        int[][][] numbers = new int[2][3][5];// this array will have 2 rows and 3 columns of length 5 arrays
        int[][] numbers2 = { {1,2,3} , {4,5,6}}; //initialize with given value 2 rows 3 columns
        numbers[0][0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers));

//      CONSTANT
        final float PI = 3.14F;
//        pi = 5; cannot change constant


//        ARITHMETIC EXPRESSIONS
        double result = (double) 10/ (double)3; //division of whole number will return whole number without casting to double //explicit casting
        // Implicit casting
        // byte . short . int . long . float . double can cast as long as there is no data loss

        String x = "1";
        int y = Integer.parseInt(x) + 2;
        // MATH CLASS
        int rounded = Math.round(1.1F);
        int ceil = (int) Math.ceil(1.1);
        int floor = (int) Math.floor(1.1);
        int max = Math.max(1,2);
        double random = Math.random() * 100;

        // FORMATTING NUMBER
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        String resultCurrency = currency.format(123456.123);
        String resultPercent = percent.format(0.1);
//        System.out.println(resultPercent);
        NumberFormat.getPercentInstance().format(0.1); //this is method chaining.

        // READ INPUTS
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age : ");
//        byte age = scanner.nextByte();
//        if(age > 17){
//            System.out.println("Welcome Adult!! Age: " + age);
//        }else {
//            System.out.println("You are underage. Age: " + age);
//        }
//        System.out.print("Name : ");
//        String name = scanner.nextLine().trim(); // chain method to trim white spaces from beginning and end
//        System.out.println("Welcome " + name);

        //SWITCH STATEMENT
//        System.out.print("Enter your role :");
////        String role = scanner.nextLine();
//        String role = "admin";
//        switch (role) {
//            case "admin":
//                System.out.println("Welcome admin!");
//                break;
//            case "moderator":
//                System.out.println("Welcome moderator!");
//            default:
//                System.out.println("You are " + role);
//        }
        //FIZZBUZZ
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
        int number = 1;
        String fizzBuzz =
                number % 5 == 0 && number % 3 == 0 ? "FizzBuzz" :
                number % 5 == 0 ? "Fizz" :
                number % 3 == 0 ? "Buzz" : Integer.toString(number);
//        System.out.println(fizzBuzz);

        // DO WHILE gets executed at least once
        String input = "";
//        do {
//            System.out.print("Input : ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));

        // BREAK stop the loop from running and CONTINUE moves control to the beginning of the loop

        // FOE EACH LOOP
        String[] fruits = {"apple", "mango", "orange"};
        for (String fruit : fruits){ // only moves forward and no access to index of each item
            System.out.println(fruit);
        }

    }
}
