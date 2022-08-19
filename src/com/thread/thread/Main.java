package com.thread.thread;

public class Main {

    public static void main(String[] args) {
        ThreadExample te1 = new ThreadExample();
        te1.setName("My First Thread");
        te1.start();

        ThreadExample te2 = new ThreadExample();
        te2.setName("My Second Thread");
        te2.start();
    }
}
