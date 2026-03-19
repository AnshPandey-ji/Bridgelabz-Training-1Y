package com.gla.multipleThreading;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread: " + i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

        public static void main(String[] args) {
            MyThread myThread = new MyThread();
            Thread t = new Thread(myThread);

            t.start();

            MyThread1 myThread1 = new MyThread1();
            myThread1.start();
        }

    }

