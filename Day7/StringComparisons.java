package Day7;

public class StringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true*/
		
		/*OR//case2
		String s1=new String("welcome");
		String s2=new String("welcome");
			
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2);//false   //compare objects
		System.out.println(s1.equals(s2)); //true //compare value of objects*/
		
		//OR
		
		//case3
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		
		System.out.println(s1);//abc
		System.out.println(s2);//abc
		System.out.println(s3);//abc
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s2==s3);//true
		System.out.println(s2.equals(s3));//true
	}

}
