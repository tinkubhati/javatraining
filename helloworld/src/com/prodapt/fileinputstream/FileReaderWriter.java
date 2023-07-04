package com.prodapt.fileinputstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) {
		
//		 FileWriter fw = null;
		try {
			FileWriter fw; 
			fw= new FileWriter("D:\\file\\writer.txt");
			fw.write("Hello Everyone Hope U had a Nice weekend");
			fw.close();
			
			FileReader fr = new FileReader( "D:\\file\\writer.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.println((char)i);
			}
			fr.close();
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
