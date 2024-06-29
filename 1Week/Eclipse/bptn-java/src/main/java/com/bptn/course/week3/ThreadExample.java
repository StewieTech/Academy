package com.bptn.course.week3;

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Running: " + this.getName() + " - " + this.getState());

        for (int i = 0; i < 10; i++) {
            System.out.println("Running: " + this.getName() + " - " + this.getState());

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Running: " + this.getName() + " - " + this.getState());
    }
}

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());

        MyThread t1 = new MyThread("T1");
        System.out.println("Running: " + t1.getName() + " - " + t1.getState());

        t1.start();

        MyThread t2 = new MyThread("T2");
        System.out.println("Running: " + t2.getName() + " - " + t2.getState());

        t2.start();

        t1.join();
        t2.join();

        System.out.println("Running: " + t1.getName() + " - " + t1.getState());
        System.out.println("Running: " + t2.getName() + " - " + t2.getState());
    }
}
