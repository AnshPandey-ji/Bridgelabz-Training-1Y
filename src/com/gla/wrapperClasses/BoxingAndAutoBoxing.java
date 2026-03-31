package com.gla.wrapperClasses;

import java.util.*;
public class BoxingAndAutoBoxing {
    public static void main(String[] args) {
        int x = 10;
        //1st Method
        Integer obj = new Integer(x);//boxing
        //2nd Method
        Integer obj2 = Integer.valueOf(x);//boxing

        Integer obj3 = x;//auto-boxing
        System.out.println(obj3);

        int m = obj.intValue();// Unboxing
        int n = obj;//Auto-unboxing
        System.out.println(m);

        Integer a = 200;
        Integer b = 200;
        //-128 to 127
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String str = "100";
        int c = 50;
        int ans = Integer.parseInt(str) * c;
        System.out.println(ans);
    }
}