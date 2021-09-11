package com.advanced.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterApp {

	public static void main(String[] args) {
		
		String FILE_PATH="src/com/advanced/filehandling/PrintWriter.txt";
		
		try(PrintWriter bookWriter = new PrintWriter(new FileWriter(FILE_PATH,true))) {
			bookWriter.println("even you, Brusts?");
			bookWriter.println(15.5);
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
