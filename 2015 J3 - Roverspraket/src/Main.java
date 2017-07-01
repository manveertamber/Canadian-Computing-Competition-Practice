import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String consonants = "bcdfghjklmnpqrstvwxyz";
			String vowels = "aaeeeiiiiooooouuuuuuu";
		String word = input.nextLine();
		String replacement = "";
		for(int count = 0;count < word.length();count++){
			char character = word.charAt(count);
			if(consonants.indexOf(character)!=-1){
				replacement+=character;
				replacement+=vowels.charAt(consonants.indexOf(character));
				if(character=='z'){
					replacement+='z';
				}
				else{
					replacement+=consonants.charAt(consonants.indexOf(character)+1);
				}
			}
			else{
				replacement+=character;
			}
		}
		System.out.println(replacement);
	}
}
