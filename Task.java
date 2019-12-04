import java.util.Scanner;
public class Task{
	
	public static void main(String arg[]){
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter the 1st value : ");
		int valueOne = read.nextInt();
		System.out.print("Enter the 2nd value : ");
		int valueTwo = read.nextInt();
		
		System.out.print("Choose your operator (' + ' ' - ' ' x ' ' / ') \n Enter the operator : ");
		String operator = read.next();
			
		//System.out.print(operator);
		
		Task task = new Task();
		
		if(operator.equals("+")){
			task.Addition( valueOne, valueTwo);
		}else if(operator.equals("-")){
			if(valueOne > valueTwo){
				task.subtractionOne( valueOne, valueTwo);
			}
			else{
				task.subtractionTwo( valueOne, valueTwo);
			}
		}else if(operator.equals("x")){
			task.multiplication( valueOne, valueTwo);
		}else if(operator.equals("/")){
			
			if(valueOne > valueTwo){
				task.divisionOne( valueOne, valueTwo);
			}
			else{
				task.divisionTwo( valueOne, valueTwo);
			}
			
		}
		
		
	}
	
	public static void Addition(int a, int b){
		
		int result = a + b;
		System.out.print("The result is : "+result);
		
	}
	
	public static void subtractionOne(int a, int b){
		
		int result = a - b;
		System.out.print("The result is : "+result);
		
	}
	
	public static void subtractionTwo(int a, int b){
		
		int result = b - a;
		System.out.print("The result is : "+result);
		
	}
	
	public static void multiplication(int a, int b){
		
		int result = a * b;
		System.out.print("The result is : "+result);
		
	}
	
	public static void divisionOne(int a, int b){
		
		int result = a / b;
		System.out.print("The result is : "+result);
		
	}
	
	public static void divisionTwo(int a, int b){
		
		int result = b / a;
		System.out.print("The result is : "+result);
		
	}
	
}