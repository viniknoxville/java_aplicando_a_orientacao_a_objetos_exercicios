package br.com.projeto.aplication;
import br.com.projeto.model.ConversorTemperaturaPadrao;

public class Main {
    public static void main(String[] args) {

        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        double temperaturaCelsius = 32;
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + "ºC é igual a " + temperaturaFahrenheit + "ºF");

        temperaturaFahrenheit = 89.6;
        temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + "ºF é igual a " + temperaturaCelsius + "ºC");

    }
}
