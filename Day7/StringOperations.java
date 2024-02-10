package Day7;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome";
		//string s=new string ("welcome")
		System.out.println(s);

		//concat() -Joining strings
		
		String s1="Welcome";
		String s2=" to java";
		String s3=" with automation";
		
		System.out.println(s1+s2); //welcome to java
	    System.out.println(s1.concat(s2));
	    
	    System.out.println(s1+s2+s3);
	    System.out.println(s1.concat(s2).concat(s3));
	    
	    //trim() -remove right and left side spaces
	    
	    s="    automation     ";
	    
	    //string res=s.trim();
	    System.out.println(s.length());//19
		System.out.println(s.trim().length());//10
		
		//charAt() -returns a single char based on index as passed
		
		s="welcome";
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(4));
		
		//contains() -returns boolean vale either trur/false
		System.out.println(s.contains("wel"));//true
		System.out.println(s.contains("Wel"));// false because string are case sensetive
		
		//equals () , equalsIgnoreCase()  -compare 2 strings
		// returns boolean value
		
		s1="WelCome";
		s2="welcome";
		
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		//replace() -replace single/multiple characters in a string
		s="Welcome to selenium automation testing programmed by Rajat";
		
		System.out.println(s.replace('e', 'a'));//Walcoma to salanium automation tasting programmad by Rajat
		System.out.println(s.replace("selenium", "Java"));//Welcome to Java automation testing programmed by Rajat
		
		//substring -to extract substring from main string
		s="welcome";
		System.out.println(s.substring(2,5));//lco     starting index start from 0 like welcome starts from 0123456
		System.out.println(s.substring(0,6));//welcom  ending index start from 1   like welcome starts from 1234567
		
		//split() - divide the string into multiple parts using delimeter
		//should not use as delimeter like * $ ^ ? . + -
		s="abc@gmail.com";
		String a[]=s.split("@");
		
		String b[]=s.split("@");
		
		System.out.println(a[0]);//abc
		System.out.println(a[1]);//gmail.com
		
		//toUpperCase(), toLowerCase()
		
		s="welcome"; //s="welCOME"
		System.out.println(s.toLowerCase());//welcome
		System.out.println(s.toUpperCase());//WELCOME
			
	}

}
