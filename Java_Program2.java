package cloudvandana.ase;

import java.util.*;

public class Java_Program2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please Enter your Roman Number : ");
		
		String roman = scn.next();
		
		int result = romanToInt(roman);
		
        System.out.println("Integer value: " + result);
	}

	private static int romanToInt(String s) {
		
		int result = 0;
        Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int value = romanToInteger.get(current);
            int nextValue = (i < s.length() - 1) ? romanToInteger.get(s.charAt(i + 1)) : 0;
            if (value < nextValue) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
	}

}
