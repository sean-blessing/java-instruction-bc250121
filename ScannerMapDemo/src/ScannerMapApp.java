import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScannerMapApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the scanner map demo.");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter some data: ");
////		String inputStr = sc.nextLine();
////		System.out.println("You entered: "+inputStr);
//		String val1 = sc.next();
//		String val2 = sc.next();
//		String val3 = sc.next();
//		String val4 = sc.next();
//		String val5 = sc.next();
//		
//		System.out.println("values: "+val1+", "+val2+", "+val3+", "+val4+", "+val5);
//		
//		sc.close();
//		
//		String sentence = "The 2 kids rode their bikes 5.5 miles.";
//		Scanner sc1 = new Scanner(sentence);
//		while (sc1.hasNext()) {
//			System.out.println(sc1.next());
//		}
//		sc1.close();
//		
//		Map<String, String> statesMap = new HashMap<>();
//		String statesString = "OH Ohio KY Kentucky IN Indiana CO Colorado";
//		Scanner sc2 = new Scanner(statesString);
//		// populate statesMap with data from statesString
//		while (sc2.hasNext()) {
//			String abbreviation = sc2.next();
//			String stateName = sc2.next();
//			statesMap.put(abbreviation, stateName);
//		}
//		
//		System.out.println("statesMap entries");
//		for (Map.Entry<String, String> entry: statesMap.entrySet()) {
//			System.out.println(entry.getKey()+": "+entry.getValue());
//		}
//		
//		sc2.close();
		
		Map<String, String> statesMap = new HashMap<>();
		statesMap.put("IN", "Indiana");
		statesMap.put("OH", "Ohio");
		statesMap.put("MT", "Montana");
		statesMap.put("CO", "Colorado");
		
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter State abbrev: ");
		String stateAbbrev = sc3.next();
		System.out.println("State is: "+statesMap.get(stateAbbrev));
			
		sc3.close();
		
		System.out.println("\nBye");

	}

}
