    
    import java.util.Scanner;

    public class MultipleCatchBlock {
	
	public static void main(String[] args) {
		
		System.out.println("Program is started..");
		System.out.println("Program is in progress..");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		
		String s=null;
		
		
		/*try
		{
			System.out.println(150/num);
			System.out.println(s.length());
		}
		catch (ArithematicException e)
		{
			System.out.println("Arithematic Exception Thrown");
		}
		catch (NumberFormatException e)
		{
			System.out.println("NumberFormatException Thrown");
		}
		catch (NullPointerException e)
		{
			System.out.println("Null Pointer Exception Thrown");
		}*/
		try
		{
			//System.out.println(150/num);
			System.out.println(s.length());
		}
		catch (Exception e)
		{
			System.out.println("Exception Thrown");
		}
		
         System.out.println("Program Is completed..");
         System.out.println("Program Is exited..");
	}

}
