import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int Y = input.nextInt();
		if(X < 0){
			if(Y < 0)
				System.out.println(3);
			else
				System.out.println(2);
		}
		else{
			if(Y < 0)
				System.out.println(4);
			else
				System.out.println(1);
		}
	}

}
