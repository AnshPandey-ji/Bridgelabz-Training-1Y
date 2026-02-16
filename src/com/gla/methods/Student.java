package com.gla.methods;

import java.util.*;
public class Student {
    int roll_no;
    String name;
    String course;
    Double cpi;
    static String collage = "GLA University";

    public Student(int roll_no, String name, String course, Double cpi) {
        this.roll_no = roll_no;
        this.name = name;
        this.course = course;
        this.cpi = cpi;
    }

    static double printcpi(Double cpi) {
        return cpi;
    }

    public static void main() {
        Student s1 = new Student( 24, "Rahul",  "B.Tech", 4.6);
        //s1.roll_no = 1;
        //s1.name = "Rahul";
        //s1.course = "B.Tech";
        //s1.cpi = 7.7;

        System.out.println(s1.name);
        System.out.println(Student.collage);

        double cpi = Student.printcpi(s1.cpi);
        System.out.println(cpi);
    }
}
