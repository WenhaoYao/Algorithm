package 小玉买玩具;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt();
		System.out.println((b + a * 10) / 19);
	}
}
