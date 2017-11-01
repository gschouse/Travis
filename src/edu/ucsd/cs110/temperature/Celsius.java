package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature temp = new Fahrenheit(value * (float)1.8 + 32);
        return temp;
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + value + " C";
    }
}
