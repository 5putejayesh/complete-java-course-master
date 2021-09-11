package com.advanced.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreationException {

	public static void main(String[] args) {
		
		createFile("outputFile.txt");
	}
	private static void createFile(String fileName){
		PrintWriter outputFile=null;
		try {
			outputFile =new PrintWriter(new FileWriter(fileName));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			if(outputFile!=null){
				outputFile.close();
				System.out.println("The PrintWriter is closed.");
			}
			else{
				System.out.println("The PrintWriter is not open.");
			}
		}
		System.out.println("This line comes after we try to create a file");
	}
}
