import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int supply = input.nextInt();
		int demand = input.nextInt();
		char sizes[] = new char[supply];
		
		for(int count = 0;count<supply;count++){
			sizes[count] = input.next().charAt(0);
		}
		int answercount = 0;
		for(int count = 0;count<demand;count++){
			char size = input.next().charAt(0);
			int number = input.nextInt() - 1;
			char available = sizes[number];
			if(available !='T'){
			if(size == 'S'){
				answercount++;
				sizes[number] = 'T';
			}
			else if(size == 'M' && (available == 'M' || available == 'L')){
				answercount++;
				sizes[number] ='T';
			}
			else if(size == 'L' && available == 'L'){
				answercount++;
				sizes[number] = 'T';
			}
			}
			
		}
		
		System.out.println(answercount);
	}

}