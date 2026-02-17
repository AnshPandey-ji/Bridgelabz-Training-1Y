package com.gla.inheritance;

public class Dog implements Animal {

    public void barks() {
        System.out.println("Barking...");
    }



    public static void main(String[] args) {
        Dog dog = new Dog();
       // dog.color = "white";
       // dog.gender = "male";
        dog.barks();
    }

  //  @Override
    public void walk() {
        System.out.println("Dog Walking...");
    }
}


