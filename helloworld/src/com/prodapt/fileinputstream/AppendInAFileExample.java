package com.prodapt.fileinputstream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class AppendInAFileExample {

	public static void main(String[] args) {
	
	try {	String data = "It's not interesting to learn IO ";
		File file = new File ("D:\\file\\writeFile.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter (file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(data);
		bw.close();

	}catch(FileNotFoundException fnfe) {
		fnfe.printStackTrace();
	}catch(IOException ie) {
		ie.printStackTrace();
	}

}
}
