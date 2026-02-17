package com.gla.inheritance;

public interface Animal {
    int legs = 0;
    String color = "";
    String gender = "";

    public default void walk(){
       // System.out.println("Walks");
    }
}
