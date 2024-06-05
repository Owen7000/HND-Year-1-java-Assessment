package assessmentSkeleton;

import java.util.Scanner; // Import the scanner class
import java.io.File; // Import the File class

// description of the class goes here
public class AssessmentTasks {
	// any class-wide variables go here
	Scanner reader = new Scanner(System.in); // Create a reader variable that can be used everywhere else in the program
	int fileSizes[] = {6,150,342,4,17,19,333,234,12,9,7,23}; 
	
	// constructor
	public AssessmentTasks() {
		// any initialisation goes here
	}
	
	// public menu method - allows the user to choose which task to run
	public void Menu() {
		// menu code goes here
		int choice = 0; // Default menu option
		
		do {
			System.out.println("Please select a menu option. Your options are: 1, 2, 3, 4. To exit the app. Choose option 5");
			choice = reader.nextInt();
			reader.nextLine();
			
			switch (choice) {
				case 1: // Task 1 selected
					Task1();
					break;
				
				case 2: // Task 2 selected
					Task2();
					break;
				
				case 3: // Task 3 selected
					Task3();
					break;
				
				case 4: // Task 4 selected
					Task4();
					break;
				
				default: // Any other value selected
					break;
			}
			
		} while (choice != 5);
		
	}
	
	// methods 
	// private methods for each task go here
	// you may implement as many extra methods, or add extra classes, as you please
	
	
	// Find the greatest storage space - Complete
	private void Task1() {
		int largestFileSize = 0;
		
		for (int size : fileSizes) {
			if (size >= largestFileSize) {
				largestFileSize = size;
			}
		}
		
		System.out.printf("The largest file size is: %d%n", largestFileSize);
	}

	// Find how many files sent, total memory size and average file size - Complete 
	private void Task2() {
		int totalMemory = 0;
		int averageFileSize = 0;
		int numberOfFiles = 0;

		for (int size : fileSizes) {
			numberOfFiles ++;
			totalMemory += size;
		}
		
		averageFileSize = totalMemory / numberOfFiles;
		
		System.out.printf("Total Memory Used: %dMB%nAverage File Size: %dMB%n", totalMemory, averageFileSize);
	}
	
	// Create user name - Complete
	private void Task3() {
		System.out.println("What is your first name? "); // Ask for users forename
		String firstName = reader.nextLine(); // Read user input from console
		
		System.out.println("What is your last name? "); //  Ask for users surname
		String lastName = reader.nextLine(); // Read user input from console
		
		String username = firstName.charAt(0) + lastName; // Get first character from first name and concat with surname
		
		System.out.println("Your new username is: " + username); // Inform the user of their new username
	}
	
	// Counting vowels - Complete
	private void Task4() {
		System.out.println("Please enter the phrase, sentance or title you wish to count: "); // Ask the user to enter a string
		String inputString = reader.nextLine().toLowerCase(); // Read the string from the console
		char[] vowels = {'a', 'e', 'i', 'o', 'u'}; // Array containing the vowels as characters
		int[] occurences = {0, 0, 0, 0, 0}; // Array containing the number of occurrences of each vowel
		
		for (char letter  : inputString.toCharArray()) { // For each letter in the input string
			if (letter == vowels[0]) { // If the letter is "a"
				occurences[0] ++; // Add 1 to the first item in the array
				
			} else if (letter == vowels[1]) { // Else, If the letter is "e"
				occurences[1] ++; // Add 1 to the second item in the array
				
			} else if (letter == vowels[2]) { // Else, If the letter is "i"
				occurences[2] ++; // Add 1 to the third item in the array
				
			} else if (letter == vowels[3]) { // Else, If the letter is "o"
				occurences[3] ++; // Add 1 to the fourth item in the array
				
			} else if (letter == vowels[4]) { // Else, If the letter is "u"
				occurences[4] ++; // Add 1 to the fifth item in the array
				
			} else {} // Else, don't do anything
		}
		
		String report = "Number of %c's=%d%nNumber of %c's=%d%nNumber of %c's=%d%nNumber of %c's=%d%nNumber of %c's=%d%n"; // Create dummy report string
		String output = String.format(report, vowels[0], occurences[0], vowels[1], occurences[1], vowels[2], occurences[2], vowels[3], occurences[3], vowels[4], occurences[4]); // Format it with the values
		
		System.out.println(output); // Show it to the user
		
	}
}
