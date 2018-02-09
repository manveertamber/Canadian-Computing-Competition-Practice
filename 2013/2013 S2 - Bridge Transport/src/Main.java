import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maxWeight = input.nextInt();
		int cars = input.nextInt();
		long weights[] = new long[cars];
		
		for(int count = 0;count < cars;count++){
			weights[count] = input.nextInt();
		}
		
		long sum = 0;
		int carCount = 0;
		
		int carsGone = 0;
		
		while(sum <= maxWeight){
			if(carCount >= 4){
				sum-=weights[carsGone];
				carsGone++;
			}
			
			
			sum+=weights[carCount];
			carCount++;
			if(carCount == cars){
				carCount++;
				break;
			}
			if(sum > maxWeight){
				break;
			}
		}
		System.out.println(carCount-1);

	}

}
