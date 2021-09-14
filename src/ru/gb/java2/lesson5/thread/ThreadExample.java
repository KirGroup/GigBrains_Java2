package ru.gb.java2.lesson5.thread;

public class ThreadExample {

    private volatile static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
//        printCount();
//        printCount();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadExample.printCount();
            }
        }, "T1");
        Thread thread2 = new Thread(ThreadExample::printCount, "T2");
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final value is " + count);
    }

    private /*synchronized*/ static void printCount() {
        for (int i = 0; i < 100; i++) {
//            count++;
            synchronized (ThreadExample.class) {
//            count++;
//                count = count + 1;
            System.out.println(Thread.currentThread().getName() + ": " + count++);
            }

//            System.out.println(Thread.currentThread().getName() + ": " + count++);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
