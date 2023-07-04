package com.prodapt.assignment.julytwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
            int i, j,len;
         ArrayList<?> list = new ArrayList<>(Arrays.asList("one", "two",75, "three", "four",44,"five", "six","seven","eight","nine"));
             len= list.size();
            System.out.println(list);
            
            
            
            for(i=0;i<len;i++) {
            	for(j=0;j<len;j++) {
            		Collections.swap(list, i, j);
            		System.out.println(list);
            	}
            }

//            Collections.swap(list, 0, 1);
//            System.out.println(list);
//            Collections.swap(list, 0, 2);
//            System.out.println(list);
//            Collections.swap(list, 0, 3);
//            System.out.println(list);
//            Collections.swap(list, 0, 4);
//            System.out.println(list);
//            Collections.swap(list, 0, 5);
//            System.out.println(list);
//            Collections.swap(list, 0, 6);
//            System.out.println(list);
//            Collections.swap(list, 0, 7);
//            System.out.println(list);
//            Collections.swap(list, 0, 8);
//            System.out.println(list);
//            Collections.swap(list, 0, 9);
//
//            System.out.println(list);
//
//            
//            System.out.println("**************************************************************************************");
//            System.out.println(list);
//
//            Collections.swap(list, 4,7);
//
//            System.out.println(list);

            
    }

}
