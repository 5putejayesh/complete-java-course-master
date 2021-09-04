package com.advanced.filehandling;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassApp {

	public static void main(String[] args) {
		
		String FILE_PATH="src/com/advanced/filehandling/PrintWriter.txt";
		
		Path path=Paths.get(FILE_PATH).toAbsolutePath();
		
		System.out.println("toString: "+path.toString());
		System.out.println("Get File Name: "+path.getFileName());
		System.out.println("Get Name(0) "+path.getName(0));
		System.out.println("Get NameCount: "+path.getNameCount());
		System.out.println("SubPath(0,2): "+path.subpath(0, 2));
		System.out.println("getParent: "+path.getParent());
		System.out.println("getRoot: "+path.getRoot());
		
	}
}
