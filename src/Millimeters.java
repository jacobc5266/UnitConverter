
public class Millimeters extends ConverterTest {
	public static double mmToCm(double userValue) {
		double mm2Cm;
		
		mm2Cm = (userValue / 10);
		
		return mm2Cm;
	}
	public static double mmToInches(double userValue) {
		double mm2In;
		
		mm2In = (userValue / 25.4);
		
		return mm2In;
	}
	public static double mmToFeet(double userValue) {
		double mm2Feet;
		
		mm2Feet = (userValue * 0.003281);
		
		return mm2Feet;
	}
	
}
