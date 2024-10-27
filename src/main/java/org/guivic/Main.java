package org.guivic;

public class Main {
    public static void main(String[] args) {

        Runnable task1 = new MyTask();
        Runnable task2 = new MyTask();
        Runnable task3 = new MyTask();
        Runnable task4 = new MyTask();
        Runnable task5 = new MyTask();
        Runnable task6 = new MyTask();
        Runnable task7 = new MyTask();
        Runnable task8 = new MyTask();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);
        Thread t4 = new Thread(task4);
        Thread t5 = new Thread(task5);
        Thread t6 = new Thread(task6);
        Thread t7 = new Thread(task7);
        Thread t8 = new Thread(task8);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("---");
    }
}