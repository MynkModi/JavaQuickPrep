package corejava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;

public class StringDemo {
	public static void main(String[] args) {
		//https://www.javatpoint.com/java-string-charat
		
		//declaration type
		String str1="this is a string demo"; 
		String str2="this is a string demo1";  
		String str3=new String("he is going to new york");
		
		//String Comparison
		System.out.println("String Comparison1:"+str1.equalsIgnoreCase(str2) );//compares value
		System.out.println("String Comparison2:"+str1.compareTo(str2));//returns number
		System.out.println("String Comparison3:"+(str1==str2));//compares reference
		
		//String Concat [ '+' or '.concat'  | 'append' for StrBuilder/StrBuffer]
		
		//String methods
		System.out.println("charAt "+str1.charAt(3));
		System.out.println("contains "+str1.contains("demo"));
		char ch[]=new char[10];
		str3.getChars(0, 10, ch, 0);
		for(int i=0;i<ch.length;i++){
			System.out.println("getChars:"+ch[i]); //getChars
		}
		System.out.println("indexOf "+str1.indexOf("demo"));
		System.out.println("last index of "+str1.lastIndexOf(("o")));
		System.out.println("replace "+str3.replace("o", "z"));
		//Q: What's the difference between the java.lang.String methods replace() and replaceAll().ANSWER: latter uses REGEX.
		
		String str4="java string split method by javatpoint"; 
		String str4Split[]=str4.split("\\s");////splits the string based on whitespace
		for(int i=0;i<str4Split.length;i++){
			System.out.println("split:"+str4Split[i]); //split
		}
		//substring important
		System.out.println("substring "+str2.substring(0,4)); //returns this
		System.out.println("substring "+str2.substring(17)); //returns demo1
		
		int num1=100;
		//The java string valueOf() method converts different types of values into string
		System.out.println("string value of "+String.valueOf(num1)+"hundred");
		
		
		StringBuffer strBuff1=new StringBuffer("this is stringbuffer demo");
		System.out.println("StringBuffer "+strBuff1.append(" topic"));
		
		StringBuilder strBuld1=new StringBuilder("this is StringBuilder demo");
		System.out.println("StringBuffer "+strBuld1.append(" topic"));
		
		StringTokenizer st = new StringTokenizer("my name is khan"," ");
		while (st.hasMoreTokens()) {  
		         System.out.println("StringTokenizer:"+st.nextToken());  
		     }  
		
		
		//******************************************
		
		//Q-How to reverse String in Java
		strReverse("reverse this string");
		
		//Q-How to check Palindrome String in Java
		strPalindrome("nitin");
		
		//Q-Java Program to capitalize each word in String
		strCapitalize("this is capitalize demo");
		
		//Q-Java Program to reverse each word in String
		//We can reverse each word of a string by the help of reverse(), split() and substring() methods
		
		//Q-Java String to Date
		try {
			strToDate("12/07/2021");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Q-Java program to check whether two strings are anagram or not
		chkStrAnagram("Mother In Law" ,"Hitler Woman");
		
		//Q-remove a particular character from a string
		rmvStrChar("this is my book",7);
		
		//Q-count occurrences of letter from string
		countOccurrence("count occurance");
	}//main
	
	private static void strReverse(String str1){
		StringBuffer sbf1=new StringBuffer(str1);
		System.out.println("\n String Reverse"+sbf1.reverse());  
	}
	
	private static void strPalindrome(String str1){
		StringBuffer sbf1=new StringBuffer(str1);
		StringBuffer sbf2=sbf1.reverse();
		if (sbf1.equals(sbf2)){
			System.out.println("\n this is palindrome");  
		}	
	}
	
	private static void strCapitalize(String str1){
		String strArr[]=str1.split(" ");
		String strFinalSentence="";
		//for(int i=0;i<strArr.length;i++){
		for(String w:strArr){	
			String strFirstLetter=w.substring(0,1); //imp
			strFirstLetter=strFirstLetter.toUpperCase();
			String strRemainingLetters=w.substring(1);//imp
			w=strFirstLetter+strRemainingLetters;
			strFinalSentence=strFinalSentence+w+" ";
		}
		System.out.println("\n capitalized sentence is:"+strFinalSentence);  
	}
	
	
	private static void strToDate(String str1) throws ParseException{
		Date date1=new SimpleDateFormat("mm/dd/yyyy").parse(str1);
		System.out.println("converted date is:"+date1);
	}
	
	private static void chkStrAnagram(String str1, String str2){
		//Q-how to remove all white spaces from a string in java?
		str1=str1.replaceAll("\\s","").toLowerCase();  // \\s stands for whitespace
		str2=str2.replaceAll("\\s","").toLowerCase();
		
		/*char chArr1[]=new char[str1.length()];
		char chArr2[]=new char[str2.length()];*/
		if (str1.length()==str2.length()){
			/*for (int i=0;i<str1.length();i++){
				chArr1[i]=str1.charAt(i);
			}
			for (int j=0;j<str2.length();j++){
				chArr2[j]=str2.charAt(j);
			}*/
			char chArr1[]=str1.toCharArray();
			char chArr2[]=str2.toCharArray();
			Arrays.sort(chArr1);
			Arrays.sort(chArr2);
			if (Arrays.equals(chArr1, chArr2)){  //using arrays.equal
				System.out.println("is a anagram");
			}
			else{
				System.out.println("equal length but not a anagram");
			}
		}
		else{
			System.out.println("not a anagram");
		}
	}
	
	
	private static void rmvStrChar(String str1, int n){
		str1=str1.substring(0, n-1)+str1.substring(n);
		System.out.println(+n+"th char removed from:"+str1);
	}
	
	
	private static void countOccurrence(String str1){
		str1=str1.replaceAll("\\s+",""); //remove space character from middle as well
		char[] chArr1=str1.toCharArray(); 
		//Character[] chArr1=str1.toCharArray();  - compilation error 
		int counter=1;
		Arrays.sort(chArr1);
		System.out.println("Total chatracters: "+chArr1.length);
		//for (char c:chArr1) {
		for (int i=0;i<chArr1.length;i++){
				if ( (i!=(chArr1.length-1)) && (chArr1[i]==chArr1[i+1]) ) {
					counter++;
				}
				else {
					System.out.println("Char/NoOfOccurrence: "+chArr1[i]+"="+counter);
					counter=1; //reset counter to 1
				}
			
		}
	}
}//class

