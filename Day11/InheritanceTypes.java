package Day11;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b;
	
void show()
{
	System.out.println(b);
}
}
class C extends B
{
	int c;
	
	void print()
	{
		System.out.println(c);
	}
}


public class InheritanceTypes {

	public static void main(String[] args) {
	/*B bobj=new B();
	
	bobj.a=100;
	bobj.b=200;
	
	bobj.display();
	bobj.show();*/
    
		C cobj=new C();
		
		cobj.a=15;
		cobj.b=30;
		cobj.c=45;
		
		cobj.display();
		cobj.show();
		cobj.print();
	}

}
