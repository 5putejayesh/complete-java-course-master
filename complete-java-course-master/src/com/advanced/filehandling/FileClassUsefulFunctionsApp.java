package com.advanced.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class FileClassUsefulFunctionsApp {

	public static void main(String[] args) {
		File filehandlingApp=new File("src/com/advanced/filehandling/FileHandlingApp.java");
		
		System.out.println("File Name: "+filehandlingApp.getName());
		System.out.println("Parent Directory: "+filehandlingApp.getParent());
		System.out.println("This File Exists: "+filehandlingApp.exists());
		System.out.println("This file object is a directory: "+filehandlingApp.isDirectory());
		System.out.println("This file object is a directory: "+filehandlingApp.isFile());
		System.out.println("This path name is absolute: "+filehandlingApp.isAbsolute());
		
		System.out.println("This file can be executed: "+filehandlingApp.canExecute());
		System.out.println("This file can be read: "+filehandlingApp.canRead());
		System.out.println("This file can be written: "+filehandlingApp.canWrite());
		
		System.out.println("Get Path: "+filehandlingApp.getPath());
		System.out.println("Get Absolute Path: "+filehandlingApp.getAbsolutePath());
		
		try {
			System.out.println("Get Canonical Path: "+filehandlingApp.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Get URI Path: "+filehandlingApp.toURI());
		
		Calendar lastModified=Calendar.getInstance();
		lastModified.setTimeInMillis(filehandlingApp.lastModified());
		System.out.println("Last Modified: "+lastModified.getTime());
		
		System.out.println("Total Space: "+filehandlingApp.getTotalSpace()+" bytes");
		System.out.println("Free SPpce: "+filehandlingApp.getFreeSpace()+" bytes");
		System.out.println("Usable Space: "+filehandlingApp.getUsableSpace()+" bytes");
		
		filehandlingApp.setReadOnly();
		filehandlingApp.setReadable(true);
		filehandlingApp.setWritable(true);
		filehandlingApp.setExecutable(false);
		
		filehandlingApp.setLastModified(Calendar.getInstance().getTimeInMillis());
		lastModified.setTimeInMillis(filehandlingApp.lastModified());
		System.out.println("New Last Modified: "+lastModified.getTime());
		
	}
}
