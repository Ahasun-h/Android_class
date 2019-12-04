
import java.util.Scanner;

public class inputRead{
	
	public static void main(String arg[]){
		
		inputRead n = new inputRead();
		n.readInegerInput();
		n.readStringInput();
	}
	
	//read Integar  input
	
	public void readInegerInput(){
		
		
		//need to crate Scanner object
		Scanner read = new Scanner(System.in);
		// input takting line
		
		System.out.print("Enter Total Array Size :");
		
		int arraySize = read.nextInt();
		
		
		int a[] = new int[arraySize];
		
		for(int i = 0; i<a.length;i++)
		{
			System.out.print("Enter Integar Value :");
			a[i] = read.nextInt();
			
		}
		
		System.out.print("Int Array is :");
		
		for(int i = 0; i<a.length;i++)
		{
			 System.out.print(a[i]);
			
		}
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
	}
	
	//read write String 
	
	public void readStringInput(){
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter Total Array Size :");
		int arraySize = read.nextInt();
		
		String e[] = new String[arraySize];
		
		for(int i = 0; i<e.length;i++)
		{
			System.out.print("Enter input String Value:");
			e[i] = read.next();
			
		}
		
		System.out.print("String Array is :");
		
		for(int i = 0; i<e.length;i++)
		{
			 
			 System.out.print(e[i]);
			
		}
		
	}
	
	
}