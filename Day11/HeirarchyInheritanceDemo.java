package Day11;

class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	void show (int b)
	{
		System.out.println(b);
	}
}
 class child2 extends Parent
 {
	 void Print(int c)
	 {
		 System.out.println(c);
	 }
 }
 
public class HeirarchyInheritanceDemo {
	
	public static void main(String[] args) {
	Child1 c1=new Child1();
		c1.display(150);
		c1.show(300);
	}

}
