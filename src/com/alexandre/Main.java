package com.alexandre;

public class Main {

    public static void main(String[] args) {

//        System.out.println(sumDigits(999999));
//        System.out.println(sumDigits(3498759));
//        System.out.println(sumDigits(-34));
//        System.out.println(sumDigits(234));


        System.out.println(isPalindrome(-222));
        System.out.println(" 0:  " + sumFirstAndLastDigit(0));
        System.out.println(" 10:  " + sumFirstAndLastDigit(10));


    }
    private static int sumDigits (int number) {
        if (number < 10)
            return -1;

        int sum = 0;


        while (number > 0) {
            int digit = number % 10;    // extracting least significant digit
            sum += digit;               // adding the digit to the sum
            number = number / 10;       // removing least significant digit
        }

        return sum;

    }

    public static boolean isPalindrome (int number) {

        System.out.println(number);
        int reverse = 0;
        int originalNumber = number;
        while(number != 0) {

            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number / 10;
        }

        System.out.println(reverse);
        return originalNumber == reverse;

    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0)
            return -1;
        int last = number % 10;

        while(number >= 10) {
            number = number / 10;
        }
        return number + last;
    }
}
