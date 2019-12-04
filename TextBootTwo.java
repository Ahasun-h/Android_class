import java.util.Scanner;
public class TextBootTwo{
	
	public static void main(String arg[]){
		Scanner read = new Scanner(System.in);
		
		System.out.print("Text Boot \n");
		
		TextBootTwo textBootTwo = new TextBootTwo();
		
		String text = read.next();
		
		String bootValueKiKoro[] = new String[11];
		
		bootValueKiKoro[0] = "KI KORO?";
        bootValueKiKoro[1] = "KI KOREN?";
        bootValueKiKoro[2] = "KI KORCHEN?";
        bootValueKiKoro[3] = "KI KORTESEN?";
        bootValueKiKoro[4] = "KI KORCHO?";
		bootValueKiKoro[4] = "Ki korso?";
		bootValueKiKoro[5] = "Ki Koro";
        bootValueKiKoro[6] = "Ki koren";
        bootValueKiKoro[7] = "Ki Korchen";
        bootValueKiKoro[8] = "Ki kortesen";
        bootValueKiKoro[9] = "Ki korcho";
		bootValueKiKoro[10] = "Ki korso";
        		
		
		

                if(text.toUpperCase().equals(bootValueKiKoro[0]))
                {
                 System.out.print("hi\n");
                }
                else
                {
                    System.out.print("no\n");
                 }
		
		
	}
	
	
}