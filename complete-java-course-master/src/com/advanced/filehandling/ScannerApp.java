package com.advanced.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		
		String FILE_Path="src/com/advanced/filehandling/FileHandlingApp.java";
		try (Scanner scanner = new Scanner(new File(FILE_Path))){
			/*
			 * Reading file line by line
			 */
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
			/*
			 * Reading file word by word
			 */
			while(scanner.hasNext()){
				System.out.println(scanner.next());
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
	}
}
