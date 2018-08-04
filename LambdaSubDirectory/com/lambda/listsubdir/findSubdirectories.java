package com.lambda.listsubdir;

import java.io.File;
import java.util.Scanner;

public class findSubdirectories {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//accepting the path from the user
		System.out.println("Enter the directory path");
		String path=scanner.nextLine();
		
		File dir=new File(path);
		
		//Listing of the subdirectories using ListFiles
		System.out.println("\nUsing ListFiles \n");
		File[] subDirs=dir.listFiles((file) -> file.isDirectory()); 
		System.out.println("List of subdirectories in the given directory is as follows");
		
		for(File file:subDirs) {
			System.out.println(file.getName());
		}
		
		
		//Listing of the subdirectories using Lambda
		System.out.println("\nUsing Lambda \n");
		File[] subDirsMR=dir.listFiles(File::isDirectory); 
		System.out.println("List of subdirectories in the given directory is");
		
		for(File file:subDirsMR) {
			System.out.println(file.getName());
		}
		scanner.close();
	}
}
