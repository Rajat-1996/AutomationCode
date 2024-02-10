package Day8;

public class EmployeeMain {

	public static void main(String[] args) 
	{
	Employee emp1=new Employee();
	emp1.eid=123;
	emp1.ename="Aarohi";
	emp1.job="Software Engineer";
	emp1.esal=70000;
	
	emp1.display();
	
	Employee emp2=new Employee();
	emp2.eid=124;
	emp2.ename="Rajat";
	emp2.job="Manager";
	emp2.esal=100000;
	
	emp2.display();	
		
		
	}

}
