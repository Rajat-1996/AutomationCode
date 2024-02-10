package Day12;

interface Shape
{
	int length=15; //final & static 
	int width=25; //final & static
	
	void  circle (); //abstract method un-implemented
	
	default void square() // default method 
	{
		System.out.println("This is the square- default method");
	}
	
	static void rectangle() //static method 
	{
		System.out.println("This is rectangle");
	}
	
	public class InheritanceDemo implements Shape
	
	{
		public void circle()
		{
			System.out.println("tjis is the circle");
		}
		
		public static void main(String[]args)
		
		InheritanceDemo idobj=new InheritanceDemo();
		
		idobj.circle();
		idobj.square();
		
		Shape.rectangle();// static method can directly access
		
		//Sape sh=new Shape(); //incorrect
		
		Shape sh=new InheritanceDemo();
		sh.circle();
		sh.square();
	}
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
