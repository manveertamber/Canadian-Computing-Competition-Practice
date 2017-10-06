import java.util.Scanner;
public class Main {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int question = input.nextInt();
		
		int numPeople = input.nextInt();
		
		int dmojistanSpeeds [] = new int[numPeople];
		int peglandSpeeds[] = new int[numPeople];
		
		for(int count = 0;count < numPeople;count++){
			dmojistanSpeeds[count] = input.nextInt();
		}
		for(int count = 0;count < numPeople;count++){
			peglandSpeeds[count] = input.nextInt();
		}
		
		sort(dmojistanSpeeds);
		sort(peglandSpeeds);
		
		int totalSpeed = 0;
		if(question == 1){
			for(int count = 0;count < numPeople;count++){
				totalSpeed+= Math.max(dmojistanSpeeds[count],peglandSpeeds[count]);
			}
		}
		
		else{
			for(int count = 0;count < numPeople;count++){
				totalSpeed+= Math.max(dmojistanSpeeds[count],peglandSpeeds[numPeople - count - 1]);
			}
		}
		System.out.println(totalSpeed);
	}
	
	public static void sort(int arr[]){
		for(int end = arr.length-1;end >=1;end--){
			int maximum = 0;
			for(int pointer = 0;pointer <= end;pointer++){
				if(arr[pointer] > arr[maximum]){
					maximum = pointer;
				}
			}
			swap(arr,maximum,end);
		}
	}
	public static void swap(int arr[], int one, int two){
		int temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
	}
}
