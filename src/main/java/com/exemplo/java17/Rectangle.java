package com.exemplo.java17;

public non-sealed class Rectangle extends GeometricFigure{
    private double side;
    private double height;

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public int calculateArea() {
        return 0;
    }
}
