package Day8;

public class Student {

	int sid;
	String sname;
	char grade;
	void show()
	
	{
		System.out.println(sid+"   "+sname+"    "+grade);
	}
   
	void SetData (int id, String name, char B)
	
	{
		sid=id;
		sname=name;
		grade=B;
		
	}
	
    Student (int id, String name, char B)
	
	{
		sid=id;
		sname=name;
		grade=B;
		
	}
	
	
	}
