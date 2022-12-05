
public class MetersSqrd extends ConverterTest {
	// Method to convert MeterSqrd to acres
				public static double meterSqrdToAcres(double userValue) {
			        double meterSqrd2Acres;

			        meterSqrd2Acres = (userValue / 0.000247);

			        return meterSqrd2Acres;
			        
			    }
		
		// Method to convert MeterSqrd to ares
			public static double meterSqrdToAres(double userValue) {
		        double meterSqrd2Ares;

		        meterSqrd2Ares = (userValue / 100);

		        return meterSqrd2Ares;
		        
		    }
			
			// Method to convert MeterSqrd to hectares
			public static double meterSqrdToHectares(double userValue) {
		        double meterSqrd2Hectares;

		        meterSqrd2Hectares = (userValue / 10000);

		        return meterSqrd2Hectares;
		        
		    }
					
			// Method to convert MeterSqrd to inches squared
			public static double meterSqrdToInchSqrd(double userValue) {
		        double meterSqrd2InchSqrd;

		        meterSqrd2InchSqrd = (userValue * 1550.0031);

		        return meterSqrd2InchSqrd;
		        
		    }
			
			// Method to convert MeterSqrd to CmSqrd
			public static double meterSqrdToCmSqrd(double userValue) {
		        double meter2CmSqrd;

		        meter2CmSqrd = (userValue * 10000);

		        return meter2CmSqrd;
		        
		    }
			
			// Method to convert MeterSqrd to feet squared
			public static double meterSqrdToFeetSqrd(double userValue) {
		        double meterSqrd2FeetSqrd;

		        meterSqrd2FeetSqrd = (userValue * 10.76391);

		        return meterSqrd2FeetSqrd;
		        
		    }
}
