package corejava;
import java.util.Arrays;

public class ArrayDemo {
	
	public static void main (String args[])
	{
		//**Array declaration
		//Way#1 to declare array
		int myArry[]={5,3,1,2,4};
		
		 for (int i=0;i<myArry.length;i++){
			 System.out.println(myArry[i]);
		 }
		 
		//Way#2 to declare array
		 int[] myArry2=new int[5];
		//Way#3 to declare array
		 int myArry3[]=new int[5];
		 myArry2[0]=100;
		 myArry2[1]=200;
					 
		 for (int i=0;i<myArry2.length;i++){
			 System.out.println(myArry2[i]);
		 } 
		//**end of Array declaration
		 
		 //Sorting the array
		 Arrays.sort(myArry);
		 for (int j=0;j<myArry.length;j++){
			 System.out.println("sorting: "+myArry[j]);
		 }
		 
		 //cloning the array
			int[] myClonedArry=myArry.clone();
		 System.out.println("cloning: "+myArry[3]);
		 
		 //multi dimensional array - Q-Java Program to add two matrices
		 int myMultiDimnArray1[][]={{10,11,12},{20,21,22},{30,31,32},{40,41,42}};
		 int myMultiDimnArray2[][]={{1,2,3},{3,4,5},{5,6,7},{7,8,9}};
		 for (int i=0;i<4;i++){
			 for (int j=0;j<3;j++){
				 //System.out.println("MultiDimArray: "+myMultiDimnArray1[i][j]+" ");
				 int sumofMetrices[][]=new int[4][3];
				 sumofMetrices[i][j]=myMultiDimnArray1[i][j]+myMultiDimnArray2[i][j];
				 System.out.println("SumofMetrices: "+sumofMetrices[i][j]+" ");
		 	}
		 }		 
		 
		 
		 //printing the arry
		 System.out.println("Printing: "+myClonedArry.toString());
		 System.out.println("Printing2: "+myMultiDimnArray1.toString());
		 //*******************************************************************
		 //Q-Java Program to print the largest element in an array
		 int myArray5[]={78,103,18,91,88};
		 findLrgstElemInArry(myArray5);
		 
		 //Q-Java Program to print the elements of an array in reverse order
		 reverseArray(myArray5);
		 
		 //Q-Java Program to find nth Largest Number in an Array**
		 int myArray6[]={64,11,35,56,102};
		 findNthLrgstElemInArry(myArray6,5);
		 
		 //Q- Java Program to remove duplicate element in an Array
		 //To remove the duplicate element from array, the array must be in sorted order
		 //https://www.geeksforgeeks.org/java-program-to-remove-duplicate-elements-from-the-array/
		 //Note: We can also use SET, since it will contain only unique values.
		 int myArray7[]={22,35,323,18,65,35,12,323};
		 remDuplctFrmArray(myArray7);
		 
	}//end main[]
	
	
	public static void findLrgstElemInArry(int[] myArry){
		int numLargest=myArry[0];
		for (int i=0;i<(myArry.length-1);i++){
			if (numLargest<myArry[i+1]){
				numLargest=myArry[i+1];
			}
		}
		System.out.println("largest number in array is: "+numLargest);
	}
	
	
	public static void reverseArray(int[] myArry){
		int myrevArray[]=new int[myArry.length]; //initalising the array variable
		for (int i=0;i<myArry.length;i++){
			myrevArray[(myArry.length-1)-i]=myArry[i];		
		}
		
		for (int j=0;j<myrevArray.length;j++){
			System.out.println("reversed array is: "+myrevArray[j]);
		}		
	}
	
	public static void findNthLrgstElemInArry(int[] myArry, int n){
		//first array is sorted and then nth element is identified
		for (int i=0;i<myArry.length;i++){
			for (int j=i+1;j<myArry.length;j++){
				if (myArry[i]<myArry[j]){
					int temp=myArry[i];
					myArry[i]=myArry[j];
					myArry[j]=temp;
				}
			}
		}
		for (int j=0;j<myArry.length;j++){
			System.out.println("Sorted array is: "+myArry[j]);
		}	
		System.out.println(n+ ":th largest elem in array is: "+myArry[n-1]);
	}
	
	public static void remDuplctFrmArray(int[] myArry){
		Arrays.sort(myArry); //array need to be sorted first
		int tempArry[]=new int[myArry.length];
		int j= 0;  
		for (int i=0;i<myArry.length-1;i++){
			if (myArry[i]!=myArry[i+1]){
				tempArry[j++]=myArry[i];
			}			
		}
		for (int k=0;k<j;k++){
			myArry[k]=tempArry[k]; // Changing original array 
			System.out.println("duplicates removed array is: "+myArry[k]);
		}
	}
	
}//end of class
		
