
inteface Human{
	public String character();
	public int age();
	public String partner();
	
	
}

inteface mamai{
	public String state();
	public String job();
}

public class Man implements Human,mamai{
	public String character(){
		return "Honest is Rear!";
	}
	
	public String age(){
		int realage = 50;
		return realage = 5;
	} 
	
	public String partner(){
		return "Ho got no-one";
	}
}  