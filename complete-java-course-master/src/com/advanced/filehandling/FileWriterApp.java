package com.advanced.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {

	public static void main(String[] args) {
		String FILE_Path="src/com/advanced/filehandling/fileWriter.txt";
		
		try (FileWriter bookWrite = new FileWriter(FILE_Path)){
			bookWrite.write("Even you, Brutus?");
			bookWrite.append("\nYes");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
