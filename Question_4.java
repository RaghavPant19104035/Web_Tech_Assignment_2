package assignment_2;

public class Question_4 {
	
	public static void main(String[] args) {
		
		int population = 80000;
		int year = 0;
		
		// increment population by 5% and year by 1 till population exceeds 150000
		while(population <= 150000) {
			population += (int) (population * 5 / 100);
			year++;
		}
		
		System.out.println("population exceeds 150000 after "+ year + " years");
	}
}
