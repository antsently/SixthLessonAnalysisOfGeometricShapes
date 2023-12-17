package com.msaggik.sixthlessonanalysisofgeometricshapes.entity;

public class SquareFigure extends GeometricFigure{

    // реализация конструктора родительского класса GeometricFigure
    public SquareFigure(int color, int height, int width) {
        super(color, height, width);
    }

    // реализация абстрактных методов родительского класса GeometricFigure
    // метод определяющий площадь квадрата вписанного в фигуру прямоугольника
    @Override
    public int area() {
        int width = getWidth();
        int height = getHeight();
        if (width > height) {
            return height * height;
        } else {
            return width * width;
        }
    }
    // метод определяющий периметр квадрата вписанного в фигуру прямоугольника
    @Override
    public int perimeter() {
        int width = getWidth();
        int height = getHeight();
        if (width > height) {
            return height * 4;
        } else {
            return width * 4;
        }
    }
}
