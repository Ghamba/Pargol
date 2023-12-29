package assignment5;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Part2 {

    public static void main(String[] args) {
    	// Task 1: Read File
        try {
            readFile("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("++++++++File not found");
        }

        // Task 2: Character Count
        try {
            characterCount("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("+++++++++File not found");
        }
        // Task 3: Write to File
        try {
            writeToOutputFile("output.txt", false);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // Task 4: Append to File
        try {
            appendToFile("output.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // Task 5: // Test the method by writing a custom message to "custom.txt"
        writeStringToFile("custom.txt", "This is a custom message.");
    }
	    // Task 1: Read File
	    public static void readFile(String fileName) throws FileNotFoundException {
	        try (FileInputStream fileInputStream = new FileInputStream(fileName);
	             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

	            System.out.println("Task 1: Read File");
	            String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }
	            System.out.println();

	        } catch (IOException e) {
	        	System.out.println("+++++++++++");
	        }
	    }

	    // Task 2: Character Count
	    public static void characterCount(String fileName) throws FileNotFoundException {
	        try (FileInputStream fileInputStream = new FileInputStream(fileName);
	             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

	            System.out.println("Task 2: Character Count");
	            String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                int charCount = countCharacters(line);
	                System.out.println("Line: " + line + " | Character Count: " + charCount);
	            }
	            System.out.println();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static int countCharacters(String line) {
	        // Excluding whitespaces
	        return line.replaceAll("\\s", "").length();
	    }
	    // Task 3: Write to File
	    public static void writeToOutputFile(String fileName, boolean append) throws FileNotFoundException {
	        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(fileName, append))) {
	            System.out.println("Task 3: Write to File");

	            String[] lines = {
	                    "Hello, this is line 1.",
	                    "Java File I/O is interesting!",
	                    "End of the assignment."
	            };

	            for (String line : lines) {
	                printWriter.println(line);
	            }

	            System.out.println("Content written to " + fileName);
	            System.out.println();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    // Task 4: Append to File
	    public static void appendToFile(String fileName) throws FileNotFoundException {
	        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(fileName, true))) {
	            System.out.println("Task 4: Append to File");

	            String[] lines = {
	                    "Appending new line.",
	                    "File I/O without buffers."
	            };

	            for (String line : lines) {
	                printWriter.println(line);
	            }

	            System.out.println("Content appended to " + fileName);
	            System.out.println();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    // Task 5: Method to write a string to a file using PrintWriter
	    public static void writeStringToFile(String fileName, String content) {
	        try (PrintWriter printWriter = new PrintWriter(fileName)) {
	            // Writing the content to the file
	            printWriter.println(content);
	            System.out.println("Content written to " + fileName);
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + e.getMessage());
	        }
	    }
	}
