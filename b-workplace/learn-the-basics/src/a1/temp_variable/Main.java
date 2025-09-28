package a1.temp_variable;

public class Main {

	public static void main(String[] args) {
		
		short x = 10;
		short y = 5;
		short temp;
		
		System.out.println("Initial values X = "+x+" Y = "+y);
		
		temp = x;
		x = y;
		y = temp;
		temp = 0;
		
		System.out.println("New values: X = "+x+" Y = "+y+" temp = "+temp);
		
		
		
	}
	
	
	
	
}
