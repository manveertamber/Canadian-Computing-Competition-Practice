import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int one = input.nextInt();
		int two = input.nextInt();
		int three = input.nextInt();
		
		if(one + two + three == 180){
			if(one == two && one == three)
				System.out.println("Equilateral");
		
			else if(one == two || one == three || three == two)
				System.out.println("Isosceles");
		
			else
				System.out.println("Scalene");
		}
		
		else
			System.out.println("Error");
	
	}
}
