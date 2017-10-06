import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		input.nextLine();
		String names1 [] = input.nextLine().trim().split("\\s+");
		String names2 [] = input.nextLine().trim().split("\\s+");
		
		boolean good = true;
		for(int count = 0;count < num;count++){
			String currentName = names1[count];
			String partnerName = names2[count];
			if(currentName.equals(partnerName)){
				good = false;
				break;
			}
			for(int count1 = 0;count1 < num;count1++){
				if(names2[count1].equals(currentName)){
					if(!names1[count1].equals(partnerName)){
						good = false;
						break;
					}
					
				}
			}
		}
		
		for(int count = 0;count < num;count++){
			String currentName = names2[count];
			String partnerName = names1[count];
			if(currentName.equals(partnerName)){
				good = false;
				break;
			}
			for(int count1 = 0;count1 < num;count1++){
				if(names1[count1].equals(currentName)){
					if(!names2[count1].equals(partnerName)){
						good = false;
						break;
					}
					
				}
			}
		}
		if(good)
			System.out.println("good");
		else
			System.out.println("bad");
	}

}