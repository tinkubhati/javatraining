package com.prodapt.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee {

	public static void main(String[] args) {
		Emp e = new Emp();
		e.setEmpId(11);
		e.setEmpName("Tinku Bhati");
		System.out.println(e);
		
		//SERIALIZE an object e
		//write an object into a file system
		File file = new File("D:\\file\\file1.txt");
		FileOutputStream fos;
		try {
			fos = new FileOutputStream (file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			fos.close();
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		//DESERIALIZE
		Emp emp;
		try (FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			){
			emp =(Emp)ois.readObject();
			System.out.println("DESERIALIZED OBJECT -------"+emp);
		
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException e1) {
			e1.printStackTrace();
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
	}

}
