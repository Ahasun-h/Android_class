import java.util.Scanner;
public class ClassTask{
	
	public static void main(String arg[]){
		
		
		
		int[] array= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
		
		
		int a = 0;
		int b = 0;
		
		for(int i=0;array.length > i ; i++)
		{
		   int result = array[i]%2;
		   
		
		   if(result == 0 )
		   {
			   System.out.println("IS a Even Number:"+array[i]);
			   a++;
		   }
		   else{
			   System.out.println("IS a Odd Number:"+array[i]);
			   b++;
		   }
		   
		   
		   
		}
		
		System.out.println("\n\n\nEven Number:"+a);
		System.out.println("\n\n\nOdd Number:"+b);
		
		
	}
}