
import java.util.Scanner;

public class New{
	
	New(){System.out.println("Bike is created");}  
	
	public static void main(String arg[]){   

		        System.out.println("Hi....");
					   
			   //int a[] = new int[5];
			   //a[0] = 1;
			   
			   
			     
               		
	             //System.out.println(a[0]);
				 //System.out.println(a[1]);000000
				 //System.out.println(a[2]);
				 //System.out.println(a[3]);
				 //System.out.println(a[4]);
				 //System.out.println(a[5]);
				 
				 
				 
				 
				
				 System.out.println("What,s your name?");
				 
				 New n = new New();
				 n.Array();
				 n.readUserInput();
				 
				

		
	}
	
	//-----Print Array data using Loop
	
	public static void Array(){
		
		        int[] a= {5,4,6,7,8,9};
		 
		         for(int i = 0; a.length > i;i++)
				 {
					System.out.println(a[i]);
				 }
				 
				 
				 //Revers Loop
				 
				 System.out.println("Revers Loop");
				 
				 for(int n = a.length-1; n >= 0; n-- )
				 {
					 System.out.println(a[n]);
				 }
	}
	
	//---------read User input---------
	
	public void readUserInput(){
		
		System.out.println("Enter input");
		
		//need to crate Scanner object
		Scanner read = new Scanner(System.in);
		System.out.println("Enter input :");
		
		// input takting line
		String ss = read.nextLine();
		
		int num = read.nextInt();
		
		System.out.println(num);
		System.out.println(ss);
		
		
		int a[] = new int[6];
		
		for(int i = 0; i<a.length;i++)
		{
			System.out.println("Enter input");
			a[i] = read.nextInt();
			
		}
		
		for(int i = 0; i<a.length;i++)
		{
			 System.out.println(a[i]);
			
		}
		
	}
	
	
	
	
}