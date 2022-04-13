package corejava;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//SCANNER is best of all 3 . https://stackoverflow.com/questions/17637032/bufferedreader-vs-console-vs-scanner
public class ScannerVsConsolevsBuffRead {
	
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		Console cs=System.console();
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		/*	System.out.println("enter scanner input");
			String str=sc.nextLine();
			int i=sc.nextInt();
			System.out.println("Answer: "  + str +i);
			*/
		
		
		/*String str1=cs.readLine();
		//int j=cs. // cannot read integer type specifically
		char[] ch=cs.readPassword();
		cs.printf(str1);*/
		//Run above console code from command line only/ If you run it from command line you will not get null error.
		
		
		System.out.println("enter buffered reader input");
		String str2=bf.readLine();
		System.out.println("Answer: "  + str2);
		
	}
}
