import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int startx = input.nextInt();
		int starty = input.nextInt();
		int endx = input.nextInt();
		int endy = input.nextInt();
		int charge = input.nextInt();
		int diffx = Math.abs(startx - endx);
		int diffy = Math.abs(starty - endy);
		charge-=diffx + diffy;
		if(charge < 0)
			System.out.println("N");
		else if(charge%2 == 1)
			System.out.println("N");
		else
			System.out.println("Y");
	}

}
