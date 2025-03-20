import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.MyConsole;

public class RomanToIntApp {
	private static Map<String, Integer> romanIntMap = new HashMap<>();

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Roman to Int App!");

		romanIntMap.put("I", 1);
		romanIntMap.put("V", 5);
		romanIntMap.put("X", 10);
		romanIntMap.put("L", 50);
		romanIntMap.put("C", 100);
		romanIntMap.put("D", 500);
		romanIntMap.put("M", 1000);
		
		String roman = "III";
		MyConsole.printLine("Roman Numerals: "+roman+", int: "+romanToInt(roman));
		
		roman = "LVIII";
		MyConsole.printLine("Roman Numerals: "+roman+", int: "+romanToInt(roman));
		
		roman = "MCMXCIV";
		MyConsole.printLine("Roman Numerals: "+roman+", int: "+romanToInt(roman));

		MyConsole.printLine("\nBye");
	}
	
    public static int romanToInt(String romanString) {
    	int result = 0;
    	// create a list to store the numbers in
    	List<Integer> numbers = new ArrayList<>(romanString.length()+1);
    	// initialize first nbr to 0
    	numbers.add(0);
    	// iterate index for of romanString:
    	for (int i = 0; i < romanString.length(); i++) {
    		// lookup current in romanIntMap
    		String key = String.valueOf(romanString.charAt(i));
    		int current = romanIntMap.get(key);
    		// compare current to previous,
    		// if current > prev, set prev *= -1
    		int prev = numbers.get(i);
    		if (current > prev) {
    			prev *= -1;
    			numbers.set(i, prev);
    		}
    		numbers.add(current);
    	}
    	// loop thru list, adding each value to result
    	for (int n: numbers) {
    		result += n;
    	}
        return result;
    }

}
