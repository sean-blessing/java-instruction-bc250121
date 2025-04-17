import java.util.ArrayList;
import java.util.List;

public class DivByItselfApp {

	public static void main(String[] args) {
		// Find numbers that are divisible by themselves(i.e. is 23 divisible by 2 and 3)
		List<Integer> nums = new ArrayList<>();
		// loop from 1 to 100
		for (int nbr = 1; nbr <= 200; nbr++) {
			// is # divisible by itself (example is 23 evenly divisible by 2 and 3?)
			// if so, put in array
			// break # down into digits (int 57 becomes int 5 and int 7)
			String nbrString = Integer.toString(nbr);
			char[] digitsCharArray = nbrString.toCharArray();
	        List<Integer> digitsIntList = new ArrayList<>();
	        for (char c : digitsCharArray) {
	        	digitsIntList.add(Integer.parseInt(String.valueOf(c)));
	        }
			// is # evenly divisible by both digits? (57 % 5==0? && 57 % 7==0?)
	        boolean include = true;
	        for (int d: digitsIntList) {
	        	if (d == 0) {
	        		include = false;
	        		break;
	        	}
	        	else if (nbr % d!=0) {
	        		include = false;
	        		break;
	        	}
	        	//include = (nbr % d != 0) ? false : true;
	        }
			if (include) {
				nums.add(nbr);
			}
		}
		
		// at end of loop, print the array
		nums.stream().forEach(n -> System.out.println(n));

	}

}
