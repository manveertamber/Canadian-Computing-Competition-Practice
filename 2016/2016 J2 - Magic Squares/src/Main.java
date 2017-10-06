import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int square [][] = new int[4][4];
		
		for(int row = 0;row < 4;row++){
			for(int column = 0;column < 4;column++){
				square [row][column] = input.nextInt();
			}
		}
		int targetSum = square[0][0] + square[0][1] + square[0][2] + square[0][3];
		boolean good = true;
		for(int row = 1; row < 4;row++){
			int sum = square [row][0] + square [row][1] + square [row][2] + square [row][3];
			if(sum !=targetSum){
				good = false;
				break;
			}
		}
		for(int column = 0;column < 4;column++){
			if(!good)
				break;
			int sum = square [0][column] + square [1][column] + square [2][column] + square [3][column];
			if(sum!=targetSum)
				good = false;
		}
		
		if(good)
			System.out.println("magic");
		else
			System.out.println("not magic");
	}

}
