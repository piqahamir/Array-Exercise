package ArrayOneDimensional;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		
		//write a program that create an array of 10 element size. your prog should promt the users to input numbers in array  
		//display the sum of all array element
		
		final int size = 10;
		int[] numbers = new int[size];
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter " + size + " number:");
		
		for (int i=0; i<size; i++) {
			numbers[i] = in.nextInt();
		}
		
		int sum = 0 ;
		for (int i=0; i<size; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum numbers = " + sum);
	}

}
