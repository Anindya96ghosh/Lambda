package com.lambda.sortfiles;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class SortFilesAndDirectories {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		//creating an Array list  of File type
		ArrayList<File> files=new ArrayList<>();
		
		//Accepting the path from the user
		System.out.println("Enter directory name along with the path");
		String path=scanner.nextLine();
		
		//creation of file on the given path
		File dir=new File(path);
		
		//array of pathnames for files and directories in the directory
		File[] file=dir.listFiles();
		
		//inserts all of the elements in the specified collection into this list
		files.addAll(Arrays.asList(file));
		
		
		Predicate<File> findDirectories = (fileInList) -> fileInList.isDirectory();
		
		
		//printing the directories in sorted order
		System.out.println("Directories in sorted order");
		files.stream().filter(findDirectories).sorted().forEach(System.out::println);
		
		//printing the files in sorted order
		System.out.println("\nFiles in sorted order\n");
		files.stream().filter(findDirectories.negate()).sorted().forEach(System.out::println);
		
		scanner.close();
	}
}
