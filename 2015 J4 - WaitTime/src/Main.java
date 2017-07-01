import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int time = -1;
		int n = input.nextInt();
		ArrayList<friend> list = new ArrayList<friend>();
		for(int count = 0;count < n;count++){
			String action = input.next();
			int num = input.nextInt();
			if(action.equals("R")){
				friend workwith = null;
				for(friend x:list){
					if(x.id == num){
						workwith = x;
					}
				}
				if(workwith == null){
					workwith = new friend(num, time);
					list.add(workwith);
				}
				else{
					workwith.restart(time);
				}
				time++;
			}
			else if(action.equals("S")){
				friend workwith = null;
				for(friend x:list){
					if(x.id == num){
						workwith = x;
					}
				}
				workwith.close(time);
				time++;
			}
			else{
				time +=num;
				time--;
			}
			
		}
		for(int count = 0;count < list.size()-1;count++){
			int minimum = 10000000;
			for(int count1 = count;count1 < list.size();count1++){
				if(list.get(count1).id < minimum){
					minimum = list.get(count1).id;
				}
			}
			swap(list,count,minimum);
		}
		
		for(friend x:list){
			System.out.println(x.id + " " + x.getWaitTime());
		}
	}
	public static void swap(ArrayList<friend> thing,int one, int two){
		for(int count = 0;count < thing.size();count++){
			if(thing.get(count).id == one){
				one = count;
				break;
			}
		}
		for(int count = 0;count < thing.size();count++){
			if(thing.get(count).id == two){
				two = count;
				break;
			}
		}
		friend temp = thing.get(one);
		thing.set(one,thing.get(two));
		thing.set(two, temp);
	}
}


class friend{
	public int waitTime = 0;
	public boolean sent = false;
	public int id = 0;
	public int startTime = 0;
	public int hits = 0;
	public friend(int x, int start){
		id = x;
		sent = true;
		startTime = start;
		hits++;
	}
	
	public void close(int x){
		waitTime+= (x-startTime);
		sent = false;
	}
	
	public void restart(int start){
		startTime = start;
		sent = true;
		hits++;
	}
	
	public int getWaitTime(){
		if(sent == true){
			return -1;
		}
		else{
			return waitTime;
		}
	}
}