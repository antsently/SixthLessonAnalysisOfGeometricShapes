package com.msaggik.sixthlessonanalysisofgeometricshapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.msaggik.sixthlessonanalysisofgeometricshapes.entity.CircleFigure;
import com.msaggik.sixthlessonanalysisofgeometricshapes.entity.GeometricFigure;
import com.msaggik.sixthlessonanalysisofgeometricshapes.entity.SquareFigure;
import com.msaggik.sixthlessonanalysisofgeometricshapes.entity.TriangleFigure;

public class MainActivity extends AppCompatActivity {
    // поля
    private GeometricFigure circle, square, triangle; // геометрические фигуры
    private EditText height, width;
    private Button button;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка полей к разметке
        height = findViewById(R.id.heightInput);
        width = findViewById(R.id.widthInput);
        button = findViewById(R.id.button);
        output = findViewById(R.id.output);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создадим слушатель кнопки и с помощью анонимного класса переопределим метод onClick(View view)
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // исполняемый код при нажатии кнопки
            // считывание введённых данных
            int heightFigure = Integer.parseInt(height.getText().toString());
            int widthFigure = Integer.parseInt(width.getText().toString());

            // инициализация объектов класса GeometricFigure
            circle = new CircleFigure(0xFF0000, heightFigure, widthFigure); // 0xFF0000 - красный цвет
            square = new SquareFigure(0x00FF00, heightFigure, widthFigure); // 0x00FF00 - зелёный цвет
            triangle = new TriangleFigure(0x0000FF, heightFigure, widthFigure); // 0x0000FF - синий цвет

            // вывод данных на экран
            output.setText("В прямоугольник с указанными параметрами можно вписать:\n"
                    + "\nКруг с площадью " + circle.area() + " и периметром " + circle.perimeter()
                    + "\nКвадрат с площадью " + square.area() + " и периметром " + square.perimeter()
                    + "\nТреугольник с площадью " + triangle.area() + " и периметром " + triangle.perimeter());
        }
    };
}