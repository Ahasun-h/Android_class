
import java.util.Scanner;
public class Factorial{
	
	public static void main(String arg[]){
		
		Factorial f = new Factorial();
		f.Factorial();
		
	}
	
	public static void Factorial(){
		
		Scanner input = new Scanner(System.in);
		
		int fact = 1;
		
		
		
		System.out.print("Enter Value :");
		int value = input.nextInt();
		
		System.out.print("\n");
		
		for(int a = 1 ; a <= value;a++)
		{
			fact = fact*a;
		}
		System.out.print(fact);
		
		
	}
	
}