import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		System.out.println(check(n,k,1));
	}
	
	public static int check(int pies,int people,int min){
		int finalnum = 0;
		if(people == 2){
			
			for(int count = min;count<=pies/people;count++){
				finalnum++;
			}
			
		}
		else if(people == 1){
			finalnum++;
		}
		else{
			for(int count = min;count<=pies/people;count++){
				finalnum+= check(pies-count,people-1,count);
			} 
		}
		return finalnum;
	}

}