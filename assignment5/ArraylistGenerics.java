package assignment5;

import java.util.ArrayList;

public class ArraylistGenerics {
	
	//method that takes an arraylist of any type and prints its elements
	public static <E> void printElements(ArrayList<E> arrlist) {
		for (E elements : arrlist) {
			System.out.println(elements);
		}
		

	}
	
	public static void main(String[] args) {
		
		ArrayList<Pair<?, ?>> combo = new ArrayList<>();
		Pair<Integer, String> forPrint = new Pair<>(35, "Ehsan");
		Pair<Double, Double> pairDouble = new Pair<>(12.2, 32.1);

		combo.add(forPrint);
		combo.add(pairDouble);

		for (Pair<?, ?> pair : combo) {
//		System.out.println(pair.getFirst() + " " + pair.getSecond());
		System.out.println(pair);
		}
		
//		printElements(combo);
		
	}
}
