package com.example.temperatureconverter;

public class TemperatureConverter {

    //Converts fahrenheit to celsius
    public static String fahrenheitToCelcius(double f) {
        return String.valueOf(((f - 32) * 5) / 9);
    }

    //Converts celsius to fahrenheit
    public static String celciusToFahrenheit(double c) {
        return String.valueOf((c * (9/5.0)) + 32);
    }
}
