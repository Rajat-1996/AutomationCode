package Day15;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding Data Pairs to Hashmap
		
		hm.put(101,"Richa");
		hm.put(102,"Riya");
		hm.put(103,"Rina");
		hm.put(104,"Richa");
		hm.put(101,"Richard");   // latest value will import on duplicate key value
		
		System.out.println(hm);  //{101=Richard, 102=Riya, 103=Rina, 104=Richa}
		
		System.out.println(hm.size());//4
		
		//Removing the pair
		hm.remove(103);   // for removing the value you have to enter the key
		System.out.println("After Removing the Key value:"+hm); //{101=Richard, 102=Riya, 104=Richa}
		
		System.out.println(hm.get(102));  // Here 102 is the Key Value i.e: Riya
		
		//Print Only Keys from Hashmap
		System.out.println(hm.keySet()); // [101, 102, 104]
		
		//Print Values From Hashmap
		
		for(Object k:hm.keySet())
		{
			System.out.println(k+"   "+hm.get(k));
		}
		// For clearing all data of Hashmap
		hm.clear();
		System.out.println(hm);// {} No Values
	}

}
