
public class Kelvin extends ConverterTest {
	// Method to Convert Kelvin to Celsius
    public static double kelvinToCelsius(double temperature) {
        double k2C;

        k2C = (temperature - 273.15);

        return k2C;
    }
 // Method to Convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double temperature) {
        double k2C;
        double c2F;

        k2C = (temperature - 273.15);
        c2F = (k2C * (9.00 / 5.00) + 32.00);
        
        return c2F;
    }
}
