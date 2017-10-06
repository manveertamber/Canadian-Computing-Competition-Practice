import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int winCount = 0;
		
		for(int count = 0;count < 6;count++){
			if(input.nextLine().trim().equals("W")){
				winCount++;
			}
		}
			
		if(winCount > 4){
			System.out.println(1);
		}
		else if(winCount > 2){
			System.out.println(2);
		}
		else if(winCount > 0){
			System.out.println(3);
		}
		else{
			System.out.println(-1);
		}
	}

}
