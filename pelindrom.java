import java.util.Scanner;
public class pelindrom{
	
	public static void main(String avg[]){
		
		
        
        Scanner read = new Scanner(System.in);
        String str = read.next();
		
		System.out.print("Enter string to reverse : ");
		
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
		
		if(reverse.equals(str))
		{
			System.out.println("Is pelindrom:"+reverse);
		}else
		{
			System.out.println("Is not pelindrom:"+reverse);
		}
		
		
		
	}
	
	
}