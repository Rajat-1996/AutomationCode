package Day14;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Program is started..");
		System.out.println("Program is in progress..");
		
		
		String s=null;
		
		try
		{
			System.out.println(s.length());
		}
		catch (Exception e)
		{
			System.out.println("Exception Occured..handled");
		}
		finally
		{
			System.out.println("Entered into finally block...");
		}
		
         System.out.println("Program Is completed..");
         System.out.println("Program Is exited..");

	}

}
