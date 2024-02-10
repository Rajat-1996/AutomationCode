package Day9;

public class MethodOverloading {
	
	int x,y,z;
	double d;
	
	void sum()  //Method 1
	{
		x=10;
		y=20;
		System.out.println(x+y);
	}
    void sum (int a, int b)  //Method 2
    {
    	x=a;
    	y=b;
    	System.out.println(x+y);
    }
    void sum (int a, double b)  //Method 3
    {
    	x=a;
    	d=b;
    	System.out.println(x+d);
    }
    void sum (double b, int a) //Method 4
    {
    	x=a;
    	d=b;
    	System.out.println(x+d);
    }

	public static void main(String[] args) 
	{
		MethodOverloading mo=new MethodOverloading();
		
		mo.sum();  // Method 1 is invoked
		
		mo.sum(150,200);   //Method 2 is invoked
		
		mo.sum(10.9,123);  //Method 4
		
		mo.sum(10,28.9); //Method 3
 	}

}
