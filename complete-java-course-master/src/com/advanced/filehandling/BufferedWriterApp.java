package com.advanced.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterApp {

	public static void main(String[] args) {
		
		try(BufferedWriter bufferedBookWrite = new BufferedWriter(
				new FileWriter("src/com/advanced/filehandling/BufferedWriter.txt")))
		{
			bufferedBookWrite.write("Have you lost your mind.?");
			bufferedBookWrite.newLine();
		}
		catch(IOException exception){
			exception.printStackTrace();
		}
	}
}
