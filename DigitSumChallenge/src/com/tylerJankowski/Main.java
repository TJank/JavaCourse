package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {
//        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
//        System.out.println("The sum of the digits in number 11 is " + sumDigits(11));
//        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
//        System.out.println("The sum of the digits in number 32123 is " +
//                sumDigits(32123));
//
//        System.out.println(isPalindrome(11));
//        System.out.println(isPalindrome(-1221));
//        System.out.println(isPalindrome(707));
//
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(sumFirstAndLastDigit(10));
//        System.out.println(sumFirstAndLastDigit(125));

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(2000));

        System.out.println(numberToWords(456));



    }

    private static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            // extract the lest-significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /= 10; // number = number / 10
        }

        return sum;
    }


    public static boolean isPalindrome(int number) {
        int reverse = 0;
        number = java.lang.Math.abs(number);
        int normal = number;

        int lastDigit = 0;
        while (number > 0) {
            reverse *= 10;
            lastDigit = number % 10;
            reverse += lastDigit;
            // System.out.println("Reverse Number = " + reverse +
                    // " LastDigit = " + lastDigit);
            number /= 10;
        }

        if (normal == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumFirstAndLastDigit(int number) {

        if(number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
        }
        System.out.println("First Digit = " + number + " Last Digit = " + lastDigit);
        return number + lastDigit;

    }

    public static int getEvenDigitSum(int number) {

        int sum = 0;
        int digit = 0;

        if(number < 0) {
            return -1;
        }

        while (number > 0) {
            digit = number % 10;

            number /= 10;

            //System.out.println("Digit = " + digit + " Number = " + number);

            if(digit % 2 == 0) {
                sum += digit;
                //System.out.println("Sum = " + sum);
            }
        }

        return sum;
    }

    public static boolean hasSharedDigit(int number1, int number2) {

        if (number1 > 99 || number1 < 10 || number2 > 99 || number2 < 10) {
            return false;
        }

        int firstDigit = number1 / 10;
        int firstDigit2 = number2 / 10;
        int lastDigit = number1 % 10;
        int lastDigit2 = number2 % 10;

        return firstDigit == firstDigit2 || firstDigit == lastDigit2 || lastDigit == firstDigit2 || lastDigit == lastDigit2;

    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        while (first != second){
            if (first > second){
                first = first - second;
            }else {
                second = second - first;
            }
        }
        return first;
    }

    public static void printFactors(int number) {
        String output = "";
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    output += Integer.toString(i) + " ";
                }
            }
            System.out.println(output);
        }
    }

    public static boolean isPerfectNumber(int number){
        int perfect = 0;
        if (number<1) return false;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0)perfect += i;
        }
        if (perfect == number) return true;
        return false;
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }else{
            int dig = 0;
            int count = 0;
            String numberW = "";
            int numberR = reverse(number);
            while (numberR != 0){
                if (count > 0) numberW += " ";
                dig = numberR % 10;
                switch(dig){
                    case (0):
                        numberW += "Zero";
                        break;
                    case (1):
                        numberW += "One";
                        break;
                    case (2):
                        numberW += "Two";
                        break;
                    case (3):
                        numberW += "Three";
                        break;
                    case (4):
                        numberW += "Four";
                        break;
                    case (5):
                        numberW += "Five";
                        break;
                    case (6):
                        numberW += "Six";
                        break;
                    case (7):
                        numberW += "Seven";
                        break;
                    case (8):
                        numberW += "Eight";
                        break;
                    case (9):
                        numberW += "Nine";
                        break;
                    default:
                        numberW +="";
                        break;
                }
                numberR /= 10;
                count ++;
            }

            if (getDigitCount(number)>count){
                for (int i=0; i<(getDigitCount(number)-count); i++){
                    numberW += " Zero";
                }
                System.out.println(numberW);
            }else{
                System.out.println(numberW);
            }
        }

    }

    public static int reverse(int d){
        int r = d % 10;
        d = d/10;
        while(d!=0){
            r = r * 10 + d % 10;
            d = d/10;
        }
        return r;
    }

    public static int getDigitCount (int x){
        int count=0;
        if (x<0)return -1;
        if (x==0)return 1;
        while(x>0){
            x=x/10;
            count ++;
        }
        return count;
    }
}
