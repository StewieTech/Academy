package com.bptn.course.codingFolder.ExceptionPractice;


import java.util.Scanner ;

//Create a class FileExtensionException here

public class CustomException {
	public static class FileExtensionException extends Exception {
		public FileExtensionException(String message) {
			super(message);
		}
	}

private static void validateFileExtension(String filename) throws FileExtensionException {
 String extensionName = filename.substring(filename.length() -4, filename.length());
 System.out.println(extensionName);
 if (!extensionName.equals(".txt")) {
     throw new FileExtensionException("File doesn't have .txt extension");
 }


}

 public static void main(String[] args) {
     // Write your code below.
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Enter the file name with correct extension i.e. .txt ");
		String fileName = scanner.nextLine();
     validateFileExtension(fileName);
     System.out.println("Correct file name with extension .txt");
	} catch (Exception e) {
     System.out.println("Error: " + e.getMessage());
	} finally {
     // scanner.close();
 }
 }
}



