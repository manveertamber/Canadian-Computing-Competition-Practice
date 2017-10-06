import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		int maxLength = 0;
		for(int start = 0;start < word.length() - 2;start++){
			String cutOnce = word.substring(start,word.length());
			for(int end = cutOnce.length();end >= 2;end--){
				String cutTwice = cutOnce.substring(0,end);
				if(isPalindrome(cutTwice) && cutTwice.length() > maxLength){
					maxLength = cutTwice.length();
				}
			}
		}
		System.out.println(maxLength);
	}
	
	public static boolean isPalindrome(String x){
		String reverse = "";
		for(int count = x.length()-1;count>=0;count--){
			reverse+=x.charAt(count);
		}
		if(x.equals(reverse))
			return true;
		return false;
	}

}
