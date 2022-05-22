package com.exemplo.java17;

public class Main {
    public static void main(String[] args) {
        textBlocks();
        patternMatching(1);
        records();
        System.out.println(calculateArea(new Circle(10)));
    }

    public static void textBlocks() {
        System.out.println(""" 
                update products set quantity = ?
                where id = ?
                """);
    }

    public static void patternMatching(Object num) {
        if(num instanceof Integer n && n > 0)
            System.out.println(n);
    }

    public static void records() {
        var product = new Product(1L, "Coke", "soft drink");
        System.out.println(product);
        System.out.println(product.description());

        record TempRecord(String name){}
        var tempRecord = new TempRecord("temporary record");
        System.out.println(tempRecord);
    }

    public static double calculateArea(GeometricFigure figure) {
//        if(figure instanceof Circle circle)
//            return circle.getRaio() * circle.getRaio() * Math.PI;
//        if(figure instanceof Square square)
//            return square.getSide() * square.getSide();
//        if(figure instanceof Rectangle rectangle)
//            return rectangle.getHeight() * rectangle.getSide();
//        return 0;

        return switch (figure) {
            case Circle circle -> circle.getRaio() * circle.getRaio() * Math.PI;
            case Square square -> square.getSide() * square.getSide();
            case Rectangle rectangle -> rectangle.getHeight() * rectangle.getSide();
            default -> 0;
        };

    }

}
