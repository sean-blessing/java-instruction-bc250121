import java.text.NumberFormat;

public class PrimitivesApp {

	public static void main(String[] args) {
		System.out.println("Welcome to primitives!");
		
		double d1 = 32.45678;
		
		// round to 2 decimal places
		System.out.println("d1 = "+d1);
		System.out.println("d1 rounded = "+Math.round(d1));
		System.out.println("d1 rounded = "+((double)Math.round(d1*100) / 100));
		System.out.println("d1 rounded = "+((double)Math.round(d1*1000) / 1000));
		
		// random #s
		System.out.println(Math.random());
		// die roll (1 - 6)
		int dieRoll = (int)(Math.random()*6) + 1;
		System.out.println("Die Roll = "+dieRoll);
		
		double p1 = .03548;
		System.out.println("p1 = "+p1);
		NumberFormat percentF = NumberFormat.getPercentInstance();
		percentF.setMinimumFractionDigits(2);
		System.out.println("p1 formatted: "+percentF.format(p1));
		double price1 = 11.99;
		NumberFormat currF = NumberFormat.getCurrencyInstance();
		System.out.println(currF.format(price1));
		
		
		
		
		System.out.println("Bye");

	}

}
