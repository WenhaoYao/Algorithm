package 瑞士轮;

import java.util.Scanner;

class Player{
	int id;
	int startPoint;
	int strength;
}

public class Main {
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int playerNums = scanner.nextInt();
		int match = scanner.nextInt();
		int rank = scanner.nextInt();
		Player[] players = new Player[playerNums];
		for(int i = 0; i < 2 * playerNums;i++) {
			players[i] = new Player();
			players[i].id = i + 1;
			players[i].startPoint = scanner.nextInt();
		}
		for(int i = 0; i < 2 * playerNums;i++) {
			players[i].strength = scanner.nextInt();
		}
	}

}
