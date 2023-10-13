package cloudvandana.ase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Java_Program1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
//		In this below code, I first create an ArrayList, add the values into the ArrayList, and then use 'Collections.shuffle()' method to shuffle the elements randomly.
		
		int n = scn.nextInt();
				
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			list.add(scn.nextInt());
		}

        Collections.shuffle(list);

        for (int element : list) {
            System.out.print(element + " ");
        }
        
        System.out.println();
        
        //int[] array = new int[n];
        
        //for(int i=0;i<n;i++) {
        //	array[i] = scn.nextInt();
        //}
        
        //shuffleArray(array);
        
        //for (int element : array) {
        //    System.out.print(element + " ");
        //}
	}
	
	
	
	
//	In this below code, without using any methods. shuffle the array by iterating through the array from the end to the beginning and swapping each element with a randomly chosen element that comes before it.
	
	static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
	
	

}
