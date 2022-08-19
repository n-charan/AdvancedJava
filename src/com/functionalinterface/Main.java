package com.functionalinterface;

public class Main {

    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Nishant");

        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        gm2.greet("Charan");

        MessagePrinter mp = () -> {
            System.out.println("Message printer code");
        };
        mp.printMessage();
    }
}
