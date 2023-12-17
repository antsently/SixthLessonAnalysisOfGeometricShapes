package com.msaggik.sixthlessonanalysisofgeometricshapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText height;
    private Button button;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.heightInput);
        button = findViewById(R.id.button);
        output = findViewById(R.id.output);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double distance = Double.parseDouble(height.getText().toString()); // Расстояние введенное пользователем

                Airplane1 airplane1 = new Airplane1(210, 850, 3.7);
                double fuelAirplane1 = airplane1.calculateFuelConsumption(distance);
                double timeAirplane1 = airplane1.calculateTime(distance);

                Airplane2 airplane2 = new Airplane2(189, 900, 2.8);
                double fuelAirplane2 = airplane2.calculateFuelConsumption(distance);
                double timeAirplane2 = airplane2.calculateTime(distance);

                Helicopter helicopter = new Helicopter(8, 250, 0.14);
                double fuelHelicopter = helicopter.calculateFuelConsumption(distance);
                double timeHelicopter = helicopter.calculateTime(distance);

                // Форматирование значений с помощью DecimalFormat
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                String formattedFuel1 = decimalFormat.format(fuelAirplane1);
                String formattedTime1 = decimalFormat.format(timeAirplane1);
                String formattedFuel2 = decimalFormat.format(fuelAirplane2);
                String formattedTime2 = decimalFormat.format(timeAirplane2);
                String formattedFuelH = decimalFormat.format(fuelHelicopter);
                String formattedTimeH = decimalFormat.format(timeHelicopter);

//                Log.d("Airplane1", "Топливо: " + fuelAirplane1 + " т, Время: " + timeAirplane1 + " часов");
//                Для себя ленивого делал!

                output.setText("Самолет 1:\nТопливо: " + formattedFuel1 + " т\nВремя: " + formattedTime1 + " часов\n\n" + "Самолет 2:\nТопливо: " + formattedFuel2 + " т\nВремя: " + formattedTime2 + " часов\n\n" + "Вертолет:\nТопливо: " + formattedFuelH + " т\nВремя: " + formattedTimeH + " часов");
            }
        });
    }
}
