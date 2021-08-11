package com.wei.thread;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello 1");
        /*
        FirstThread thread = new FirstThread();
        thread.start();
        new FirstThread().start();
        new FirstThread().start();
        new FirstThread().start();
         */
        // Runnable
//        Thread thread = new Thread(new FirstRunnable());
//        thread.start();
        new Thread(new FirstRunnable("No1")).start();
        new Thread(new FirstRunnable("No2")).start();
        new Thread(new FirstRunnable("No3")).start();
        System.out.println("Hello 2");
        // Dead lock

    }
}
