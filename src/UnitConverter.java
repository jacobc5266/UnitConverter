import java.text.NumberFormat;
import java.util.Scanner;

public class UnitConverter {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int converterIndicator;
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
		
		// ******************************************* Area Converter Start *******************************************
	  if (converterIndicator == 1) {
		    double userValue;
			double convertedValue;
			int    initialUnit;
			int    conversionUnit;
			
			System.out.println("Select Area Unit: ");
			System.out.println("1. Centimeters Squared    2. Inches Squared");
			System.out.println("3. Meters Squared         4. Feet Squared");
			System.out.println("5. Acres                  6. Ares");
			System.out.println("7. Hectares");
			initialUnit = scnr.nextInt();
			System.out.println();
			
			System.out.print("Enter Area: ");
			userValue = scnr.nextDouble();
			System.out.println();
			
			System.out.println("Select Converted Area Unit: ");
			System.out.println("1. Centimeters Squared    2. Inches Squared");
			System.out.println("3. Meters Squared         4. Feet Squared");
			System.out.println("5. Acres                  6. Ares");
			System.out.println("7. Hectares");
			conversionUnit = scnr.nextInt();
			System.out.println();
			
		  // CmSqrd If/Else Branches
		  if (initialUnit == 1) {
		   if (conversionUnit == 2) {
			   CmSqrd.cmSqrdToInchSqrd(userValue);
			   convertedValue = CmSqrd.cmSqrdToInchSqrd(userValue);
			   System.out.printf("%f Centimeters Squared is %f Inches Squared.", userValue, convertedValue);
		   }
		   else if (conversionUnit == 3) {
			   CmSqrd.cmSqrdToMeterSqrd(userValue);
			   convertedValue = CmSqrd.cmSqrdToMeterSqrd(userValue);
			   System.out.printf("%.f Centimeters Squared is %.f Meters Squared.", userValue, convertedValue);
		   }
		   else if (conversionUnit == 4) {
			   CmSqrd.cmSqrdToFeetSqrd(userValue);
			   convertedValue = CmSqrd.cmSqrdToFeetSqrd(userValue);
			   System.out.printf("%.f Centimeters Squared is %.f Feet Squared.", userValue, convertedValue);
		   }
		   else if (conversionUnit == 5) {
			   CmSqrd.cmSqrdToAcres(userValue);
			   convertedValue = CmSqrd.cmSqrdToAcres(userValue);
			   System.out.printf("%.f Centimeters Squared is %.f Acres.", userValue, convertedValue);
		   }
		   else if (conversionUnit == 6) {
			   CmSqrd.cmSqrdToAres(userValue);
			   convertedValue = CmSqrd.cmSqrdToAres(userValue);
			   System.out.printf("%.f Centimeters Squared is %.f Ares.", userValue, convertedValue);
		   }
		   else if (conversionUnit == 7) {
			   CmSqrd.cmSqrdToHectares(userValue);
			   convertedValue = CmSqrd.cmSqrdToHectares(userValue);
			   System.out.printf("%.f Centimeters Squared is %.f Hectares.", userValue, convertedValue);
		   }
		   
		   else {
			   System.out.printf("%.f Centimeters Squared is %.f Centimeters Squared.", userValue, userValue);
		   }
		  }
			
		  // Inches Squared If/Else Branches
		  else if (initialUnit == 2) {
			  if (conversionUnit == 1) {
				   InchesSqrd.inSqrdToCmSqrd(userValue);
				   convertedValue = InchesSqrd.inSqrdToCmSqrd(userValue);
				   System.out.printf("%.3f Inches Squared is %.3f Centimeters Squared.", userValue, convertedValue);
			  }
			  else if (conversionUnit == 3) {
				   InchesSqrd.inSqrdToMeterSqrd(userValue);
				   convertedValue = InchesSqrd.inSqrdToMeterSqrd(userValue);
				   System.out.printf("%.3f Inches Squared is %.3f Meters Squared.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 4) {
				   InchesSqrd.inSqrdToFeetSqrd(userValue);
				   convertedValue = InchesSqrd.inSqrdToFeetSqrd(userValue);
				   System.out.printf("%.3f Inches Squared is %.3f Feet Squared.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 5) {
				   InchesSqrd.inSqrdToAcres(userValue);
				   convertedValue = InchesSqrd.inSqrdToAcres(userValue);
				   System.out.printf("%.3f Inches Squared is %.3f Acres.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 6) {
				   InchesSqrd.inSqrdToAres(userValue);
				   convertedValue = InchesSqrd.inSqrdToAres(userValue);
				   System.out.printf("%.3f Inches Squared is %.3f Ares.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 7) {
				   InchesSqrd.inSqrdToHectares(userValue);
				   convertedValue = InchesSqrd.inSqrdToHectares(userValue);
				   System.out.printf("%.3f Inches Squared is %.3f Hectares.", userValue, convertedValue);
			   }
			   
			   else {
				   System.out.printf("%.3f Inches Squared is %.3f Inches Squared.", userValue, userValue);
			   }
		   
		  }
			
		  // Meters Squared If/Else Branches
		  else if (initialUnit == 3) {
			  if (conversionUnit == 1) {
				   MetersSqrd.meterSqrdToCmSqrd(userValue);
				   convertedValue = MetersSqrd.meterSqrdToCmSqrd(userValue);
				   System.out.printf("%.3f Meters Squared is %.3f Centimeters Squared.", userValue, convertedValue);
			   }
			  else if (conversionUnit == 2) {
				   MetersSqrd.meterSqrdToInchSqrd(userValue);
				   convertedValue = MetersSqrd.meterSqrdToInchSqrd(userValue);
				   System.out.printf("%.3f Meters Squared is %.3f Inches Squared.", userValue, convertedValue);
			   }
			  else if (conversionUnit == 4) {
				   MetersSqrd.meterSqrdToFeetSqrd(userValue);
				   convertedValue = MetersSqrd.meterSqrdToFeetSqrd(userValue);
				   System.out.printf("%.3f Meters Squared is %.3f Feet Squared.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 5) {
				   MetersSqrd.meterSqrdToAcres(userValue);
				   convertedValue = MetersSqrd.meterSqrdToAcres(userValue);
				   System.out.printf("%.3f Meters Squared is %.3f Acres.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 6) {
				   MetersSqrd.meterSqrdToAres(userValue);
				   convertedValue = MetersSqrd.meterSqrdToAres(userValue);
				   System.out.printf("%.3f Meters Squared is %.3f Ares.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 7) {
				   MetersSqrd.meterSqrdToHectares(userValue);
				   convertedValue = MetersSqrd.meterSqrdToHectares(userValue);
				   System.out.printf("%.3f Meters Squared is %.3f Hectares.", userValue, convertedValue);
			   }
			   
			   else {
				   System.out.printf("%.3f Meters Squared is %.3f Meters Squared.", userValue, userValue);
			   }
		   
		  }
		  
		  // Feet If/Else Branches
		  else if (initialUnit == 4) {
			  if (conversionUnit == 1) {
				   FeetSqrd.feetSqrdToCmSqrd(userValue);
				   convertedValue = FeetSqrd.feetSqrdToCmSqrd(userValue);
				   System.out.printf("%.3f Feet Squared is %.3f Centimeters Squared.", userValue, convertedValue);
			  }
			  else if (conversionUnit == 2) {
				   FeetSqrd.feetSqrdToInSqrd(userValue);
				   convertedValue = FeetSqrd.feetSqrdToInSqrd(userValue);
				   System.out.printf("%.3f Feet Squared is %.3f Inches Squared.", userValue, convertedValue);
			   }
			  else if (conversionUnit == 3) {
				   FeetSqrd.feetSqrdToMeterSqrd(userValue);
				   convertedValue = FeetSqrd.feetSqrdToMeterSqrd(userValue);
				   System.out.printf("%.3f Feet Squared is %.3f Meters Squared.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 5) {
				   FeetSqrd.feetSqrdToAcres(userValue);
				   convertedValue = FeetSqrd.feetSqrdToAcres(userValue);
				   System.out.printf("%.3f Feet Squared is %.3f Acres.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 6) {
				   FeetSqrd.feetSqrdToAres(userValue);
				   convertedValue = FeetSqrd.feetSqrdToAres(userValue);
				   System.out.printf("%.3f Feet Squared is %.3f Ares.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 7) {
				   FeetSqrd.feetSqrdToHectares(userValue);
				   convertedValue = FeetSqrd.feetSqrdToHectares(userValue);
				   System.out.printf("%.3f Feet Squared is %.3f Hectares.", userValue, convertedValue);
			   }
			   
			   else {
				   System.out.printf("%.3f Feet Squared is %.3f Feet Squared.", userValue, userValue);
			   }
		   
		  }
		  
		  // Acres If/Else Branches
		  else if (initialUnit == 5) {
			  if (conversionUnit == 1) {
				   Acres.acresToCmSqrd(userValue);
				   convertedValue = Acres.acresToCmSqrd(userValue);
				   System.out.printf("%.3f Acres is %.3f Centimeters Squared.", userValue, convertedValue);
			  }
			  else if (conversionUnit == 2) {
				   Acres.acresToInchSqrd(userValue);
				   convertedValue = Acres.acresToInchSqrd(userValue);
				   System.out.printf("%.3f Acres is %.3f Inches Squared.", userValue, convertedValue);
			   }
			  else if (conversionUnit == 3) {
				   Acres.acresToMeterSqrd(userValue);
				   convertedValue = Acres.acresToMeterSqrd(userValue);
				   System.out.printf("%.3f Acres is %.3f Meters Squared.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 4) {
				   Acres.acresToFeetSqrd(userValue);
				   convertedValue = Acres.acresToFeetSqrd(userValue);
				   System.out.printf("%.3f Acres is %.3f Feet Squared.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 6) {
				   Acres.acresToAres(userValue);
				   convertedValue = Acres.acresToAres(userValue);
				   System.out.printf("%.3f Acres is %.3f Ares.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 7) {
				   Acres.acresToHectares(userValue);
				   convertedValue = Acres.acresToHectares(userValue);
				   System.out.printf("%.3f Acres is %.3f Hectares.", userValue, convertedValue);
			   }
			   
			   else {
				   System.out.printf("%.3f Acres is %.3f Acres.", userValue, userValue);
			   }
		   
		  }
		  
		// Ares If/Else Branches
		  else if (initialUnit == 6) {
			  if (conversionUnit == 1) {
				   Ares.aresToCmSqrd(userValue);
				   convertedValue = Ares.aresToCmSqrd(userValue);
				   System.out.printf("%.3f Ares is %.3f Centimeters Squared.", userValue, convertedValue);
			  }
			  else if (conversionUnit == 2) {
				   Ares.aresToInSqrd(userValue);
				   convertedValue = Ares.aresToInSqrd(userValue);
				   System.out.printf("%.3f Ares is %.3f Inches Squared.", userValue, convertedValue);
			   }
			  else if (conversionUnit == 3) {
				   Ares.aresToMeterSqrd(userValue);
				   convertedValue = Ares.aresToMeterSqrd(userValue);
				   System.out.printf("%.3f Ares is %.3f Meters Squared.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 4) {
				   Ares.aresToFeetSqrd(userValue);
				   convertedValue = Ares.aresToFeetSqrd(userValue);
				   System.out.printf("%.3f Ares is %.3f Feet Squared.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 5) {
				   Ares.aresToAcres(userValue);
				   convertedValue = Ares.aresToAcres(userValue);
				   System.out.printf("%.3f Ares is %.3f Acres.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 7) {
				   Ares.aresToHectares(userValue);
				   convertedValue = Ares.aresToHectares(userValue);
				   System.out.printf("%.3f Ares is %.3f Hectares.", userValue, convertedValue);
			   }
			   
			   else {
				   System.out.printf("%.3f Ares is %.3f Ares.", userValue, userValue);
			   }
		   
		  }
		  
		  // Hectares If/Else Branches
		  else if (initialUnit == 7) {
			  if (conversionUnit == 1) {
				   Hectares.hectaresToCmSqrd(userValue);
				   convertedValue = Hectares.hectaresToCmSqrd(userValue);
				   System.out.printf("%.3f Hectares is %.3f Centimeters Squared.", userValue, convertedValue);
			  }
			  else if (conversionUnit == 2) {
				   Hectares.hectaresToInSqrd(userValue);
				   convertedValue = Hectares.hectaresToInSqrd(userValue);
				   System.out.printf("%.3f Hectares is %.3f Inches Squared.", userValue, convertedValue);
			   }
			  else if (conversionUnit == 3) {
				   Hectares.hectaresToMeterSqrd(userValue);
				   convertedValue = Hectares.hectaresToMeterSqrd(userValue);
				   System.out.printf("%.3f Hectares is %.3f Meters Squared.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 4) {
				   Hectares.hectaresToFeetSqrd(userValue);
				   convertedValue = Hectares.hectaresToFeetSqrd(userValue);
				   System.out.printf("%.3f Hectares is %.3f Feet Squared.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 5) {
				   Hectares.hectaresToAcres(userValue);
				   convertedValue = Hectares.hectaresToAcres(userValue);
				   System.out.printf("%.3f Hectares is %.3f Acres.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 6) {
				   Hectares.hectaresToAres(userValue);
				   convertedValue = Hectares.hectaresToAres(userValue);
				   System.out.printf("%.3f Hectares is %.3f Ares.", userValue, convertedValue);
			   }			   
			   else {
				   System.out.printf("%.3f Hectares is %.3f Hectares.", userValue, userValue);
			   }
		   
		  }
		
	  }	  // Area Converter End
	
	      // ******************************************* Length Converter Start *******************************************
	    /*else if (converterIndicator == 2) {
			 double userValue;
			 double convertedValue;
			 int    initialUnit;
			 int    conversionUnit;
				
			 System.out.println("Select Length Unit: ");
			 System.out.println("1. Millimeters    2.  Centimeters");
			 System.out.println("3. Inches         4.  Feet ");
			 System.out.println("5. Meters         6.  Kilometers");
			 System.out.println("7. Yards          8.  Miles");
			 System.out.println("9. Nautical Miles 10. Mils");
			 initialUnit = scnr.nextInt();
				
			 System.out.print("Enter Length: ");
			 userValue = scnr.nextDouble();
				
			 System.out.println("Select Converted Area Unit: ");
			 System.out.println("1. Millimeters    2.  Centimeters");
			 System.out.println("3. Inches         4.  Feet ");
			 System.out.println("5. Meters         6.  Kilometers");
			 System.out.println("7. Yards          8.  Miles");
			 System.out.println("9. Nautical Miles 10. Mils");
			 conversionUnit = scnr.nextInt();
				
			  // CmSqrd If/Else Branches
			  if (initialUnit == 1) {
			   if (conversionUnit == 2) {
				   CmSqrd.cmSqrdToInchSqrd(userValue);
				   convertedValue = CmSqrd.cmSqrdToInchSqrd(userValue);
				   System.out.printf("%.3f Centimeters Squared is %.3f Inches Squared.", userValue, convertedValue);
			   }
			   else if (conversionUnit == 3) {
				   CmSqrd.cmSqrdToMeterSqrd(userValue);
				   convertedValue = CmSqrd.cmSqrdToMeterSqrd(userValue);
				   System.out.printf("%.3f Centimeters Squared is %.3f Meters Squared.", userValue, convertedValue);
			   }
			  }
			}   *///Length Converter End
	
		  // ******************************************* Temperature Converter Start *******************************************
	  else if (converterIndicator == 3) {	
		double userTemp;
		double convertedTemp;
		int temp1Unit;
		int temp2Unit;
		
		System.out.println("Select Temperature Unit: ");
		System.out.println("1. Celsius   2. Fahrenheit   3. Kelvin");
		temp1Unit = scnr.nextInt();
		
		System.out.print("Enter 1st Temperature: ");
		userTemp = scnr.nextDouble();
		
		System.out.println("Select Converted Temperature Unit: ");
		System.out.println("1. Celsius   2. Fahrenheit   3. Kelvin");
		temp2Unit = scnr.nextInt();
		
		// Celsius If/Else Branches
	  if (temp1Unit == 1) {
	   if (temp2Unit == 2) {
		Celsius.celsiusToFahrenheit(userTemp);
		convertedTemp = Celsius.celsiusToFahrenheit(userTemp);
		System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit.", userTemp, convertedTemp);
	   }
	   else if (temp2Unit == 3) {
		Celsius.celsiusToKelvin(userTemp);
		convertedTemp = Celsius.celsiusToKelvin(userTemp);
		System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit.", userTemp, convertedTemp);
	   }
	   else {
		System.out.printf("%.2f degrees Celsius is %.2f degrees Celsius.", userTemp, userTemp);
	   }
	  }
		
		// Fahrenheit If/Else Branches
	  else if (temp1Unit == 2) {
	   if (temp2Unit == 1) {
		Fahrenheit.fahrenheitToCelsius(userTemp);
		convertedTemp = Fahrenheit.fahrenheitToCelsius(userTemp);
		System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Celsius.", userTemp, convertedTemp);
	   }
	   else if (temp2Unit == 3) {
		Fahrenheit.fahrenheitToKelvin(userTemp);
		convertedTemp = Fahrenheit.fahrenheitToKelvin(userTemp);
		System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Kelvin.", userTemp, convertedTemp);
	   }
	   else {
		System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Fahrenheit.", userTemp, userTemp);
	   }
	   
	  }
		
		// Kelvin If/Else Branches
	  if (temp1Unit == 3) {
	   if (temp2Unit == 1) {
		Kelvin.kelvinToCelsius(userTemp);
		convertedTemp = Kelvin.kelvinToCelsius(userTemp);
		System.out.printf("%.2f degrees Kelvin is %.2f degrees Celsius.", userTemp, convertedTemp);
	   }
	   else if (temp2Unit == 2) {
		Kelvin.kelvinToFahrenheit(userTemp);
		convertedTemp = Kelvin.kelvinToFahrenheit(userTemp);
		System.out.printf("%.2f degrees Kelvin is %.2f degrees Fahrenheit.", userTemp, convertedTemp);
	   }
	   else {
		System.out.printf("%.2f degrees Kelvin is %.2f degrees Kelvin.", userTemp, userTemp);
	   }
	  }
		
	}   // Temperature Converter End
	
	    // ******************************************* Volume Converter Start *******************************************
	  else if (converterIndicator == 4) {
		
	  } // Volume Converter End
	
	    // ******************************************* Mass Converter Start *******************************************
	  else if (converterIndicator == 5) {
		
	  } // Mass Converter End
		
	    // ******************************************* Speed Converter Start *******************************************
	  else if (converterIndicator == 6) {
		
	  } // Speed Converter End

		System.out.println();
		System.out.println();
		System.out.print("Make Another Conversion? 'y' or 'n' : ");
		restartChar = scnr.next().charAt(0);
		restartChar = 'y';

	  System.out.println();
	  System.out.println();
		break;
	} // End of While Loop
	scnr.close();
  }   // Main Method End Brace

}     // ConverterTest Class End Brace
