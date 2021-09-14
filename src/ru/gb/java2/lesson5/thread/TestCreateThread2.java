package ru.gb.java2.lesson5.thread;

public class TestCreateThread2 {

    static class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
//            setName(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                    System.out.printf("%s: %d%n", Thread.currentThread().getName(), i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new MyThread("thread-1").start();
        new MyThread("thread-2").start();
//        new MyThread("thread-1").run();
//        new MyThread("thread-2").run();
    }


}
