package 迎春舞会之数字舞蹈;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.valueOf(reader.readLine());
		String[] number = reader.readLine().trim().split("");
		for(String num : number) {
			line1(num, size);
			System.out.print(" ");
		}
		System.out.println();
		for(int i = 0; i < size; i++) {
			for(String num : number) {
				line2(num, size);
				System.out.print(" ");
			}
			System.out.println();
		}
		for(String num : number) {
			line3(num, size);
			System.out.print(" ");
		}
		System.out.println();
		for(int i = 0; i < size; i++) {
			for(String num : number) {
				line4(num, size);
				System.out.print(" ");
			}
			System.out.println();
		}
		for(String num : number) {
			line5(num, size);
			System.out.print(" ");
		}
	}
	
	static void line1(String s, int size) {
		switch (s) {
		case "1": case "4":
			System.out.print(" ");
			while(size > 0) {				
				System.out.print(" ");
				size--;
			}
			System.out.print(" ");
			break;
		default:
			System.out.print(" ");
			while(size > 0) {				
				System.out.print("-");
				size--;
			}
			System.out.print(" ");
			break;
		}
	}

	static void line2(String s, int size) {
		switch (s) {
		case "5": case "6":
			System.out.print("|");
			while(size > 0) {				
				System.out.print(" ");
				size--;
			}
			System.out.print(" ");
			break;
		case "1": case "2": case "3": case "7":
			System.out.print(" ");
			while(size > 0) {				
				System.out.print(" ");
				size--;
			}
			System.out.print("|");
			break;
		default:
			System.out.print("|");
			while(size > 0) {				
				System.out.print(" ");
				size--;
			}
			System.out.print("|");
			break;
		}
	}
	
	static void line3(String s, int size) {
		switch (s) {
		case "1": case "7": case "0":
			System.out.print(" ");
			while(size > 0) {				
				System.out.print(" ");
				size--;
			}
			System.out.print(" ");
			break;
		default:
			System.out.print(" ");
			while(size > 0) {				
				System.out.print("-");
				size--;
			}
			System.out.print(" ");
			break;
		}
	}
	
	static void line4(String s, int size) {
		switch (s) {
		case "2":
			System.out.print("|");
			while(size > 0) {				
				System.out.print(" ");
				size--;
			}
			System.out.print(" ");
			break;
		case "1": case "3": case "4": case "5": case "7": case "9":
			System.out.print(" ");
			while(size > 0) {				
				System.out.print(" ");
				size--;
			}
			System.out.print("|");
			break;
		default:
			System.out.print("|");
			while(size > 0) {				
				System.out.print(" ");
				size--;
			}
			System.out.print("|");
			break;
		}
	}
	
	static void line5(String s, int size) {
		switch (s) {
		case "1": case "4": case "7":
			System.out.print(" ");
			while(size > 0) {				
				System.out.print(" ");
				size--;
			}
			System.out.print(" ");
			break;
		default:
			System.out.print(" ");
			while(size > 0) {				
				System.out.print("-");
				size--;
			}
			System.out.print(" ");
			break;
		}
	}
}
