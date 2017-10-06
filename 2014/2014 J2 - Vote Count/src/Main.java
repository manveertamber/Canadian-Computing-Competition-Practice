import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		String votes = input.nextLine();
		
		int aVotes = 0;
		int bVotes = 0;

		for(int count = 0;count < n;count++){
			if(votes.charAt(count) == 'A')
				aVotes++;
			else
				bVotes++;
		}
		
		if(aVotes > bVotes)
			System.out.println("A");
		
		else if(bVotes > aVotes)
			System.out.println("B");
		
		else
			System.out.println("Tie");
		
	}

}
