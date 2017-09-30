import java.util.Scanner;
import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int n = input.nextInt();
		for(int count = 0;count < n;count++){
			int workwith = input.nextInt();
			if(workwith == 0 && !stack.isEmpty()){
				stack.pop();
			}
			else if (workwith != 0){
				stack.push(workwith);
			}
		}
		int sum = 0;
		while(!stack.isEmpty()){
			sum+=stack.pop();
		}
		System.out.println(sum);
	}
}
