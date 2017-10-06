import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hours = 0;
		int minutes = 0;
		
		String time = input.nextLine().trim();
		hours = Integer.parseInt(time.split(":")[0]);
		minutes = Integer.parseInt(time.split(":")[1]);
		
		float remainingMinutes = 120;
		while(remainingMinutes > 0){
			if((hours >= 7 && hours < 10) || (hours >= 15 && hours < 19)){
				remainingMinutes -= 0.5;
			}
			else
				remainingMinutes -= 1;
			minutes++;
			if(minutes == 60){
				minutes = 0;
				hours++;
				if(hours == 24)
					hours = 0;
			}
		}
		if(hours < 10)
			System.out.print(0);
		System.out.print(hours + ":");
		if(minutes < 10)
			System.out.print(0);
		System.out.println(minutes);
	}

}
