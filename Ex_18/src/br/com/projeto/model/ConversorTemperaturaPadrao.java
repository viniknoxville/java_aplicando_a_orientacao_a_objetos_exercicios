package br.com.projeto.model;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public double celsiusParaFahrenheit(double tempCelsius) {
        return (tempCelsius * 9.0 / 5.0) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double tempFahrenheit) {
        return (tempFahrenheit - 32) * (5.0 / 9.0);
    }
}
