package ru.gb.java2.lesson5.thread;

public class TestCreateThread {

    private volatile Object mockObject;

    static class MyRunnableClass implements Runnable {

        private final int delayInMilli;
        private boolean isFinished;

        public MyRunnableClass(int delayInMilli) {
            this.delayInMilli = delayInMilli;
        }

        public void setFinished(boolean finished) {
            isFinished = finished;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
//                if (isFinished) {
//                    System.out.println(Thread.currentThread().getName() + " has been terminated");
//                    break;
//                }
                try {
//                    System.out.println(Thread.currentThread().getName() + ": " + i);

                    System.out.println(Thread.currentThread().getName() + ": " + i
                            + " with priority: " + Thread.currentThread().getPriority());

                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread has been interrupted");
                        break;
                    }
                    Thread.sleep(delayInMilli);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted from exception");
//                    e.printStackTrace();
                    break;
                }
            }
            System.out.println("finish thread 1");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(4);
        System.out.println("Main priority: " + Thread.currentThread().getPriority());

        MyRunnableClass target = new MyRunnableClass(100);
        Thread thread1 = new Thread(target, "Поток 1");
//        thread1.start();

//        Thread.sleep(100);
        Thread thread2 = new Thread(() -> testThread2(), "Поток 2");
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();

        Thread.sleep(200);
//        target.setFinished(true);
        thread1.interrupt();

        thread1.join();
        thread2.join();

//        Thread.sleep(5000);
//        thread1.start();
//

//        Thread.sleep(10);
//        thread1.interrupt();

//        while (thread1.isAlive()) {
//            Thread.sleep(10);
//        }
//        thread1.join();

//        System.out.println("finish");

//        thread2.start();
//        while (thread2.isAlive()) {
//            Thread.sleep(10);
//        }
//        thread2.join();
//        thread2.start();
        System.out.println("the end");
    }

    private static void testThread2() {
        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + ": " + i);
                System.out.println(Thread.currentThread().getName() + ": " + i
                        + " with priority: " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
