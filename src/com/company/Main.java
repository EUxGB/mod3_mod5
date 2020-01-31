package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            int i = input.nextInt();




            fizzBuzzPrint(i);
            // write your code here
        }

    }
    public static void   fizzBuzzPrint(int i){
        if ( i%5==0 && i%3==0 ) System.out.println("FizzBuzz");
        if ( i%5==0 ) System.out.println("Buzz");
        if (i%3==0) System.out.println("Fizz");
        System.out.println(i);
    }
}

