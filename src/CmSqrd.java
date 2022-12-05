
public class CmSqrd extends ConverterTest {
	// Method to convert CmSqrd to acres
			public static double cmSqrdToAcres(double userValue) {
		        double cmSqrd2Acres;

		        cmSqrd2Acres = (userValue / 40468564.2);

		        return cmSqrd2Acres;
		        
		    }
	
	// Method to convert CmSqrd to ares
		public static double cmSqrdToAres(double userValue) {
	        double cmSqrd2Ares;

	        cmSqrd2Ares = (userValue / 1000000);

	        return cmSqrd2Ares;
	        
	    }
		
		// Method to convert CmSqrd to hectares
		public static double cmSqrdToHectares(double userValue) {
	        double cmSqrd2Hectares;

	        cmSqrd2Hectares = (userValue / 100000000);

	        return cmSqrd2Hectares;
	        
	    }
				
		// Method to convert CmSqrd to inches squared
		public static double cmSqrdToInchSqrd(double userValue) {
	        double cmSqrd2InchSqrd;

	        cmSqrd2InchSqrd = (userValue * 0.155);

	        return cmSqrd2InchSqrd;
	        
	    }
		
		// Method to convert CmSqrd to meters squared
		public static double cmSqrdToMeterSqrd(double userValue) {
	        double cmSqrd2MeterSqrd;

	        cmSqrd2MeterSqrd = (userValue / 10000);

	        return cmSqrd2MeterSqrd;
	        
	    }
		
		// Method to convert CmSqrd to feet squared
		public static double cmSqrdToFeetSqrd(double userValue) {
	        double cmSqrd2FeetSqrd;

	        cmSqrd2FeetSqrd = (userValue * 0.001076);

	        return cmSqrd2FeetSqrd;
	        
	    }
}
