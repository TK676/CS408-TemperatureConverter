package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.example.temperatureconverter.databinding.ActivityMainBinding;
import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void onClick(View view) {
        EditText editFahrenheit = binding.editFahrenheit;
        EditText editCelsius = binding.editCelsius;

        String fahrenheit = editFahrenheit.getText().toString();
        String celsius = editCelsius.getText().toString();

        //Checks if the temp is either fahrenheit or celsius
        boolean hasFahrenheit = !fahrenheit.isEmpty();
        boolean hasCelsius = !celsius.isEmpty();

        //Converts temperature depending on what temp was entered
        if (hasFahrenheit) {
            try {
                editCelsius.setText(TemperatureConverter.fahrenheitToCelcius(Double.valueOf(fahrenheit)));
            }
            catch (NumberFormatException nfe) { }
        }
        else if (hasCelsius) {
            try {
                editFahrenheit.setText(TemperatureConverter.celciusToFahrenheit(Double.valueOf(celsius)));
            }
            catch (NumberFormatException nfe) { }
        }

    }
}