import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//replaceChar("111111", 0, '0');
		Scanner input = new Scanner(System.in);
		int favouriteTeam = input.nextInt();
		int numOfGamesPlayed = input.nextInt();
		
		//1-2, 1-3, 1-4, 2-3, 2-4, 3-4
		String gamesPlayed = "000000";
		
		String gameSheet[] = {"","","",""};
		for(int count = 0;count < numOfGamesPlayed;count++) {
			int TeamA = input.nextInt();
			int TeamB = input.nextInt();
			int ScoreA = input.nextInt();
			int ScoreB = input.nextInt();
			
			gamesPlayed = replaceChar(gamesPlayed,gameIndex(TeamA,TeamB) + 1, '1');
			
			if(ScoreA > ScoreB) {
				gameSheet[TeamA - 1] += "W";
				gameSheet[TeamB - 1] += "L";
			}
			else if(ScoreA == ScoreB) {
				gameSheet[TeamA - 1] += "T";
				gameSheet[TeamB - 1] += "T";
			}
			else {
				gameSheet[TeamA - 1] += "L";
				gameSheet[TeamB - 1] += "W";
			}
		}
		
		System.out.println(recurse(gameSheet, gamesPlayed, favouriteTeam));

	}
	
	public static int recurse(String gameSheet[], String gamesPlayed, int favouriteTeam){
		int nextGame = gamesPlayed.indexOf('0');
		if(nextGame == -1) {
			if (teamWon(favouriteTeam, gameSheet)) {
				return 1;
			}
			return 0;
		} 

		gamesPlayed = replaceChar(gamesPlayed,nextGame+1,'1');
		
	   	String newGameSheet1[] = Arrays.copyOf(gameSheet, gameSheet.length);
	   	String newGameSheet2[] = Arrays.copyOf(gameSheet, gameSheet.length);
	   	String newGameSheet3[] = Arrays.copyOf(gameSheet, gameSheet.length);
	   	
	   	int arr[] = reverseGameIndex(nextGame);
	   	
	   	newGameSheet1[arr[0]] += "W";
	   	newGameSheet1[arr[1]] += "L";
	   	
	   	newGameSheet2[arr[0]] += "L";
	   	newGameSheet2[arr[1]] += "W";
	   	
	   	newGameSheet3[arr[0]] += "T";
	   	newGameSheet3[arr[1]] += "T";

	   	return recurse(newGameSheet1, gamesPlayed, favouriteTeam) + recurse(newGameSheet2, gamesPlayed, favouriteTeam) + recurse(newGameSheet3, gamesPlayed, favouriteTeam);
	   	
	}
	
	public static boolean teamWon(int favouriteTeam, String gameSheet[]) {
		int scores[] = new int[4];
		for(int count = 0;count < 4;count++) {
			for(int count1 = 0;count1 < 3;count1++) {
				char gameResult = gameSheet[count].charAt(count1);
				if(gameResult == 'W') {
					scores[count]+=3;
				}
				else if(gameResult == 'T') {
					scores[count]+=1;
				}

			}
		}
		
		if(favouriteTeam == 1 && scores[0] > scores[1] && scores[0] > scores[2] && scores[0] > scores[3] ) {
			return true;
		}
		else if(favouriteTeam == 2 && scores[1] > scores[0] && scores[1] > scores[2] && scores[1] > scores[3] ) {
			return true;
		}
		else if(favouriteTeam == 3 && scores[2] > scores[0] && scores[2] > scores[1] && scores[2] > scores[3]) {
			return true;
		}
		else if(favouriteTeam == 4 && scores[3] > scores[0] && scores[3] > scores[1] && scores[3] > scores[2]) {
			return true;
		}
		return false;
	}
	
	public static String replaceChar(String x, int n, char c){
		
		return x.substring(0,n-1) + c + x.substring(n,x.length());
	}
	public static int gameIndex(int teamA, int teamB) {
		if(teamA == 1) {
			if(teamB == 2) {
				return 0;
			}
			else if(teamB == 3) {
				return 1;
			}
			else {
				return 2;
			}
		}
		else if(teamA == 2) {
			if(teamB == 3) {
				return 3;
			}
			else {
				return 4;
			}
		}
		else {
			return 5;
		}
	}
	
	public static int[] reverseGameIndex(int index) {
		if(index == 0) {
			int A[] = {0,1};
			return A;
		}
		else if(index == 1) {
			int A[] = {0,2};
			return A;
		}
		else if(index == 2) {
			int A[] = {0,3};
			return A;
		}
		else if(index == 3) {
			int A[] = {1,2};
			return A;
		}
		else if(index == 4) {
			int A[] = {1,3};
			return A;
		}
		else if(index == 5) {
			int A[] = {2,3};
			return A;
		}
		return null;
	}
}