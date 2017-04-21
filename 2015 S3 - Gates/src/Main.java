import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int gates = input.nextInt();
		int planes = input.nextInt();
		int numbers[] = new int[planes];
		for(int count = 0;count<planes;count++){
			numbers[count] = input.nextInt();
		}
		int answercount = 0;
		boolean occupied[] = new boolean[gates];
		outerloop:
		for(int count = 0;count<planes;count++){
			int recommended = numbers[count] -1;
			boolean placed = false;
			while(placed == false){
				if(recommended>=gates) break;
				else if(occupied[recommended] == false){
					occupied[recommended]= true;
					placed = true;
					answercount++;
				}
				else if(recommended == 0)  break outerloop;
				else recommended --;
			}
		}
		System.out.println(answercount);
	}

}
