package corejava;

import java.util.*;

public class RandomInterviewQs1 {
	
	public static void main(String[] args) {

		//Q1-Check if a String Contains only Alphabets in Java using Regex
		doesStrHvOnlyAlphabets("ABCDEFG1234");
		
		//Q2-check if string contains only digits 
		//https://www.geeksforgeeks.org/how-to-check-if-string-contains-only-digits-in-java/?ref=lbp
		
		//Q3-Write code to filter duplicate elements from an array and print as a list?
		int numArray[]={1,1,2,3,34,4,5,6,6,7,8};
		remDuplictsFrmArray(numArray);
		
		//Q4- Write code to sort the list of strings using Java collection?
		sortStringList();
		
		//Q5-  Write a method to check prime no. in Java?
		isPrimeNum(568);
		
		//Q6-Write a function to reverse a number in Java  //Palindrome number as well?
		reverseNumber(65467);
		
		//Q7-Question-5: Write a Java program to find out the first two max values from an array?
		//Sort the array and then get first two elements
		
		//Q8-Java code to swap two numbers without using a temporary variable
		swapNumbers();
	}//end main
	
	public static void doesStrHvOnlyAlphabets(String str){
		if (str.matches("^[a-zA-Z]*$")) {
			System.out.println("doesStrHvOnlyAlphabets -"+ "yes");
		}
		else{
			System.out.println("doesStrHvOnlyAlphabets -"+ "no");
		}		
	}
	
	
	public static void remDuplictsFrmArray(int numArray[]){
		Set<Integer> myHset=new HashSet<Integer>();
		for(int i:numArray){
			myHset.add(i);
		}
		
		Iterator itrHset=myHset.iterator();
		while (itrHset.hasNext()){
			System.out.println(itrHset.next());
		}
	}
	
	public static void sortStringList(){
		System.out.println("\n");
		List<String> strArrList= new ArrayList<String>();
		strArrList.add("AAA");
		strArrList.add("CCC");
		strArrList.add("BBB");
		
		Collections.sort(strArrList);
		Iterator itrStrArrList=strArrList.iterator();
		while (itrStrArrList.hasNext()){
			System.out.println(itrStrArrList.next());
		}
		
	}
	
	public static void isPrimeNum(int num){
		if ((num%2)==0) {
			System.out.println("\n is prime number");
		}
		else{
			System.out.println("\n not a prime number");
		}		
	}
	
	public static void reverseNumber(int num){
		int reminder, reverse=0;
		while(num!=0){
			reminder=num%10;
			reverse=(reverse*10)+reminder;
			num=num/10;
		}
		System.out.println("\n Reversed Number is:"+reverse);
	}
	
	public static void swapNumbers(){
		int x=10;
		int y=6;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("X&Y" +x+ "&" +y);
				
	}
	
}//end of class

