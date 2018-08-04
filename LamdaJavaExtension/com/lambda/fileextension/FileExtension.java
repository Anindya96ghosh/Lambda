package com.lambda.fileextension;
import java.io.File;
import java.util.Scanner;

public class FileExtension {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Accepting the path from user
		System.out.println("Enter the directory name along with the path");
		String path=scanner.nextLine();
		File dir=new File(path);
		
		//Accepting the extention from the user
		System.out.println("Enter the extension");
		String ext=scanner.nextLine();
		
		String[] listFile=dir.list((d,s) -> s.toLowerCase().endsWith(ext)); 
		
		for(String file:listFile) {
			System.out.println(file);
		}
		
		scanner.close();
	}
}
