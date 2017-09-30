import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hour = 12;
		int minute = 0;
		int m = input.nextInt();
		int count  = 0;
		
		while(m > 1440){
			m-=1440;
			count +=62;
		}
		
		while(m > 0){
		minute++;
		m--;
		if(minute == 60){
			minute = 0;
			hour++;
			if(hour == 13){
				hour = 1;
			}
		}
		if(checkSpecial(hour,minute))
			count++;
		}
		
		System.out.println(count);
	}
	
	public static boolean checkSpecial(int hour, int minute){
		int arr[];
		if(hour < 10){
			arr = new int[3];
			arr[0] = hour;
			arr[1] = minute/10;
			arr[2] = minute%10;
		}
		else{
			arr = new int[4];
			arr[0] = hour/10;
			arr[1] = hour%10;
			arr[2] = minute/10;
			arr[3] = minute%10;
		}
		boolean special = true;
		int diff = arr[0] - arr[1];
		for(int count = 2;count < arr.length;count++){
			if(!(arr[count -1] - arr[count] == diff))
				special = false;
		}
		return special;
	}

}
