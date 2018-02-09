import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt() + 1;
		
		while(checkDistinct(year) == false){
			year++;
		}
		
		System.out.println(year);
	}

	
	public static boolean checkDistinct(int num){
		String number = Integer.toString(num);
		ArrayList<Character> chars = new ArrayList<Character>();
		for(int count = 0;count < number.length();count++){
			if(chars.indexOf(number.charAt(count)) != -1){
				return false;
			}
			chars.add(number.charAt(count));
		}
		return true;
	}
}
