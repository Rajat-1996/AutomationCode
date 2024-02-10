package Day9;

public class ConstructorOverloading {

	int x,y;
	double d;
	
	ConstructorOverloading()  //Method 1
	{
		x=10;
		y=20;
	}
	
	ConstructorOverloading(int a, int b)  // Method 2
	{
		x=a;
		y=b;
	}
	
	ConstructorOverloading(int a, double b) //Method 3
	{
		x=a;
		d=b;
	}
	
	ConstructorOverloading(double b, int a) // Method 4
	{
		x=a;
		d=b;
	}
	 void display()
	 {
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(d);
	 }
		
	public static void main(String[] args)
	{
	
		ConstructorOverloading co=new ConstructorOverloading(20.5,200);
		
		co.display();
	}

}
