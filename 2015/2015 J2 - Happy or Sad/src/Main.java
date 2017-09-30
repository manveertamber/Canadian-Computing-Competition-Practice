import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		int happyCount = 0;
		int sadCount = 0;
		
		int lastIndex = 0;
		while(true){
			int index = line.indexOf(":-)", lastIndex);
			lastIndex = index + 1;
			if(index == -1)
				break;
			else
				happyCount++;
		}
		
		lastIndex = 0;
		while(true){
			int index = line.indexOf(":-(", lastIndex);
			lastIndex = index + 1;
			if(index == -1)
				break;
			else
				sadCount++;
		}
		
		if(happyCount > sadCount)
			System.out.println("happy");
		else if(happyCount < sadCount)
			System.out.println("sad");
		else if(happyCount!=0)
			System.out.println("unsure");
		else
			System.out.println("none");
	}
}
