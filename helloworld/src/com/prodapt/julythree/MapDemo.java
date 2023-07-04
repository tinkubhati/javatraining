package com.prodapt.julythree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
      public static void main(String[]args) {
    	  
    	  Map<Key,String> cityMap = new HashMap<Key,String>();
    	  cityMap.put(new Key(1,"NY"),"New York City");
    	  cityMap.put(new Key(2,"NDLS"),"New Delhi");
    	  cityMap.put(new Key(2,"LKO"),"Lucknow");
    	  cityMap.put(new Key(2,"CNBE"),"Kanpur Central");
    	  
    	  System.out.println("Size: ---" + cityMap.size());
    	  
    	  Iterator <Key> iter = cityMap.keySet().iterator();
    	  
    	  while(iter.hasNext()) {
    		  
    		  System.out.println(cityMap.get(iter.next()));
    		  
    	  }
    	  System.out.println("Size after iteration : ---" + cityMap.size());
   	  
      }
}
