package junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Logic {
	
	//method that returns maximum number  
    public static int findMax(int arr[]){  
        int max=0;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
    
    //method that returns cube of the given number  
    public static int cube(int n){  
        return n*n*n;  
    }  
    //method that returns reverse words   
    public static String reverseWord(String str){  
  
        StringBuilder result=new StringBuilder();  
        StringTokenizer tokenizer=new StringTokenizer(str," ");  
  
        while(tokenizer.hasMoreTokens()){  
        StringBuilder sb=new StringBuilder();  
        sb.append(tokenizer.nextToken());  
        sb.reverse();  
  
        result.append(sb);  
        result.append(" ");  
        }  
        return result.toString();  
    }  
    
    //arraylist
    public static List<String> arrList(int i){
    	ArrayList<List<String>> mainList = new ArrayList<List<String>>();
    	
    	List<String> list= new ArrayList<String>();
    	list.add("one");
    	list.add("two");
    	list.add("three");
    	mainList.add(list);
    	
    	mainList.add(Arrays.asList("four", "five", "six"));
   
    	return mainList.get(i);
    }
    
    
    //exception check
    public  static int throwException(int num) throws Exception{
    	
    	if (num<0){
    		throw new Exception("Amount is invalid");
    	}
    	else{
    		return num;
    	}
    	
    }
}
