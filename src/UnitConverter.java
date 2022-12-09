import java.text.NumberFormat;
import java.util.Scanner;

public class UnitConverter {

	public static void printUnitOptions(int converterIndicator) {
		switch(converterIndicator){
			case 1:
				System.out.println("1. Centimeters Squared	2. Inches Squared");
				System.out.println("3. Meters Squared	4. Feet Squared");
				System.out.println("5. Acres 		6. Ares");
				System.out.println("7. Hectares");
				break;
			case 2:
				System.out.println("1. Centimeters		2. Inches");
				System.out.println("3. Millimeters		4. Meters");
				System.out.println("5. Kilometers		6. Feet");
				System.out.println("7. Yards				8. Miles");
				System.out.println("9. Nautical Miles	10. Mils");
				break;	
			case 3:
				System.out.println("1. Celsius	2. Fahrenheit");
				System.out.println("3. Kelvin");
				break;
			case 4:
				System.out.println("1. US Gallons		2. Liters");
				System.out.println("3. UK Gallons		4. Milliliters");
				System.out.println("5. Cubic Centimeters 6. Cubic Inches");
				System.out.println("7. Cubic Meters		7. Cubic Feet");
				break;
			case 5:
				System.out.println("1. Pounds	2. Kilograms");
				System.out.println("3. Grams		4. Ounces");
				System.out.println("5. Tons		6. UK Tons");
				System.out.println("7. US Tons");
				break;
			case 6:
				System.out.println("1. Meters per Second			2. Meters per Hour");
				System.out.println("3. Kilometers per Second		4. Kilometers per Hour");
				System.out.println("5. Inches per Second			6. Inches per Hour");
				System.out.println("7. Feet per Second			8. Feet per Hour");
				System.out.println("9. Miles per Second			10. Miles per Hour");
				System.out.println("11. Knots");
				break;
		}
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int converterIndicator;
		int initialUnit;
		int conversionType;
		double initialValue;
		char restartChar;
		
		NumberFormat f = NumberFormat.getNumberInstance();
		f.setGroupingUsed(true);
		f.setMaximumFractionDigits(10);
		f.setMinimumFractionDigits(1);
		
		restartChar = 'y';
	while (restartChar == 'y') {
			System.out.println("1. Area          2. Length");
			System.out.println("3. Temperature   4. Volume");
			System.out.println("5. Mass          6. Speed");
		
			System.out.print("Select a unit to begin conversion: ");
		converterIndicator = scnr.nextInt();
		
		switch(converterIndicator) {
//******************************************* Area Converter *******************************************		
			case 1:
				System.out.println("Select initial unit: ");
				printUnitOptions(converterIndicator);
				System.out.println("Initial Unit Type: ");
				initialUnit = scnr.nextInt();

				System.out.println("Enter area to convert: ");
				initialValue = scnr.nextDouble();

				if(initialUnit == 1) {
					System.out.println("Select conversion unit: ");
					printUnitOptions(converterIndicator);	
					System.out.println("Conversion Unit: ");
					conversionType = scnr.nextInt();

					switch(conversionType) {
						case 1:
							System.out.printf("%f centimeters squared is %f centimeters squared.",initialValue);
							break;
						case 2:
							System.out.println(initialValue + "centimeters squared is " +CmSqrd.cmSqrdToInchSqrd(initialValue) + " inches squared.");
							break;
						case 3:
							System.out.println(initialValue + "centimeters squared is " +CmSqrd.cmSqrdToMeterSqrd(initialValue) + " meters squared.");
							break;
						case 4:
							System.out.println(initialValue + "centimeters squared is " +CmSqrd.cmSqrdToFeetSqrd(initialValue) + " feet squared.");
							break;
						case 5:
							System.out.println(initialValue + "centimeters squared is " +CmSqrd.cmSqrdToAcres(initialValue) + " acres.");
							break;
						case 6:
							System.out.println(initialValue + "centimeters squared is " +CmSqrd.cmSqrdToAres(initialValue) + " ares.");
							break;
						case 7:
							System.out.println(initialValue + "centimeters squared is " +CmSqrd.cmSqrdToHectares(initialValue) + " hectares.");
							break;
					}

				} else if(initialUnit == 2) {
					System.out.println("Select conversion unit: ");
					printUnitOptions(converterIndicator);	
					System.out.println("Conversion Unit: ");
					conversionType = scnr.nextInt();

					switch(conversionType) {
						case 1:
							System.out.println(initialValue + "inches squared is " +InchesSqrd.inSqrdToCmSqrd(initialValue) + " centimeters squared.");
							break;
						case 2:
							System.out.printf("%f inches squared is %f inches squared.",initialValue);
							break;
						case 3:
							System.out.println(initialValue + "inches squared is " +InchesSqrd.inSqrdToMeterSqrd(initialValue) + " meters squared.");
							break;
						case 4:
							System.out.println(initialValue + "inches squared is " +InchesSqrd.inSqrdToFeetSqrd(initialValue) + " feet squared.");
							break;
						case 5:
							System.out.println(initialValue + "inches squared is " +InchesSqrd.inSqrdToAcres(initialValue) + " acres.");
							break;
						case 6:
							System.out.println(initialValue + "inches squared is " +InchesSqrd.inSqrdToAres(initialValue) + " ares.");
							break;
						case 7:
							System.out.println(initialValue + "inches squared is " +InchesSqrd.inSqrdToHectares(initialValue) + " hectares.");
							break;
					}

				} else if(initialUnit == 3) {

				} else if(initialUnit == 4) {

				} else if(initialUnit == 5){

				} else if (initialUnit == 6){

				} else {

				}
				break;			
//******************************************* Length Converter *******************************************			
			case 2:

				break;
//******************************************* Temperature Converter *******************************************
			case 3:

				break;
//******************************************* Volume Converter *******************************************
			case 4:

				break;
//******************************************* Mass Converter *******************************************
			case 5:

				break;
//******************************************* Speed Converter *******************************************
			case 6:
			
				break;
		}

		System.out.println();
		System.out.println();
		System.out.print("Make Another Conversion? 'y' or 'n' : ");
		restartChar = scnr.next().charAt(0);
		
	  	System.out.println();
	  	System.out.println();
	} // End of While Loop
		scnr.close();
  }   // Main Method End Brace

}     // ConverterTest Class End Brace
