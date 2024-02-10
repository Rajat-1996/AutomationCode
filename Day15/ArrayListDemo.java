package Day15;

import java.util.ArrayList;

/*1) Heterogeneous data -allowed
2) Insertion Order -Preserved (Index)
3) Duplicate Elements--Allowed
4) Multiple nulls--allowed*/

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//declaration
		ArrayList mylist=new ArrayList();
		//ArrayList <String>mylist=new ArrayList<String>(); //only strings
		//List mylist=new ArrayList();
		
		//adding data elemnets into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		
		//size of arraylist
		System.out.println(mylist.size()); //7
		System.out.println(mylist);  //[100, 10.5, Welcome, true, 100, null, null]

		//remove value from  arraylist
		mylist.remove(3);
		System.out.println("After removing the 3rd Index Value:" +mylist);  //[100, 10.5, Welcome, 100, null, null]
		
		//Inserting New Element in Middle of the list
		mylist.add(2,"Learning Java");
		System.out.println("After Insertion:"+mylist); // Insert the value in between/any place[100, 10.5, Learning Java, Welcome, 100, null, null]
		
		System.out.println(mylist.get(3));// specific value 
		
		//read all the data from the arraylist
		for (Object x:mylist)
		{
			System.out.println(x);
		}
		
		//For clearing all the data from array list
		mylist.clear();
		System.out.println("After Clearing"+mylist); //[]
		
		 
	}

}
