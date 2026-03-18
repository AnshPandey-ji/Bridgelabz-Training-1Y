package com.gla.exception;

class ThrowsExample {

    static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        System.out.println("Result = " + result);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}