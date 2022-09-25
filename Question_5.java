package assignment_2;
import java.util.*;

public class Question_5 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = scn.nextInt(); 
		
		// here for i is from 1 to n and we are printing i^j where j varies from 1 to 4 for each i
		for(int i=1 ; i<=n ; i++) {  
			for(int j=1 ; j<=4 ; j++) {
				int powij = (int) Math.pow(i, j); // for getting i^j 
				System.out.print(powij + " "); 
			}
			System.out.println();
		}
	}
}
