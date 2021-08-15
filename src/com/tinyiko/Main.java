package com.tinyiko;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(4);

        System.out.println("Area 1: "+square.calculateArea());


        Shapes shapes = (Square square2) -> {
            return square2.calculateArea();
        };

        System.out.println("Area :"+ shapes.getArea(square));
    }
}
