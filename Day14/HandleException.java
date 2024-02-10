package Day14;
import java.util.Scanner;
public class HandleException {

	public static void main(String[] args) {
		
		System.out.println("Program is started..");
		System.out.println("Program is in Progress..");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		try
		{
			System.out.println(150/num); //Arithmetic Exception
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("You have Entered Invalid Input");
		}
		
		System.out.println("Program is completed..");
		System.out.println("Program is exited..");
	}

}
