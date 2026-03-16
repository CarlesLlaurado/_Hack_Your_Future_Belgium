package encapsulation.exercises;

/**
 TODO:
 1. Create a private field temperatureInCelsius (double).
 2. Add getter and setter for it (no unrealistic values like -273).
 3. Add a method getFahrenheit() that converts Celsius to Fahrenheit.
 4. Add a method getKelvin() that converts Celsius to Kelvin.
 */
public class Temperature
{
    // your code here
    private double temperatureInCelsius;

    public Temperature(double temperatureInCelsius) {
        setTemperatureInCelsius(temperatureInCelsius);
    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperature) {
        if (temperature > -273 && temperature < 273) {
            this.temperatureInCelsius = temperature;
        }
    }

    public double getFahrenheit() {
        return (temperatureInCelsius * (9.0 / 5.0) + 32);
    }

    public double getKelvin() {
        return temperatureInCelsius + 273.15;
    }


    public static void main(String[] args) {
        Temperature temperature = new Temperature(123);

        System.out.println("Celsius = " + temperature.getTemperatureInCelsius());

        System.out.println("Fharenheit = " + temperature.getFahrenheit());
        System.out.println("Kelvin = " + temperature.getKelvin());
    }
}
