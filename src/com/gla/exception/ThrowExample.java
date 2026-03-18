package com.gla.exception;

public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;

        if(age > 18) {
            throw new ArithmeticException("You are eligible to vote");
        }else {

            System.out.println("You are not eligible to vote");
        }
    }
}