
public class Question_2 {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		
		if(a < b && a < c) { // if a is less than b and c then a would be minimum
			System.out.println("Smallest ans is " + a);
		}
		else if(b < a && b < c) { // // if b is less than a and c then a would be minimum
			System.out.println("Smallest ans is " + b);
		}
		else { // c would be minimum if both the above statements are not true
			System.out.println("Smallest ans is " + c);
		}
		
	}
}
