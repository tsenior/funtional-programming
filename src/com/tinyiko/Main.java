package com.tinyiko;

public class Main {

    public static void main(String[] args) {
        GreetingMessage greet = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("hi "+ name);
            }
        };

        greet.greet("Ntikelo");
    }
}
