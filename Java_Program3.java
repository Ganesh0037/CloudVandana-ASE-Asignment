package cloudvandana.ase;

import java.util.*;

public class Java_Program3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String input = scn.nextLine();  //	"The quick brown fox jumps over the lazy dog"
        
		boolean isPangram = isPangram(input);
        
		if (isPangram) {
            
			System.out.println("The input is a pangram.");
        
		} else {
            
			System.out.println("The input is not a pangram.");
        }
		
	}

	
	
	public static boolean isPangram(String input) {
        
		input = input.toLowerCase(); // Convert the input to lowercase for case insensitivity
        
		Set<Character> alphabetSet = new HashSet<>();

        for (char c : input.toCharArray()) {
            
        	if (c >= 'a' && c <= 'z') {
                
        		alphabetSet.add(c);
            }
        }

        return alphabetSet.size() == 26; // Check if all letters from 'a' to 'z' are present
    }
}
