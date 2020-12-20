package ArrayOneDimensional;
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		//The variable list1 and list2 are reference arrays that each have 5 elements. 
		//Write code that copies the values in list1 to list2.
		//Values in list1 are input by user.
		
		final int y = 5;
		int[] list1 = new int[y];
		int[] list2 = new int[y];
		
		Scanner in = new Scanner (System.in);
		System.out.println("Elements of list 1: ");
		System.out.println("Enter " + y + " numbers: ");
		
		for(int i=0; i<y ; i++) {
			list1[i] = in.nextInt();
		}
		
		for(int i=0; i<y ;i++) {
			list2[i] = list1[i];
		}
		
		System.out.println("Elements of list 2 : ");
		for(int i =0; i<y ; i++) {
			System.out.println(list2[i]);
		}
	}

}
