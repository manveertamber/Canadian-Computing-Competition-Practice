import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt();
		int numChores = input.nextInt();
		int choreTimes [] = new int[numChores];
		
		for(int count = 0;count < numChores;count++){
			choreTimes[count] = input.nextInt();
		}
		Arrays.sort(choreTimes);
		
		int completedCount = 0;
		int next = 0;
		while(minutes > 0){
			minutes-=choreTimes[next];
			next++;
			if(minutes >= 0)
				completedCount++;
		}
		
		System.out.println(completedCount);
	}

}
