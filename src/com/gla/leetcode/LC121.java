package com.gla.leetcode;

class LC121 {
    public int maxProfit(int[] prices) {
        int smallNum=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++){
            if(smallNum>=prices[i]) {smallNum=prices[i];continue;}
            else profit=Math.max(profit,prices[i]-smallNum);
        }
        return profit;
    }
    public static void main(String[] args) {
    }
}