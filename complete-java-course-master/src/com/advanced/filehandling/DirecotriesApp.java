package com.advanced.filehandling;

import java.io.File;
import java.util.Arrays;

public class DirecotriesApp {

	public static void main(String[] args) {
		File businessBooksDirectory = new File("Ebboks\\Business");
		if(businessBooksDirectory.mkdirs()){
			System.out.println("The new directory is created.");
		}
		else{
			System.out.println("Can't create the directory");
		}
		
		/*
		 * mkdir()-->Creates directory if and only of parent directory is exists.
		 * mkdirs()-->Creates directory inside parent also create parent directory if not exists.
		 */
		
		businessBooksDirectory.deleteOnExit();//deletes only sub directory /last directory from the specified path.
		File fileHandlingDirectory = new File("src/com/advanced/filehandling/");
		System.out.println("Flies in the file handling directory: ");
		System.out.println(Arrays.toString(fileHandlingDirectory.list()));
		System.out.println(Arrays.toString(fileHandlingDirectory.listFiles()));
	}
}
