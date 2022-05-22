package com.exemplo.java17;

public final class Circle extends GeometricFigure{
    private double raio;

    public Circle(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public int calculateArea() {
        return 0;
    }
}
