import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int rolls = input.nextInt();
		int davidPoints = 100;
		int antoniaPoints = 100;
		
		for(int count = 0;count < rolls;count++){
			int antoniaRoll = input.nextInt();
			int davidRoll = input.nextInt();
			if(antoniaRoll > davidRoll)
				davidPoints-= antoniaRoll;
			else if(antoniaRoll < davidRoll){
				antoniaPoints -= davidRoll;
			}
		}
		
		System.out.println(antoniaPoints);
		System.out.println(davidPoints);
	}

}
