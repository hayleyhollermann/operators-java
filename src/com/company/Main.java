package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previous result = " + previousResult);
        result = result - 1;
        System.out.println("new result = " + result);
        System.out.println("previous result = " + previousResult);
        result = result * 10;
        System.out.println("new result = " + result);
        result = result /5;
        System.out.println("new result = " + result);

        // Remainder/Modulus
        result = result % 3;
        System.out.println("new result = " + result);


        result ++; // increment
        System.out.println(result);
        result --; //decrement
        System.out.println(result);

        result += 2; // result = result + 2
        System.out.println(result);

        result *= 10;
        System.out.println(result); // result = result * 10

        result /= 3;
        System.out.println(result); // result = result / 3

    }
}
