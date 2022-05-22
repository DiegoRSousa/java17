package com.exemplo.java17;

public sealed abstract class GeometricFigure permits Circle, Square, Rectangle {
    protected String color;
    public abstract int calculateArea();

    public String getColor() {
        return color;
    }
}
