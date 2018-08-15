package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {
//        String numberAsString = "2018.125";
//        System.out.println("numberAsString = " + numberAsString);
//
//        double number = Double.parseDouble(numberAsString);
//        System.out.println("number = " + number);
//
//        numberAsString += 1;
//        number += 1;
//
//        System.out.println("numberAsString = " + numberAsString);
//        System.out.println("number = " + number);
//
//        System.out.println(getLargestPrime(21));

        printSquareStar(5);
    }


    public static boolean canPack(int bigCount, int smallCount, int goal) {
            int sum = (bigCount * 5) + smallCount;
            if (bigCount < 0 || smallCount < 0 || goal < 0 || sum < goal) {
                return false;
            }

            int bigPacks = goal / 5;

            if ((bigPacks * 5) + smallCount >= goal) {
                return true;
            }

            return false;
    }

    public static int getLargestPrime(int number) {
//        int a=0;
//
//        int b=0;
//        int c=0;
//        int d=0;
//
//        if(number==0||number==1||number<0) {
//            return -1;
//        }
//        for(int i=2;i<=number;i++) {
//            if(number%i==0) {
//                a=i;
//                for(int j=2;j<a;j++) {
//                    if(a%j==0) {
//                        b=j;
//                    }
//                }
//                if(b==0) {
//                    c=a;
//                }
//                else
//                    d=-1;
//            }
//        }
//        return c;

        if(number <2)
        {
            return -1;
        }

        int count=2;
        while(count<number)
        {
            if(number%count==0)
            {
                number /=count;

                continue;
            }
            System.out.println("Count == " +count);
            count++;
            System.out.println("Count = " + count + " Number = " + number);
        }



        return count;

    }

    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }
        else{
            for(int i=1;i<=number;i++){
                for(int j=1;j<=number;j++){
                    if(i==1||j==1||i==number||j==number){
                        System.out.print("*");
                    }
                    else if(i==j){
                        System.out.print("*");
                    }
                    else if(i==((number-j)+1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
