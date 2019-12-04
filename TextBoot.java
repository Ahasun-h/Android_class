import java.util.Scanner;

public class TextBoot{
	
	public static void main(String arg[]){
		
		Scanner read = new Scanner(System.in);
		
		String bootValue[] = new String[7];
		
		bootValue[0] = "HI......TextBoot.";	
		bootValue[1] = "Whats your name?";
        bootValue[2] = " is a nice name.";	
        bootValue[3] = "How are you?";
        bootValue[4] = "Wow...Have a nice day.";	
        bootValue[5] = "Oh...Sorry.God bless you";
        bootValue[6] = "Bye...See you aegin";			
		
		System.out.print(bootValue[0]);
		System.out.println(bootValue[1]);
		String name = read.nextLine();
		System.out.println(name+bootValue[2]);
		System.out.println(bootValue[3]);
		String fineOrNot = read.nextLine();
		
		if(fineOrNot.toUpperCase().equals("FINE")){
			System.out.println(bootValue[4]);
		}else{
			System.out.println(bootValue[5]);
		}
		System.out.println(bootValue[6]);
		
		
	}
	
}