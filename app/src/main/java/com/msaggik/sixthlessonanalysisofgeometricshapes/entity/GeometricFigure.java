package com.msaggik.sixthlessonanalysisofgeometricshapes.entity;

public abstract class GeometricFigure {
    // поля геометрической фигуры
    private int color; // цвет
    private int height; // высота
    private int width; // ширина

    // конструктор
    public GeometricFigure(int color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    // геттеры и сеттеры
    public int getColor() {
        return color;
    }
    public void setColor(int color) {
        this.color = color;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    // метод определяющий площадь описываемого вокруг фигуры круга
    public int circumscribedCircle(int width, int height) {
        if (width < height) {
            return (int) (Math.PI * (height / 2) * (height / 2));
        } else {
            return (int) (Math.PI * (width / 2) * (width / 2));
        }
    }

    // абстрактные методы вычисления площади и периметра геометрических фигур
    public abstract int area();
    public abstract int perimeter();
}
