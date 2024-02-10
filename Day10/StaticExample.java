package Day10;

public class StaticExample {
	
	static int a=10;  //static Variable
	int b=20;        // non static
	
	static void m1() //static 
	{
		System.out.println("this is static m1 method");
	}
	
	void m2()  // non-static
	{
		System.out.println("this is m2 non-static method");
	}

	void m() //non-static
	{
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
		
	}
	
	public static void main(String[] args)
	{
		//static method can access static stuff directly (without object).
		System.out.println(a);
		//System.out.println(b); // incorrect bcoz b is non-static variable
		
		m1();
		//m2(); //incorrect bcoz m2 is non-static variable 
		
	   //2) Static method can access non-static stuff through object
		
		 StaticExample se=new StaticExample();
		 System.out.println(se.b); 
		 se.m2();
		 
		 se.m();

	}

}
