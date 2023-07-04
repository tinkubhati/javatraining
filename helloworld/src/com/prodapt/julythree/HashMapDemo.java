package com.prodapt.julythree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		 
		HashMap<String,Double> hm = new HashMap<String,Double>();
		hm.put("Tinku", 4234.32);
		hm.put("Roop", null);
		hm.put("Roop", null);
		hm.put("Rohan", 34342.23);
		hm.put(null, 234.23);
		hm.put("Rp", 23.2);
		hm.put("R", 234.234);
		hm.put("Roqwp", 232.234);
		hm.put("Rabi", 456.53);
		
		//Taking a Set and entering the values of this Hashmap  
		Set set = hm.entrySet();
		System.out.println(set);
		System.out.println(hm.keySet());
		System.out.println(hm.get("Tinku"));
		
		//Now taking an iterator and entering the values of set into iterator because a HashMap isnt a part of collection and cant be traversed.
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<String,Double> me = (Map.Entry<String, Double>)itr.next();
			System.out.println(me.getKey() + ":" + me.getValue());
		}

		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		
		System.out.println("*******************************************line 38");	
			//System.out.println(hm.keySet() + ":" + hm.values());
			Set<String> Keys = hm.keySet();
			for(String Key : Keys) {
				System.out.println(Key + ":" + hm.get(Key));
			}
			
			
		System.out.println("****************************************************");
		System.out.println(hm);
		
		
		
		
}
}
