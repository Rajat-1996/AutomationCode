package Day14;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Program is started..");
		System.out.println("Program is in progress..");
		
	/*	//Example1
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println(150/num); //Arithmetic Exception */
		
		// Example2
		
		/*int a[]=new int[5]; //0-4
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println("Enter position (0-4):");
		int pos=sc.nextInt();
		
		a[pos]=num; //Array Index out of Bound Exception
		System.out.println(a[pos]);*/
		
		
		//Example 3
		String s="Welcome";
		int num=Integer.parseInt(s); //Number Format Exception
		System.out.println(num);
		
		
		System.out.println("Program is completed..");
		System.out.println("Program is exited..");
	

	}

}
