package assignment5;

import java.util.ArrayList;
import java.util.Arrays;

public class Part1{
	//method that takes an arraylist of any type and prints its elements
	public static <E> void printElements(ArrayList<E> arrlist) {
		for (E elements : arrlist) {
			System.out.println(elements);
		}
	}

	public static void main(String[] args) {

		
	// 1. ArrayList Operations: creating the wordlist arraylist and assigning variables 	
	ArrayList<String> wordlist = new ArrayList<>();
	
	wordlist.add("apple");
	wordlist.add("orange");
	wordlist.add("banana");
	wordlist.add("grape");
//	ArrayList<String> wordlist2 = new ArrayList<>(Arrays.asList("kabab", "ghormeh"));  //to add in one line
	
	// 2. Arraylist Manipulation:
	wordlist.add("pear");// adds to the end
	wordlist.add(0, "pear"); //adds pear at the index 0
	
	wordlist.remove(2);// removes the third element
	
	boolean isthereOrange=wordlist.contains("orange");// check to see if the orange is within arraylist
	
	
	
	
	// testing the variables inside the wordlist array
		System.out.println(wordlist);
		System.out.println(isthereOrange);
		
		
	printElements(wordlist);//testing task 4

	}
	
	
	
}
