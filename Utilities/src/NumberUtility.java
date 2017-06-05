import java.util.Random;
import java.text.NumberFormat;

public class NumberUtility {

	public static String num(double dbl1, String str2) {
		//Processes PERCENTAGE, CURRENCY
		//str2 can be %, $
		if (str2.equals("%")) {
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(2);
			return percent.format(dbl1/100);
		} else if (str2.equals("$")) {
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			return currency.format(dbl1);
		} else 
			return ""+dbl1;				
	}
	
	public static String num(double dbl1, String str2, int int3) {
		// Processes PERCENTAGE w/int3 dec digits, 
		//str2 would be %. 
		if (str2.equals("%")) {
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(int3);
			return percent.format(dbl1/100);
		} else 
			return ""+dbl1;		
	}
	
	public static String num(double dbl1, int int2) {
		// Returns dbl1 w/int2 dec digits.
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(int2);
		return number.format(dbl1);		
	}
	
	public static double num(double dbl1,  double dbl2, String str3) {
		// Returns Min, Max, Rnd between dbl1, dbl2 
		if (str3.equalsIgnoreCase("MIN")) {
			return dmax(dbl1, dbl2);
		} else if (str3.equalsIgnoreCase("MAX")) {
			return dmin(dbl1, dbl2);
		} else if (str3.equalsIgnoreCase("RND")) {
			  Random r = new Random();
			  double max = dmax(dbl1, dbl2);
			  double min = dmin(dbl1, dbl2);
			  double range = max - min;
			  double scaled = r.nextDouble() * range;
			  double shifted = scaled + min;		  
			  //System.out.println("*** " + shifted.getClass().getName() + " ***");
			  return shifted;
		}		
	}
	
	public static int num(int int1, int int2) {
		// Returns Random number between int1 and int2 included.
		int min = Math.min(int1, int2);
		int max = dmax(int1, int2);
		Random r = new Random();
		return r.ints(min, max+1).findFirst().getAsInt();
	}

	public static double dmax(double d1, double d2) {
		if (d1 >= d2) {
			return d1;
		} else {
			return d2;
		}
	}
	
	public static double dmin(double d1, double d2) {
		if (d1 <= d2) {
			return d1;
		} else {
			return d2;
		}
	}
	
	public static void main(String[] args) {
		// TODO EXPERIMENT TESTING THE UTILITY FUNCTIONS
		int a = 1;
		int b = 100;
		double c = 12.345678;
		double d = 23.456789;
		System.out.println("Percent: " + num(d, "%"));
		System.out.println("Currency: " + num(d, "$"));
		System.out.println("Percent w/3 dec digits: " + num(d, "%", 3));
		System.out.println("Number w/5 dec digits: " + num(d, 5));
		System.out.println("Random int : " + num(b, a));
		
		System.out.println("Max: " + num(d, c, "MAX"));
		System.out.println("Min: " + num(c, d, "MIN"));
		
		System.out.println("Random double: " + num(d, c, "RND"));
	}

}
