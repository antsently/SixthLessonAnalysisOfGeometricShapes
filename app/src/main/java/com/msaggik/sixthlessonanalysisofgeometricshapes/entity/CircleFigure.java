package com.msaggik.sixthlessonanalysisofgeometricshapes.entity;

public class CircleFigure extends GeometricFigure{

    // реализация конструктора родительского класса GeometricFigure
    public CircleFigure(int color, int height, int width) {
        super(color, height, width);
    }

    // реализация абстрактных методов родительского класса GeometricFigure
    // метод определяющий площадь круга вписанного в фигуру прямоугольника
    @Override
    public int area() {
        int width = getWidth();
        int height = getHeight();
        if (width > height) {
            return (int) (Math.PI * (height / 2) * (height / 2));
        } else {
            return (int) (Math.PI * (width / 2) * (width / 2));
        }
    }
    // метод определяющий периметр круга вписанного в фигуру прямоугольника
    @Override
    public int perimeter() {
        int width = getWidth();
        int height = getHeight();
        if (width < height) {
            return (int) (2 * Math.PI * (width / 2));
        } else {
            return (int) (2 * Math.PI * (height / 2));
        }
    }
}
