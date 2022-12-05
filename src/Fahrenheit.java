
public class Fahrenheit extends ConverterTest {
	// Method to Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double temperature) {
        double f2C;

        f2C = ((temperature - 32.0) * 5.00 / 9.00);
                    
        return f2C;

    }
 // Method to Convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double temperature) {
        double f2C;
        double f2K;

        f2C = ((temperature - 32.0) * 5.00 / 9.00);
        f2K = (f2C + 273.15);
                    
        return f2K;

    }
	
}
