package b.fibonacci.syntax;
import java.util.Scanner;
public class MainClass{
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		int y = 1;
		int zPD;//zPD means z (variable) place holder
		int ipDX;//input index
		int[] arrayDX;
		
		System.out.print("give a number :");
		ipDX = scan.nextInt();
		int indexRec = ipDX+1;
		
		arrayDX = new int[indexRec];
		
		
		
		
		//process
		for(int i = 0; i<=ipDX;i++) {
			arrayDX[i] = x;
			
			
			System.out.print("index :"+i);
			System.out.println(" f ="+arrayDX[i]);
			zPD = x+y;
			x=y;
			y=zPD;
			
		}
		
		
		
		
		scan.close();//close scanner program *end*
	}
}
