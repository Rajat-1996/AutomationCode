package Day9;

public class ConstructorDemo{

	int x,y;
	String s;
	/* ConstructorDemo() //default constructor
	{
		x=100;
		y=200
	    s="Incridable INDIA";
	}*/
	
	ConstructorDemo(int a, int b, String str)//Parameterized Constructor
	{
		x=a;
		y=b;
		s=str;
	}
	
	void displayData()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	
	
	
	
	public static void main(String[] args) 
	{
      // ConstructorDemo cd=new ConstructorDemo(); // we are invoking the default constructor	
		ConstructorDemo cd=new ConstructorDemo(10,20,"Incridable INDIA")// we are invoking parameterized Constructor
				
				Cd.displayData();

	}

}