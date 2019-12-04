
public class half_pyramid{
	
	public static void main(String arg[]){
		half_pyramid h = new half_pyramid();
		h.print();
		
	}
	
	public static void print(){
		
		
		
		for(int i=0; i<=5;++i ){
			for(int j=0;j<=i;++j){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
	}
	
	
}