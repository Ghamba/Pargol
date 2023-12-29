package assignment5;

	public class Pair<T, P>{ //declaring a generic class that stores a pair of type parameters: so the elements stored will be type T/P 
			private T first; //this variable will store an element of type T
			private P second; //this variable will store an element of type P
			
			//now we create a constructor of generic class Pair to instantiate the variables and take parameters of the types T and P
			public Pair(T first, P second){
			this.first = first;
			this.second = second;
			}
			
			public T getFirst() {
				return first;
			}
			public void setFirst(T first) {
				this.first=first;
			}


			public P getSecond() {
				return second;
			}

			public void setSecond(P second) {
				this.second = second;
			}
			
			@Override
		    public String toString() {
		        return ( first + ", " + second );
			}
		
		public static void main(String[] args) {

			Pair<Integer, String> forPrint = new Pair<>(35, "Ehsan");
			
			
			System.out.println(forPrint.getFirst() + " " + forPrint.getSecond());
			
			Pair<Double, Double> pairDouble = new Pair<>(12.2, 32.1);
			System.out.println(pairDouble.getFirst() + " " + pairDouble.getSecond());
		}
}
