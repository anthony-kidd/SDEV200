
public class convert {
	static double foot = 0.000;
	static double meter = 0.000;
	
	public static double footToMeter(double foot) {
	    meter = 0.305 * foot;
	    return meter;
	  }

	  public static double meterToFoot(double meter) {
		  foot = 3.279 * meter;
		    return foot;
	  }
	
}
