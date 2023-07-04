package com.prodapt.fileinputstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderAndWriterExample {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter ("D:\\file\\writeFile.txt");
			BufferedWriter buffWriter = new BufferedWriter(fw);
			buffWriter.write("Java provides IO related libraries in java.io packages");
			buffWriter.close();
			fw.close();
			//Reading the file
					
			FileReader fr = new FileReader ("D:\\\\file\\\\writeFile.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			br.close();
			
			
			}catch(FileNotFoundException fnfe){
				fnfe.printStackTrace();
				
			}catch (IOException e) {
				e.printStackTrace();
			}

	}

}
