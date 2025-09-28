package b.factorial.syntax;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		//scanner instance
		Scanner scan = new Scanner(System.in);
		
		//description
		System.out.println("Factorial Number Converter n!");
		System.out.print("Input :");
		
		//values
		int input = scan.nextInt();
		int output = 1;
		
		for(int i = 1; i <= input; i++) {
			output = i*output;
		}
		
		//print out result
		System.out.println("Output :"+output);
		scan.close();
	}
}
