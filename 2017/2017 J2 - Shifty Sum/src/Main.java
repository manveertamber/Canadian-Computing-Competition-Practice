import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int n = input.nextInt();
		int k = input.nextInt();
		sum+=n;
		for(int count = 0;count < k;count++){
			n*=10;
			sum+=n;
		}
		System.out.println(sum);
	}
}
