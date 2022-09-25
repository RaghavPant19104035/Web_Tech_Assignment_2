import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Input the value of score : ");
		double score = scn.nextDouble();
		
		if(score >= 80 && score <= 90) // if score is between 80 and 90 then increment score by 5
			score += 5;
		
		System.out.println("the updated score is "+score); // it will print the updated score
		
		}
}
