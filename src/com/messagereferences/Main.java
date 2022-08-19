package com.messagereferences;

public class Main {

    public static void main(String[] args) {
        Square s = new Square(4);

        Shape shape = (Square square) -> {
            return square.calculateArea();
        };

        System.out.println("Area: " + shape.getArea(s));

        Shape shape1 = Square::calculateArea;
        System.out.println("Area: " + shape1.getArea(s));
    }

}
