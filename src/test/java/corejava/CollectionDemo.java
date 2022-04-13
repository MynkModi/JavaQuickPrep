package corejava;

import java.util.*;

public class CollectionDemo {
      public static void main(String[] args) { 
    	  methodListInterfaceDemo();
    	  methodQueueInterfaceDemo();
    	  methodSetInterfaceDemo();
    	  methodMapInterfaceDemo();

      }//end of main
      
      //1
      public static void methodListInterfaceDemo(){
    	  /*1)LIST interface is the child interface of Collection interface.
          It inhibits a list type data structure in which we can store the ordered collection of objects.
          It can have duplicate values.
          List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack*/
       
          /*List<String> myArrList=new ArrayList<String>();
          List<String> myLnkdList= new LinkedList<String>();
          List<String> myVctr= new Vector<String>();
          List<String> myStack=new Stack<String>();*/
          
          ArrayList<String> myArrList=new ArrayList<String>();
          LinkedList<String> myLnkdList= new LinkedList<String>();
          Vector<String> myVctr= new Vector<String>();
          Stack<String> myStack=new Stack<String>();

          //*There are various methods in List interface that can be used to insert, delete, and access the elements from the list.
          //1.a)ARRAY LIST
          myArrList.add("ArryList1");
          myArrList.add("ArryList2");
          myArrList.add("ArryList3");
          myArrList.add("ArryList4");
          myArrList.add(4,"ArryList5");
          myArrList.remove(3); // remove
          myArrList.set(2, "setArrList4"); //set
       
          /*for(int i=0;i<myArrList.size();i++){
                System.out.println("ArrayList:"+myArrList.get(i));
          }*/

          Iterator itrArrLst=myArrList.iterator(); 
          while (itrArrLst.hasNext()){
                System.out.println("ArrayList:"+itrArrLst.next());
          }
          System.out.println("ArrayList-Get:"+myArrList.get(2));//get
          Collections.sort(myArrList); //sort the arraylist -**IMP:note the diff how Arrays are sorted using Arrays.sort
           
         //1.b)LINKED LIST
          myLnkdList.add("lnkList1");
          myLnkdList.add("lnkList2");
          myLnkdList.add("lnkList3");
          myLnkdList.remove(1);
          myLnkdList.add(0, "lnkListRandom");
          
          Iterator itrLnkList=myLnkdList.iterator();
          while(itrLnkList.hasNext()){
       	   System.out.println("LinkedList:"+itrLnkList.next()); 
          }
          
          System.out.println("list.get  "+myLnkdList.get(2));
          
          //1.c)VECTOR
          myVctr.add("vctr1");
          myVctr.add("vctr2");
          myVctr.add("vctr3");
          myVctr.remove(1);
          
        /*  Iterator itrVctr=myVctr.iterator();
          while(itrVctr.hasNext()){
       	   System.out.println("Vector:"+itrVctr.next()); 
          }*/
          for (String str:myVctr){
        	  System.out.println("Vector:"+str);  
          }
          
          
          //1.d)STACK
          myStack.add("stack1");
          myStack.push("stack2");
          myStack.push("stack3");
          myStack.pop();
          
          Iterator itrStack=myStack.iterator();
          while(itrStack.hasNext()){
       	   System.out.println("Stack:"+itrStack.next()); 
          }
      }
      
      //2
      public static void methodQueueInterfaceDemo(){
    	/* 2)QUEUE interface maintains the first-in-first-out order. It can be defined as an 
    	  ordered list that is used to hold the elements which are about to be processed. 
    	  There are various classes like PriorityQueue, Deque, and ArrayDeque which 
    	  implements the Queue interface.*/
    	  System.out.println("\n");
    	  //Queue<String> myPrtyQue=new PriorityQueue<String>();
    	  PriorityQueue<String> myPrtyQue=new PriorityQueue<String>();
    	  ArrayDeque<String> myArrDQue=new ArrayDeque<String>();
    	  
    	  //2.a) PRIORITY QUEUE
    	  myPrtyQue.add("PrtyQ1");
    	  myPrtyQue.add("PrtyQ2");
    	  myPrtyQue.add("PrtyQ3");
    	  System.out.println("head"+myPrtyQue.element());
    	  System.out.println("head"+myPrtyQue.peek()); //PEEK -IMPORTANT
    	  System.out.println("iterating the queue elements:");  
    	  Iterator itrPrtQ=myPrtyQue.iterator();
    	  while(itrPrtQ.hasNext()){
          	   System.out.println("PrtQue:"+itrPrtQ.next()); 
             }
    	  myPrtyQue.remove();
    	  myPrtyQue.poll(); //this also removes element.POLL -IMPORTANT
    	  System.out.println("iterating the queue elements:");  
    	  Iterator itrPrtQ2=myPrtyQue.iterator();
    	  while(itrPrtQ2.hasNext()){
          	   System.out.println("PrtQue2:"+itrPrtQ2.next()); 
             }
    	  	  
    	//2.b) DEQUEUE- ARRAY DEQUE
    	  myArrDQue.add("arrrDque1");
    	  myArrDQue.add("arrrDque2");
    	  
    	  System.out.println("\n");
    	  Iterator itrArrDq=myArrDQue.iterator();
    	  while(itrArrDq.hasNext()){
          	   System.out.println("ArrDq:"+itrArrDq.next()); 
             }
    	  
      }
      
      //3
      public static void methodSetInterfaceDemo(){
    	 /* 3) SET Interface in Java is present in java.util package. It extends the 
    	  Collection interface. It represents the unordered set of elements which 
    	  doesn't allow us to store the duplicate items. We can store at most one 
    	  null value in Set. Set is implemented by HashSet, LinkedHashSet, and
    	  TreeSet.*/
    	  System.out.println("\n");
    	  
    	  Set<String> myHashSet = new HashSet<String>();  //3.a
    	  Set<String> myLinkedHashSet = new LinkedHashSet<String>(); //3.b 
    	  Set<String> myTreeSet = new TreeSet<String>(); //3.c
    	  
    	  myHashSet.add("myhshset1");
    	  myHashSet.add("myhshset2");
    	  myHashSet.add("myhshset3");
    	  myHashSet.remove("myhshset2");  //IMP: no indexing in set since SET is an UNORDERED SEQUENCE
    	  
    	  Iterator itrHshSet=myHashSet.iterator();
    	  while(itrHshSet.hasNext()){
         	   System.out.println("HshSet:"+itrHshSet.next()); 
            }
      }
      
      //4
      public static void methodMapInterfaceDemo(){
    	  Map<Integer,String> myHshMp=new HashMap<Integer,String>();
    	  myHshMp.put(100, "Hsmp1");
    	  myHshMp.put(200, "Hsmp2");
    	  myHshMp.put(300, "Hsmp3");
    	  
    	  //traversing the keys only
    	  for(Integer key:myHshMp.keySet()){
    		  System.out.println("Hashmap keys:"+key);
    	  }
    	  
    	  //traversing the values only
    	  for(String value:myHshMp.values()){
    		  System.out.println("Hashmap values:"+value);
    	  }
    	  
    	  //1-traversing the keys and values 
    	  System.out.println("\n first way to traverse keys and values");
    	  for(Map.Entry<Integer, String> entry : myHshMp.entrySet()){
    		  System.out.println("Hashmap key:"+entry.getKey());
    		  System.out.println("Hashmap key:"+entry.getValue());
    	  }
    	  
    	  //2-traversing the keys and values 
    	  System.out.println("\n second way to traverse keys and values");
    	  //Iterator<Map.Entry<Integer, String>> itrHsMp=myHshMp.entrySet().iterator();
    	  Iterator itrHsMp=myHshMp.entrySet().iterator();
    	  while(itrHsMp.hasNext()){
    		  Map.Entry entry1=(Map.Entry)itrHsMp.next();
    		  System.out.println("Hashmap key:"+entry1.getKey());
    		  System.out.println("Hashmap key:"+entry1.getValue());
    	  }
    	  
    	  //3-traversing the keys and values (lambda function works only on java 8 and above)
    	  System.out.println("\n third way to traverse keys and values");
    	  myHshMp.forEach((k, v)-> System.out.println(k + " : "+ (v )));
    	  
    	 // Printing all elements of above HashMap
          System.out.println("\n Created hashmap is" + myHshMp);
          
          
      }
 
}//end of class