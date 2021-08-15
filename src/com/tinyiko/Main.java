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

        GreetingMessage greeLambdas = (name -> {
            System.out.println("hello " + name);
        });

        greeLambdas.greet("Tinyiko");

        MessagePrinter message = (() -> {
            System.out.println("Message from message printer");
        });

        MessagePrinter message2 = () -> {
            System.out.println("seconf Message from message printer");
        };

        message.printMessage();
        message2.printMessage();
    }
}
