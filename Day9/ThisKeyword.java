package Day9;

public class ThisKeyword {
	int x,y;    // instance variable class
	
	/*void setData (int x, int y) //local variables /method variables
	{
		this.x=x;
		this.y=y;
	}*/
	
	//or
	
	ThisKeyword (int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);ss
	}
	 
	public static void main(String[] args)
	{
	 // ThisKeyword th=new ThisKeyword();
		ThisKeyword th=new ThisKeyword(10, 20);
	  
	//  th.setData(10, 20);
	    th.display();

	}

}
