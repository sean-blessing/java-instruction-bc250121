import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import util.MyConsole;

public class LongestCommonPrefixApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to the Longest Common Prefix App!");
		
		String[] strs = {"flower","flow","flight"};
		printResults(strs);
		
		strs = new String[]{"dog","racecar","car"};
		printResults(strs);

		
		strs = new String[]{"cir","car"};
		printResults(strs);
		
		strs = new String[]{"steal", "steeler", "steelers", "steer"};
		printResults(strs);
		
		MyConsole.printLine("\nBye");

	}
	private static void printResults(String[] strs) {
		MyConsole.print("Strs: ");
		Arrays.asList(strs).stream().forEach(s -> MyConsole.print(s + "|"));
		MyConsole.printLine(" LCP: "+longestCommonPrefix(strs));
	}
    public static String longestCommonPrefix(String[] strs) {
        String lcp = "";
        // find shortest string of array (prefix won't be any longer than this!)
        int len = findShortestString(strs).length();
        for (int i = 0; i< len; i++) {
        	Set<String> letter = new HashSet<>();
        	for (String s: strs) {
        		letter.add(String.valueOf(s.charAt(i)));
        	}
        	if (letter.size()==1) {
        		Iterator<String> iterator = letter.iterator();
        		lcp += iterator.next();
        	}
        	else {
        		break;
        	}
        }
        
        return lcp;
    }
    
    private static String findShortestString(String[] arr) {
        String shortest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < shortest.length()) {
                shortest = arr[i];
            }
        }
        return shortest;
    }
}
