import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age1 = input.nextInt();
		int age2 = input.nextInt();
		
		System.out.println(age2 + (age2 - age1));
	}

}
