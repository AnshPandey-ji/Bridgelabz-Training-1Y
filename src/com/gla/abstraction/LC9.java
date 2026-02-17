package com.gla.abstraction;

class LC9 {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        long rev = 0;
        long number = x;

        while (number != 0) {

            rev = (rev * 10) + (number % 10);
            number /= 10;
        }


        return (int) rev == x;
    }
    public static  void  main(String[] args){
    }
}