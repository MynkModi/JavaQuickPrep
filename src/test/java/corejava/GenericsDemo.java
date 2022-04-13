package corejava;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo {

	//Generic Method
	private static <E> void printArray(E[] elementArray) {
		for(E element:elementArray) {
			System.out.println(element);
		}
	}
	
	//Generic Method extends
		private static <E extends Number> void printArrayExtends(E[] elementArray) {
			for(E element:elementArray) {
				System.out.println(element);
			}
		}
	
	//Generic Class
	static class GenericClass <T>{
		public T t;
		
		public void setValue(T t) {
			this.t=t;
		}
		
		public T getValue() {
			return t;
		}
		
	}//end inner class
	
	
	public static void main(String[] args) {	
		Integer[] intArray = { 1, 2, 3, 4, 5 };
	    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	    String[] StrArray= {"One", "Two", "Three"};
	    
	    //Generic Method Demo
	    System.out.println("generic method demo");
	    printArray(intArray);
	    printArray(doubleArray);
	    printArray(charArray);
	    printArray(StrArray);
	    
	    
	    //Generic Method Extends Demo
	    System.out.println("generic method demo");
	    printArrayExtends(intArray);
	    // printArrayExtends(StrArray); // Compilation Error
	    
		GenericClass<Integer> gcObj1=new GenericClass<Integer>();
		GenericClass<String> gcObj2=new GenericClass<String>();
		
		//Generic Class Demo
		gcObj1.setValue(123);
		gcObj2.setValue("String123");
		
		System.out.println("\n generic class demo");
		System.out.println(gcObj1.getValue());
		System.out.println(gcObj2.getValue());
	    
		
		/*The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:
		    T - Type
		    E - Element
		    K - Key
		    N - Number
		    V - Value*/

	}
	 
	
	
	
}
