package Day13;

public class DataConversionmethods {

	public static void main(String[] args) {
		//String-->int
		//String s="Welcome"; //Not possible to convert in Number
		/*String s1="10";
		String s2="20";
		
		System.out.println(s1+s2);
		System.out.println(Integer.parseInt(s1)+(Integer.parseInt(s2)));*/

		//String-->double 
		/*String s1="138.90";
		String s2="199.99";
		
		double s1dbl=Double.parseDouble(s1);
		double s2dbl=Double.parseDouble(s2);
		
		System.out.println(s1dbl+s2dbl);*/
		
		//String-->Boolean
		
		/*String s="True";
		
		boolean bool=Boolean.parseBoolean(s);
		System.out.println(bool);*/
		
		//int,double,char,boolean-->String
		
		int a=10;
		double d=25.15;
		char c='A';
		boolean b=false;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(b));
				
		
		
	}

}
