package assignment_2;
import java.util.*;

public class Question_3 {
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter month index : ");
		int month = scn.nextInt();
		
		switch(month) {
		case 1: 
		{
			System.out.println("Month : January, Number of days: 31" );
			break;
		}
		case 2:
		{
			System.out.println("Month : February, Number of days: 28");
			break;
		}
		case 3:
		{
			System.out.println("Month : March, Number of days: 31" );
			break;
		}
		case 4:
		{
			System.out.println("Month : April, Number of days: 30");
			break;
		}
		case 5:
		{
			System.out.println("Month : May, Number of days: 31" );
			break;
		}
		case 6:
		{
			System.out.println("Month : June, Number of days: 30");
			break;
		}
		case 7:
		{
			System.out.println("Month : July, Number of days: 31" );
			break;
		}
		case 8:
		{
			System.out.println("Month : August, Number of days: 31");
			break;
		}
		case 9:
		{
			System.out.println("Month : September, Number of days: 30" );
			break;
		}
		case 10:
		{
			System.out.println("Month : October, Number of days: 31");
			break;
		}
		case 11:
		{
			System.out.println("Month : November, Number of days: 30" );
			break;
		}
		case 12:
		{
			System.out.println("Month : December, Number of days: 31");
			break;
		}
		}
	}
}
