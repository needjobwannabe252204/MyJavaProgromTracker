package a4.Math;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		float x;
		float y;
		float z; 
		
		print("Enter side of x ");
		x = s.nextFloat();
		print("Enter side of y ");
		y = s.nextFloat();
		
		//hypotenuse equation
		x *= x;
		y *= y;
		z = x+y;
		z = (float) Math.sqrt(z);
		
		//z = (float) Math.hypot(x, y);
		
		println("The hypotenuse of "+Math.sqrt(x)+" and "+Math.sqrt(y)+" is "+z);
		

		
	}
	
	//printers
	static void println(String input) {
		System.out.println(input);
	}
	static void print(String input) {
		System.out.print(input);
	}
	
	
	
	
	
}
