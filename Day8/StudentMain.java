package Day8;

public class StudentMain {

	public static void main(String[] args) 
	{
		//Student stu=new Student();	
		
		//Approach1: using reference variable
		/*stu.sid=123;
		stu.sname="Akshat";
		stu.grade='A';
		
		stu.show();
		*/
		
		//or Approach 2 using method
		//stu.SetData(123, "Akshat", 'A');
		//stu.show();
		
		//or Approach 3: Using Constructor
		Student stu=new Student(123, "Akshat", 'A');	
		stu.show();
	}
}
	    
	    
	    
		


