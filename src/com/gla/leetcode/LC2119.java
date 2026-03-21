package com.gla.leetcode;

class LC2119 {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }
        if (num % 10 == 0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
    }
}