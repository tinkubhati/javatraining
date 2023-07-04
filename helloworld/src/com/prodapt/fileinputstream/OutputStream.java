package com.prodapt.fileinputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String word = "Good Morning Tinku Bhati.";
   try (FileOutputStream fos = new FileOutputStream("D:\\file\\output.txt")) {
	fos.write(68);
	   fos.write(67);
	   fos.write(69);
	   byte bArray [] = word.getBytes();
	   fos.write(bArray);
	   System.out.println(word);

	   fos.close();
	   
}catch(FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
   
   
   
	}

}
