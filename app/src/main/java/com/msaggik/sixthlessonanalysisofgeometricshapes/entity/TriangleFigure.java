package com.msaggik.sixthlessonanalysisofgeometricshapes.entity;

public class TriangleFigure extends GeometricFigure{

    // реализация конструктора родительского класса GeometricFigure
    public TriangleFigure(int color, int height, int width) {
        super(color, height, width);
    }

    // реализация абстрактных методов родительского класса GeometricFigure
    // метод определяющий площадь треугольника вписанного в фигуру прямоугольника
    @Override
    public int area() {
        int width = getWidth();
        int height = getHeight();
        return width * height / 2;
    }
    // метод определяющий периметр треугольника вписанного в фигуру прямоугольника
    @Override
    public int perimeter() {
        int width = getWidth();
        int height = getHeight();
        return (int) (Math.sqrt(width * width + height * height) + width + height);
    }
}