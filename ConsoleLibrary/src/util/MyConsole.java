package util;

import java.util.Scanner;

public class MyConsole {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int promptInt(String prompt) {
        int result = 0;
        boolean isValid = false;
        while (!isValid) {
            print(prompt);
            if (sc.hasNextInt()) {
            	result = Integer.parseInt(sc.nextLine());
                isValid = true;
            }
            else {
                printLine("Error - invalid int.");
            }
        }

        return result;
    }

    public static int promptInt(String message, int min, int max) {
        int result = 0;
        boolean isValid = false;
        // validation: 1) whole #, 2) range
        while (!isValid) {
            result = promptInt(message);
            if (result >= min && result <= max) {
                isValid = true;
            }
            else {
                printLine("Error - int must be within range " + min + " - " + max);
            }
        }
        return result;
    }

    public static double promptDouble(String prompt) {
        double result = 0;
        boolean isValid = false;
        while (!isValid) {
            print(prompt);
            if (sc.hasNextDouble()) {
            	result = Double.parseDouble(sc.nextLine());
                isValid = true;
            }
            else {
                printLine("Error - invalid double.");
            }
        }

        return result;
    }

    public static String promptString(String prompt) {
        print(prompt);
        return sc.nextLine();
    }

    public static String promptReqString(String prompt, String str1, String str2) {
        String result = "";
        boolean isValid = false;
        while (!isValid) {
            result = promptString(prompt);
            if (result.trim() != "") {
                if (result == str1 || result == str2) {
                    isValid = true;
                }
                else {
                    printLine("Error - String must be either " + str1 + " or " + str2);
                }
            }
            else {
                printLine("Error - entry is required.");
            }
        }
        return result;
    }

    public static void print(String msg) {
        System.out.print(msg);
    }
    
    public static void printLine() {
    	System.out.println();
    }
    
    public static void printLine(String msg) {
    	System.out.println(msg);
    }
    
    public static void printHeader(String header, String sep) {
    	printLine(header);
    	String separatorLine = sep.repeat(header.length());
    	printLine(separatorLine);
    }
    
    public static void printHeader(String header) {
    	printHeader(header, "=");
    }
}
