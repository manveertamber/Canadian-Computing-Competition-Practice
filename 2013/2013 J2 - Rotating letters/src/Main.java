import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String goodChars = "IOSHZXN";
		
		String check = input.nextLine();
		boolean good = true;
		
		for(int count = 0;count < check.length();count++){
			if(goodChars.indexOf(check.charAt(count)) == -1){
				good = false;
				break;
			}
		}
		if(good)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
