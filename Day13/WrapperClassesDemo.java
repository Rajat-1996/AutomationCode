package Day13;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		//int a=100;
		//System.out.println(a);
		
		//Integer a=198;
		//System.out.println(a);
        
		byte b=20;
		short s=30;
		int i=40;
		long l=50;
		float f=60.0F;
		double d=70.0D;
		char c='A';
		boolean b2 = true;
		
		//converting primitives into objects: AutoBoxing
		
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		
		System.out.println("Byte Object: " + byteobj);
		System.out.println("Short Object: " + shortobj);
		System.out.println("Integer Object: " + intobj);
		System.out.println("Long Object: " + longobj);
		System.out.println("Float Object: " + floatobj);
		System.out.println("Double Object: " + doubleobj);
		System.out.println("Charcter Object: " + charobj);
		System.out.println("Boolean Object: " + boolobj);
	
	//Converting object to primitives :-Unboxing
	  
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		
		System.out.println("Byte Object: " + byteobj);
		System.out.println("Short Object: " + shortobj);
		System.out.println("Integer Object: " + intobj);
		System.out.println("Long Object: " + longobj);
		System.out.println("Float Object: " + floatobj);
		System.out.println("Double Object: " + doubleobj);
		System.out.println("Charcter Object: " + charobj);
		System.out.println("Boolean Object: " + boolobj);
		
	}	

}
