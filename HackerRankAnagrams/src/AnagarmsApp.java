import java.util.*;

import util.MyConsole;

public class AnagarmsApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Anagrams app!");

        String a = MyConsole.promptString("String a: ");
        String b = MyConsole.promptString("String b: ");
        boolean ret = isAnagram(a.toLowerCase(), b.toLowerCase());
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

		MyConsole.printLine("\nBye");

	}
	
    private static boolean isAnagram(String a, String b) {
        boolean isAnagram = true;
        int aLen = a.length();
        int bLen = b.length();
        
        Map<String, Integer> aMap = new HashMap<>();
        Map<String, Integer> bMap = new HashMap<>();
        
        // build letter maps for each word
        for (int i = 0; i < aLen; i++) {
        	String s = String.valueOf(a.charAt(i));
        	if (aMap.containsKey(s)) {
        		int count = aMap.get(s);
        		count++;
        		aMap.put(s, count);
        	}
        	else {
        		aMap.put(s, 1);
        	}
        }
        for (int i = 0; i < bLen; i++) {
        	String s = String.valueOf(b.charAt(i));
        	if (bMap.containsKey(s)) {
        		int count = bMap.get(s);
        		count++;
        		bMap.put(s, count);
        	}
        	else {
        		bMap.put(s, 1);
        	}
        }
        
        
        // compare letter maps - check for equality
        // anagram (lettermap equality) means:
        // 1 - each map has same # of entries
        if (aMap.size() == bMap.size()) {
	        // 2 - keys are the same & values are same
        	Set<String> aKeys = aMap.keySet();
        	Set<String> bKeys = bMap.keySet();
        	for (String key: aKeys) {
        		if (!bKeys.contains(key)) {
        			isAnagram = false;
        			break;
        		}
        		else {
        			if (!(aMap.get(key)==(bMap.get(key)))) {
        				isAnagram = false;
        				break;
        			}
        		}
        	}
        }
        else {
        	isAnagram = false;
        }

        return isAnagram;
    }

}
