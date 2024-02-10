package Day12;

class Test
{
	final int x=100; // constant value -we cannot change the value after putting final keyword
}

public class FinalKeywordDemo {

	public static void main(String[] args) {
	Test t=new Test();
	
    t.x=250;
	System.out.println(t.x);

	}

}
