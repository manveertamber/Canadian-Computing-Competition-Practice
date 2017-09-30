import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int planksCountingSort[] = new int[2001];
		
		for(int count = 0;count < n;count++){
			planksCountingSort[input.nextInt()]++;
		}
		
		int plankPairsAtHeight[] = new int[4001];
		for(int height = 1; height < 4001;height++){
			for(int boardHeight = 1;boardHeight< 2001;boardHeight++){
				if(height > boardHeight && height - boardHeight < 2001){
				if(planksCountingSort[boardHeight] != 0 && planksCountingSort[height-boardHeight] != 0){
					plankPairsAtHeight[height] += Math.min(planksCountingSort[boardHeight],planksCountingSort[height-boardHeight]);
				}
			}
			}
		}
		
		int heightsThatAreMaxLength = 0;
		int maxLength = 0;
		for(int x: plankPairsAtHeight){
			if(x == maxLength){
				heightsThatAreMaxLength++;
			}
			else if(x > maxLength){
				maxLength = x;
				heightsThatAreMaxLength = 1;
			}
		}
		
		System.out.print(maxLength/2 + " " + heightsThatAreMaxLength);
		
	}

}
