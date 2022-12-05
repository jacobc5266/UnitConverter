
public class Celsius extends ConverterTest {
	// Method to Convert Celsius to Fahreheit
    public static double celsiusToFahrenheit(double temperature) {
        double c2F;

        c2F = (temperature * (9.00 / 5.00) + 32.00);

        return c2F;
        
    }

    // Method to Convert Celsius to Kelvin
    public static double celsiusToKelvin(double temperature) {
        double c2K;

        c2K = (temperature + 273.15);

        return c2K;
    }

}
