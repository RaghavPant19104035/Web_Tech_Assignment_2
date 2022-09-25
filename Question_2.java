import java.util.*;

public class Question_2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter the first number : ");
		int a = scn.nextInt();
		
		System.out.println("enter the second number : ");
		int b = scn.nextInt();
		
		System.out.println("enter the third number : ");
		int c = scn.nextInt();
		
		if(a < b && a < c) { // if a is less than b and c then a would be minimum
			System.out.println("Smallest ans is " + a);
		}
		else if(b < a && b < c) { // // if b is less than a and c then a would be minimum
			System.out.println("Smallest ans is " + b);
		}
		else { // c would be minimum if both the above statements are untrue
			System.out.println("Smallest ans is " + c);
		}
		
	}
}
