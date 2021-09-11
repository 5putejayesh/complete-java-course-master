package com.advanced.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp {

	public static void main(String[] args) {
		String FILE_Path="src/com/advanced/filehandling/FileHandlingApp.java";
		
		char[] firstHundredCharacters=new char[100];
	
		try (FileReader fileReader =new FileReader(FILE_Path)){
			fileReader.read(firstHundredCharacters);
			System.out.println(firstHundredCharacters);
			fileReader.read(firstHundredCharacters);
			System.out.println(firstHundredCharacters);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
