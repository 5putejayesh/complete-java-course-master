package com.advanced.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingApp {

	public static void main(String[] args) {

		String FILE_HANDLING_DIRECTORY="src/com/advanced/filehandling/";
		File famousQuotesFile = new File(FILE_HANDLING_DIRECTORY+"famousQuotes.txt");// single forward slash and double
						//	backword slash as it is a special character to create escape sequence.
		try {
			if (famousQuotesFile.createNewFile()) {
				System.out.println("File is created.");
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		famousQuotesFile.renameTo(new File(FILE_HANDLING_DIRECTORY+"famousPersonsQuotes.txt"));
	}
}
