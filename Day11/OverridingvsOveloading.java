package Day11;

class BCD
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	
	{
		System.out.println(b);
	}
}

class WXY extends BCD 
{
	void m1 (int a) //overriding method
	{
		System.out.println(a*a);
	}
	void m2 (int a, int b) //overloaded method
	{
		System.out.println(a+b);
	}
}

public class OverridingvsOveloading {

	public static void main(String[] args) {
		
		WXY wxy=new WXY();
		
		wxy.m1(70);
		wxy.m2(10);
		wxy.m2(360, 350);

	}

}
