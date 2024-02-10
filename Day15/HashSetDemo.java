package Day15;

import java.util.HashSet;

/*1) Heterogeneous data -->Allowed
2) Insertion Order --> Not Preserved (Index not supported)
3) Duplicate Elements--> Not Allowed
4) Multiple nulls--> Not allowed* only single null is allowed*/

public class HashSetDemo {

	public static void main(String[] args) {
		//declaration
        HashSet myset=new HashSet();
       //Set myset=new HashSet();
       //HashSet <Integer>myset=new HashSet<Integer>();
        
        myset.add(100);
		myset.add(10.5);
		myset.add("Incredible India");
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);// [null, 100, 10.5, Incredible India] insertion order is not preserved
		
		System.out.println(myset.size()); //4
		
		//remove the value
		System.out.println("Remove the value:" +myset);
		myset.remove(10.5); 					//Remove the value while passing the Value Bcoz Index will not Support  
		System.out.println(myset);				//[null, 100, Incredible India]	
		
		//Insertion is not possible in hashset
		
		// Get Specific Value from Hashset--> not possible 
		
		for (Object x:myset) 
		{
			System.out.println(x);
		}
	}

}
