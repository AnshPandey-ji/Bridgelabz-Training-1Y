package com.gla.multipleThreading;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("MyThread1: "+ i);
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
