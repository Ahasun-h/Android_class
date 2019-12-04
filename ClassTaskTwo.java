import java.util.Scanner;
public class ClassTaskTwo{
	
	
	protected int numberOfStudent = 0;
	private double avgMarks = 0;
	
	private String name= "";
	
	public ClassTaskTwo(int nos){
		this.numberOfStudent = nos;
	}
	
	public double getAvgMark(){
		return this.avgMarks;
	}
	
	public void setAvgMark(double avg){
		this.avgMarks = avg;
	}
	
	public String setName(String avg){
		if(name.length()< 10){
			
		}
		else 
			this.name = name;
	}
	
	public double calculateMarks (double[] marks){
		double avgmarks = 0.0;
		
		double sum = 0.0;
		double x = marks.langth;
		
		
		 //forEach Loop
		for(double m: marks)             
		{
			sum = sum + m ;
		}

		return sum/this.numberOfStudent;	
	}
	
	public static void main(String avg[]){
		
		ClassTaskTwo classTaskTwo = new ClassTaskTwo(5);
		
	}
	
}


public class Teacher extends ClassTaskTwo{
	
	public String teacherName;
	
	public Teacher(String name,int nos){
		super(nos);
		this.teacherName = name;
	}
	
	/*public setNumberOfStudent(){
		
	}
	
	public getClassDetail(){
		
	}*/
	
	public static void main(String arg[]){
		
		
		Scanner s = new Scanner(System.in);
		String TeacherName = s.nextLine();
		int nos = s.nextInt();
		 
		Teacher t = new Teacher(TeacherName,nos);
		
		System.out.println(t.numberOfStudent);
		
		t.calculateMarks();
		
		
		
	}
	
	
	
} 0