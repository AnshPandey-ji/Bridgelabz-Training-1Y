package com.gla.methods;

public class Bike {
    //public static void main (String[] args){
    String name;
    String company;
    long price;
    String model;

    public Bike(String name,String company,String model,long price){
        this.name=name;
        this.company=   company;
        this.price=price;
        this.model=model;
    }
    void printCompany(){
        System.out.println(company);
    }
    public static void main(String[] args){
        Bike b1= new Bike("Shine","Honda","2015",800000000);
        b1.printCompany();
    }
}